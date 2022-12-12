package com.test.price.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@NoArgsConstructor
@Getter
@Setter
public class PriceDTO {

    private Long idProduct;

    private Long idBrand;

    private LocalDateTime startDate;

    private LocalDateTime endDate;

    private BigDecimal price;

    private String curr;

}


