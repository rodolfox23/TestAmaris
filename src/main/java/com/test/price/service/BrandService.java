package com.test.price.service;

import com.test.price.dto.BrandDTO;
import com.test.price.model.BrandEntity;
import com.test.price.repository.BrandRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class BrandService implements IBrandService {

    private final BrandRepository brandRepository;

    @Override
    public BrandDTO getBrandById(long id) {

        Optional<BrandEntity> data = brandRepository.findByIdBrand(id);

        BrandDTO brand = new BrandDTO();

        data.ifPresent(brands -> {
            brand.setIdBrand(brands.getIdBrand());
            brand.setName(brands.getName());
            brand.setDescription(brands.getDescription());
        });

        return brand;
    }

    @Override
    public void insertBrand(List<BrandDTO> brandDTO) {
        brandDTO.forEach(value -> {
            BrandEntity brands = new BrandEntity();
            brands.setName(value.getName());
            brands.setDescription(value.getDescription());
            brandRepository.save(brands);
        });

    }
}


