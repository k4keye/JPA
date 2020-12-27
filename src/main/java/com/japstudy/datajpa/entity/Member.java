package com.japstudy.datajpa.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Getter
public class Member {
    @Id
    @GeneratedValue
    private  Long id;
    private String username;

    protected Member() {
    } //엔티티는 기본 생성자가 있어야한다
    //또한 private 는 사용하면 안된다. 프록시 기술을 사용할때 문제가 생김
    public Member(String username) {
        this.username = username;
    }
}
