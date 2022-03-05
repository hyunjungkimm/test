package com.example.jpaTest.repository;

import com.example.jpaTest.entity.Member;
import org.springframework.data.repository.CrudRepository;

public interface MemberRepository extends CrudRepository<Member,Long> {
}
