package com.test.price.service;
import com.test.price.dto.BrandDTO;

import java.util.List;
public interface IBrandService {
     BrandDTO getBrandById(long id);
     void insertBrand(List<BrandDTO> brandDTO);
}


