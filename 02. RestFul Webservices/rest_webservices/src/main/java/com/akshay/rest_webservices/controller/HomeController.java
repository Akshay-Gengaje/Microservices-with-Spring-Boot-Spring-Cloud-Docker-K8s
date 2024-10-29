package com.akshay.rest_webservices.controller;

import com.akshay.rest_webservices.model.User;
import org.springframework.web.bind.annotation.*;

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

//    http://localhost:8080/requestParam?name=Akshay
    @GetMapping("/requestParam")
    public String requestParam(@RequestParam String name, @RequestParam(required = false, defaultValue = "") String email){
        return "Name - "+name +" Email id - "+email;
    }
}
