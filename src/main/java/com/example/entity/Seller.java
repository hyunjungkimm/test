package com.example.entity;

import lombok.Data;
import com.example.mappedSuperclass.BaseEntity;

import javax.persistence.Entity;

@Data
@Entity
public class Seller extends BaseEntity {
    private String shopName;
}
