package com.test.price.service;

import com.test.price.dto.ProductDTO;
import com.test.price.model.ProductEntity;
import com.test.price.repository.ProductRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class ProductService implements IProductService {
    private final ProductRepository productRepository;

    @Override
    public ProductDTO getProductById(long id) {

        Optional<ProductEntity> data = productRepository.findByIdProduct(id);

        ProductDTO product = new ProductDTO();

        data.ifPresent(products -> {
            product.setIdProduct(products.getIdProduct());
            product.setName(products.getName());
            product.setDescription(products.getDescription());
        });

        return product;
    }
    public void insertProduct(List<ProductDTO> productDTO) {
        productDTO.forEach(value -> {
            ProductEntity products = new ProductEntity();
            products.setName(value.getName());
            products.setDescription(value.getDescription());
            productRepository.save(products);
        });
    }
}


