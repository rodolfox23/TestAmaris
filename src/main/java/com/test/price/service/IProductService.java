package com.test.price.service;

import com.test.price.dto.ProductDTO;
import java.util.List;

public interface IProductService {
    ProductDTO getProductById(long id);
    void insertProduct(List<ProductDTO> productDTO);
}


