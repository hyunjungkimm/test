package com.example.jpaTest;

import com.example.jpaTest.entity.Member;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import com.example.jpaTest.repository.MemberRepository;
import com.example.jpaTest.repository.SellerRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MemberRepositoryTest {
    @Autowired
    private MemberRepository memberRepository;
    @Autowired
    private SellerRepository sellerRepo;

    @Test
    @DisplayName("엔티티 생성")
    public void TestInsert(){
        Member member = new Member();
        member.setName("kim");
        member.setEmail("kim111@gmial.com");
        memberRepository.save(member);
    }
}
