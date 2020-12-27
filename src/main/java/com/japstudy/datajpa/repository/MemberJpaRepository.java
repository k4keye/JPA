package com.japstudy.datajpa.repository;

import com.japstudy.datajpa.entity.Member;
import lombok.Getter;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository
@Getter
public class MemberJpaRepository {
    @PersistenceContext //스프링 컨테이너가 JPA 의 엔티티 메니저를 가져온다.
    private EntityManager em;


    public Member save(Member member)
    {
        em.persist(member);
        return member;
    } //테스트 코드 단축키 Ctrl+Shift+T

    public Member find(Long id)
    {
        return em.find(Member.class,id);
    }
}
