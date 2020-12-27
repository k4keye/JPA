package com.japstudy.datajpa.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloworldController {
    @GetMapping("/hello-world")
    public String helloWorld(){
        return "Hello World!";
    }
}
