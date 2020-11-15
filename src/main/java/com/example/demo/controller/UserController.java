package com.example.demo.controller;

import com.example.demo.jpa.MemberType;
import com.example.demo.jpa.User;
import com.example.demo.jpa.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {
    @Autowired
    UserRepository userRepository;

    @GetMapping()
    public void dataSave()
    {
        userRepository.save(User.builder().id("testId").pwd("testPwd")
                .email("vps32@naver.com").name("유저").memberType(MemberType.admin).build());
    }
}
