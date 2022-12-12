package com.test.price.repository;

import com.test.price.model.BrandEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;
public interface BrandRepository extends JpaRepository<BrandEntity, String>
{
    Optional<BrandEntity> findByIdBrand(Long id);
}


