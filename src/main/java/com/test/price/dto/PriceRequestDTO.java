package com.test.price.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@NoArgsConstructor
@Getter
@Setter
public class PriceRequestDTO {

    private Long idProduct;

    private Long idBrand;

    private LocalDateTime startDate;

}


