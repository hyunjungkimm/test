package com.example.springTest.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@Entity
public class User {

    @Id
    @Column(name = "id", nullable = false)
    private String id;


}
