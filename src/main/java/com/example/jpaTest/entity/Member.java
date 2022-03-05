package com.example.jpaTest.entity;

import lombok.Data;
import com.example.jpaTest.mappedSuperclass.BaseEntity;

import javax.persistence.Entity;

@Data
@Entity
public class Member extends BaseEntity {
    private String email;
}
