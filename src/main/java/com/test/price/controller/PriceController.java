package com.test.price.controller;

import com.test.price.dto.PriceDTO;
import com.test.price.dto.PriceEndDTO;
import com.test.price.dto.PriceRequestDTO;
import com.test.price.service.IPriceService;
import lombok.AllArgsConstructor;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@RestController
@RequestMapping("/price")
@AllArgsConstructor
public class PriceController {

    private final IPriceService iPriceService;

    @PostMapping("/details")
    public List<PriceEndDTO> getProductById(@RequestBody PriceRequestDTO request) {
        return iPriceService.getPriceProduct(request);
    }

    @PostMapping
    public ResponseEntity<Void> insertPrice(@RequestBody List<PriceDTO> priceDTO) {
        iPriceService.insertPrice(priceDTO);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }
}
