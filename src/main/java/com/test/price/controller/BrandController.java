package com.test.price.controller;

import com.test.price.dto.BrandDTO;
import com.test.price.service.IBrandService;
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
@RequestMapping("/brand")
@AllArgsConstructor
public class BrandController {

    private final IBrandService iBrandService;

    @GetMapping
    public BrandDTO getBrandById(@RequestParam Long id) {
        return iBrandService.getBrandById(id);
    }

    @PostMapping
    public ResponseEntity<Void> insertBrand(@RequestBody List<BrandDTO> brandDTO) {
        iBrandService.insertBrand(brandDTO);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }
}
