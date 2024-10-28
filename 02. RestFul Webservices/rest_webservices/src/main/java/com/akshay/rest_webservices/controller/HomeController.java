package com.akshay.rest_webservices.controller;

import com.akshay.rest_webservices.model.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    @GetMapping("/")
    public String Home(){
        return "Hello World";
    }

    @GetMapping("/user")
    public User user(){
        User user = new User();
        user.setId("1");
        user.setName("Akshay");
        user.setEmailId("akshaysgengaje@gmail.com");
        return user;
    }

    @GetMapping("/user/{id}")
    public String pathVariable(@PathVariable String id){
        return id;
    }
}
