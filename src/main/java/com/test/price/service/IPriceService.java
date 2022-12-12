package com.test.price.service;

import com.test.price.dto.PriceDTO;
import com.test.price.dto.PriceEndDTO;
import com.test.price.dto.PriceRequestDTO;

import java.util.List;

public interface IPriceService {
     List<PriceEndDTO> getPriceProduct(PriceRequestDTO request);
     void insertPrice(List<PriceDTO> priceDTOS);
}


