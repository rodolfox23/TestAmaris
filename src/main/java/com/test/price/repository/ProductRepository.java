package com.test.price.repository;

import com.test.price.model.ProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ProductRepository extends JpaRepository<ProductEntity, String>
{
    Optional<ProductEntity> findByIdProduct(Long id);
}


