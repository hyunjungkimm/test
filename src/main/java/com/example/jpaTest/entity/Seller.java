package com.example.jpaTest.entity;

import lombok.Data;
import com.example.jpaTest.mappedSuperclass.BaseEntity;

import javax.persistence.Entity;

@Data
@Entity
public class Seller extends BaseEntity {
    private String shopName;
}
