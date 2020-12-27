package com.japstudy.datajpa.repository;

import com.japstudy.datajpa.entity.Member;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.transaction.annotation.Transactional;

import static org.junit.jupiter.api.Assertions.assertEquals;


@SpringBootTest
@Transactional //JPA의 모든 데이터 변경은 Transactional 안에서 이루어져야한다.

class MemberJpaRepositoryTest {

    @Autowired MemberJpaRepository memberJpaRepository;
    @Test
    public void testMember(){
        Member member = new Member("memberA");
        Member savedMember = memberJpaRepository.save(member);

        Member findMember = memberJpaRepository.find(savedMember.getId());

        assertEquals(findMember.getId(),savedMember.getId());
        assertEquals(findMember.getUsername(),savedMember.getUsername());
    }
}