package com.test.price.controller;

import com.test.price.dto.ProductDTO;
import com.test.price.service.IProductService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@RestController
@RequestMapping("/product")
@AllArgsConstructor
public class ProductController {

    private final IProductService iProductService;

    @GetMapping
    public ProductDTO getProductById(@RequestParam Long id) {
        return iProductService.getProductById(id);
    }

    @PostMapping
    public ResponseEntity<Void> insertProduct(@RequestBody List<ProductDTO> productDTO) {
        iProductService.insertProduct(productDTO);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

}
