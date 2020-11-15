package com.example.demo.jpa;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
@Getter
@Setter
@Entity
@NoArgsConstructor
public class User {
    @Id //PK 지정
    private String id;

    @Column(name ="UserPwd" , nullable = false) //컬럼 UserPwd 에 변수 pwd 를 매핑한다 , null을 허용하지않는다.
    private String pwd;
    @Column(name ="UserName" , nullable = false)
    private String name;
    @Column(name ="UserEmail")
    private String email;
    @Enumerated(EnumType.STRING) //enum 을 적용시키는데 저장할때 문자열로 저장한다.
    private MemberType memberType;

    @Builder
    public User(String id , String pwd ,String name, String email,MemberType memberType){
        this.id = id ;
        this.pwd =pwd;
        this.name =name;
        this.email = email;
        this.memberType = memberType;
    }
}
