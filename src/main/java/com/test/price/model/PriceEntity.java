package com.test.price.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Column;
import javax.persistence.ManyToOne;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import java.io.Serializable;

import java.math.BigDecimal;
import java.time.LocalDateTime;
@Entity
@Setter
@Getter
@Table(name = "Price")
public class PriceEntity extends Auditable<String> implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long idPrice;

    @Column(name = "start_date")
    private LocalDateTime startDate;

    @Column(name = "end_date")
    private LocalDateTime endDate;

    @Column(name = "priority")
    private Long priority;

    @Column(name = "price")
    private BigDecimal price;

    @Column(name = "curr")
    private String curr;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "id_product", nullable = false)
    private ProductEntity idProduct;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "id_brand", nullable = false)
    private BrandEntity idBrand;
}


