package com.test.price.service;

import com.test.price.dto.PriceEndDTO;
import com.test.price.dto.PriceRequestDTO;
import com.test.price.model.BrandEntity;
import com.test.price.model.PriceEntity;
import com.test.price.model.ProductEntity;
import com.test.price.repository.PriceRepository;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.when;

@SpringBootTest
@AutoConfigureMockMvc
@Slf4j
@Disabled
class PriceServiceTest {
    @InjectMocks
    PriceService testPrice;
    @Mock
    PriceRepository repository;

    @Test
    void getPriceProduct_First() {

        PriceRequestDTO request = new PriceRequestDTO();

        request.setIdProduct(35455L);
        request.setIdBrand(1L);

        LocalDate date = LocalDate.parse("2020-06-14");
        LocalTime time = LocalTime.of(10, 00, 00);
        request.setStartDate(LocalDateTime.of(date, time));

        ProductEntity product = new ProductEntity();
        product.setIdProduct(1L);
        BrandEntity brand = new BrandEntity();
        brand.setIdBrand(2L);

        PriceEntity price = new PriceEntity();
        price.setIdProduct(product);
        price.setIdBrand(brand);
        price.setPriority(1L);
        price.setStartDate(LocalDateTime.of(date, time));
        price.setEndDate(LocalDateTime.of(date, time));

        List<PriceEntity> pe = new ArrayList<>();
        pe.add(price);

        when(repository.findAll()).thenReturn(pe);

        when(repository.findByIdPrice(1L)).thenReturn(null);

        List<PriceEndDTO> priceEnd = new ArrayList<>();
        PriceEndDTO priceDTO = new PriceEndDTO();
        priceDTO.setEndDate(LocalDateTime.of(date, time));
        priceEnd.add(priceDTO);

        when(testPrice.getPriceProduct(request)).thenReturn(priceEnd);


    }

    @Test
    void getPriceProduct_Second() {

        PriceRequestDTO request = new PriceRequestDTO();

        request.setIdProduct(35455L);
        request.setIdBrand(1L);

        LocalDate date = LocalDate.parse("2020-06-14");
        LocalTime time = LocalTime.of(16, 00, 00);
        request.setStartDate(LocalDateTime.of(date, time));

        ProductEntity product = new ProductEntity();
        product.setIdProduct(1L);
        BrandEntity brand = new BrandEntity();
        brand.setIdBrand(2L);

        PriceEntity price = new PriceEntity();
        price.setIdProduct(product);
        price.setIdBrand(brand);
        price.setPriority(1L);
        price.setStartDate(LocalDateTime.of(date, time));
        price.setEndDate(LocalDateTime.of(date, time));

        List<PriceEntity> pe = new ArrayList<>();
        pe.add(price);

        when(repository.findAll()).thenReturn(pe);

        when(repository.findByIdPrice(1L)).thenReturn(null);

        List<PriceEndDTO> priceEnd = new ArrayList<>();
        PriceEndDTO priceDTO = new PriceEndDTO();
        priceDTO.setEndDate(LocalDateTime.of(date, time));
        priceEnd.add(priceDTO);

        when(testPrice.getPriceProduct(request)).thenReturn(priceEnd);


    }

    @Test
    void getPriceProduct_Third() {

        PriceRequestDTO request = new PriceRequestDTO();

        request.setIdProduct(35455L);
        request.setIdBrand(1L);

        LocalDate date = LocalDate.parse("2020-06-14");
        LocalTime time = LocalTime.of(21, 00, 00);
        request.setStartDate(LocalDateTime.of(date, time));

        ProductEntity product = new ProductEntity();
        product.setIdProduct(1L);
        BrandEntity brand = new BrandEntity();
        brand.setIdBrand(2L);

        PriceEntity price = new PriceEntity();
        price.setIdProduct(product);
        price.setIdBrand(brand);
        price.setPriority(1L);
        price.setStartDate(LocalDateTime.of(date, time));
        price.setEndDate(LocalDateTime.of(date, time));

        List<PriceEntity> pe = new ArrayList<>();
        pe.add(price);

        when(repository.findAll()).thenReturn(pe);

        when(repository.findByIdPrice(1L)).thenReturn(null);

        List<PriceEndDTO> priceEnd = new ArrayList<>();
        PriceEndDTO priceDTO = new PriceEndDTO();
        priceDTO.setEndDate(LocalDateTime.of(date, time));
        priceEnd.add(priceDTO);

        when(testPrice.getPriceProduct(request)).thenReturn(priceEnd);


    }

    @Test
    void getPriceProduct_Fourth() {

        PriceRequestDTO request = new PriceRequestDTO();

        request.setIdProduct(35455L);
        request.setIdBrand(1L);

        LocalDate date = LocalDate.parse("2020-06-15");
        LocalTime time = LocalTime.of(10, 00, 00);
        request.setStartDate(LocalDateTime.of(date, time));

        ProductEntity product = new ProductEntity();
        product.setIdProduct(1L);
        BrandEntity brand = new BrandEntity();
        brand.setIdBrand(2L);

        PriceEntity price = new PriceEntity();
        price.setIdProduct(product);
        price.setIdBrand(brand);
        price.setPriority(1L);
        price.setStartDate(LocalDateTime.of(date, time));
        price.setEndDate(LocalDateTime.of(date, time));

        List<PriceEntity> pe = new ArrayList<>();
        pe.add(price);

        when(repository.findAll()).thenReturn(pe);

        when(repository.findByIdPrice(1L)).thenReturn(null);

        List<PriceEndDTO> priceEnd = new ArrayList<>();
        PriceEndDTO priceDTO = new PriceEndDTO();
        priceDTO.setEndDate(LocalDateTime.of(date, time));
        priceEnd.add(priceDTO);

        when(testPrice.getPriceProduct(request)).thenReturn(priceEnd);


    }

    @Test
    void getPriceProduct_Fifth() {

        PriceRequestDTO request = new PriceRequestDTO();

        request.setIdProduct(35455L);
        request.setIdBrand(1L);

        LocalDate date = LocalDate.parse("2020-06-16");
        LocalTime time = LocalTime.of(21, 00, 00);
        request.setStartDate(LocalDateTime.of(date, time));

        ProductEntity product = new ProductEntity();
        product.setIdProduct(1L);
        BrandEntity brand = new BrandEntity();
        brand.setIdBrand(2L);

        PriceEntity price = new PriceEntity();
        price.setIdProduct(product);
        price.setIdBrand(brand);
        price.setPriority(1L);
        price.setStartDate(LocalDateTime.of(date, time));
        price.setEndDate(LocalDateTime.of(date, time));

        List<PriceEntity> pe = new ArrayList<>();
        pe.add(price);

        when(repository.findAll()).thenReturn(pe);

        when(repository.findByIdPrice(1L)).thenReturn(null);

        List<PriceEndDTO> priceEnd = new ArrayList<>();
        PriceEndDTO priceDTO = new PriceEndDTO();
        priceDTO.setEndDate(LocalDateTime.of(date, time));
        priceEnd.add(priceDTO);

        when(testPrice.getPriceProduct(request)).thenReturn(priceEnd);


    }
}