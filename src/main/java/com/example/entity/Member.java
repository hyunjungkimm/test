package com.example.entity;

import lombok.Data;
import com.example.mappedSuperclass.BaseEntity;

import javax.persistence.Entity;

@Data
@Entity
public class Member extends BaseEntity {
    private String email;
}
