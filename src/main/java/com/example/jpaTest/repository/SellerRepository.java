package com.example.jpaTest.repository;

import com.example.jpaTest.entity.Seller;
import org.springframework.data.repository.CrudRepository;

public interface SellerRepository extends CrudRepository<Seller, Long> {
}
