package com.example.demo.jpa;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserTest {
    @Autowired
    UserRepository userRepository;
    @Test
    public void test()
    {
    }

    @Test
    public void dataSave()
    {
        userRepository.save(User.builder().id("testId").pwd("testPwd")
                .email("vps32@naver.com").name("유저").memberType(MemberType.admin).build());

    }
}
