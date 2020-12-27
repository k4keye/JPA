package com.japstudy.datajpa.repository;

import com.japstudy.datajpa.entity.Member;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
@Transactional
@Rollback(value = false)
class MemberRepositoryTest {
    @Autowired MemberRepository memberRepository;
    @Test
    public void testMember()
    {
        Member member = new Member("memberA");
        Member savedMember = memberRepository.save(member);

        Member findMember = memberRepository.findById(savedMember.getId()).get();
        System.out.println(findMember.getId());
        System.out.println(findMember.getUsername());
        assertEquals(findMember.getId(),savedMember.getId());
        assertEquals(findMember.getUsername(),savedMember.getUsername());
    }

}