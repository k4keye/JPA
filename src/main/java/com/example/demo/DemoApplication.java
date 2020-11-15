package com.example.demo;

import com.example.demo.jpa.MemberType;
import com.example.demo.jpa.User;
import com.example.demo.jpa.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {


	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);


	}

}
