package com.test.price.repository;

import com.test.price.model.PriceEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;
public interface PriceRepository extends JpaRepository<PriceEntity, String>
{
    Optional<PriceEntity> findByIdPrice(Long id);
}


