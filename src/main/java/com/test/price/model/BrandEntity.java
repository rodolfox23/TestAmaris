package com.test.price.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Column;
import java.io.Serializable;
@Entity
@Setter
@Getter
@Table(name = "brand")
public class BrandEntity extends Auditable<String> implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id_brand", unique = true, nullable = false, updatable = false)
    private Long idBrand;

    @Column(name = "name", updatable = false)
    private String name;

    @Column(name = "description", updatable = false)
    private String description;
}


