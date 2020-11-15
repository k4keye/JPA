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
    @Id
    private String id;

    @Column(name ="UserPwd")
    private String pwd;
    @Column(name ="UserName")
    private String name;
    @Column(name ="UserEmail")
    private String email;
    @Enumerated(EnumType.STRING)
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
