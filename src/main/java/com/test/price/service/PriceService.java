package com.test.price.service;

import com.test.price.dto.PriceDTO;
import com.test.price.dto.PriceEndDTO;
import com.test.price.dto.PriceRequestDTO;
import com.test.price.model.BrandEntity;
import com.test.price.model.PriceEntity;
import com.test.price.model.ProductEntity;
import com.test.price.repository.BrandRepository;
import com.test.price.repository.PriceRepository;
import com.test.price.repository.ProductRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class PriceService implements IPriceService {

    private final PriceRepository priceRepository;

    private final ProductRepository productRepository;

    private final BrandRepository brandRepository;

    @Override
    public void insertPrice(List<PriceDTO> priceDTO) {

        priceDTO.forEach(pri -> {
            PriceEntity prices = new PriceEntity();

            Optional<ProductEntity> product = productRepository.findByIdProduct(pri.getIdProduct());
            product.ifPresent(prod -> {
                ProductEntity id = new ProductEntity();
                id.setIdProduct(prod.getIdProduct());
                prices.setIdProduct(id);
            });

            Optional<BrandEntity> brand = brandRepository.findByIdBrand(pri.getIdBrand());
            brand.ifPresent(bran -> {
                BrandEntity id = new BrandEntity();
                id.setIdBrand(bran.getIdBrand());
                prices.setIdBrand(id);
            });

            prices.setStartDate(pri.getStartDate());
            prices.setEndDate(pri.getEndDate());
            prices.setPriority(0l);
            prices.setPrice(pri.getPrice());
            prices.setCurr(pri.getCurr());

            priceRepository.save(prices);

        });
    }

    @Override
    public List<PriceEndDTO> getPriceProduct(PriceRequestDTO request) {

        List<PriceEntity> price = priceRepository.findAll();
        List<PriceEndDTO> priceEnd = new ArrayList<>();

        price.stream().filter(x -> x.getStartDate().
                        compareTo(request.getStartDate()) <= 0 &&
                        x.getEndDate().compareTo(request.getStartDate()) >= 0 && x.getIdProduct()
                        .getIdProduct().intValue()
                        == request.getIdProduct().intValue()
                        && x.getIdBrand().
                        getIdBrand().intValue() == request.getIdBrand().intValue()).
                forEach(value ->
                {

                    PriceEndDTO priceAdd = new PriceEndDTO();

                    if (value.getPriority().intValue() == 0) {
                        Optional<PriceEntity> update = priceRepository.findByIdPrice(value.getIdPrice());
                        update.ifPresent(prices -> {
                            prices.setPriority(1L);
                            priceRepository.save(prices);

                            priceAdd.setIdProduct(prices.getIdProduct().getIdProduct());
                            priceAdd.setIdBrand(prices.getIdBrand().getIdBrand());
                            priceAdd.setStartDate(prices.getStartDate());
                            priceAdd.setEndDate(prices.getEndDate());
                            priceAdd.setPrice(prices.getPrice());

                        });
                    } else if (value.getPriority().intValue() > 0) {

                        priceAdd.setIdProduct(value.getIdProduct().getIdProduct());
                        priceAdd.setIdBrand(value.getIdBrand().getIdBrand());
                        priceAdd.setStartDate(value.getStartDate());
                        priceAdd.setEndDate(value.getEndDate());
                        priceAdd.setPrice(value.getPrice());

                    }
                    priceEnd.add(priceAdd);

                });

        return priceEnd;

    }

}


