package com.example.authmicroservice.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class TestAuthController {

    @GetMapping("/hello")
    public String firstpage(){
        return "Hello World";
    }
}
