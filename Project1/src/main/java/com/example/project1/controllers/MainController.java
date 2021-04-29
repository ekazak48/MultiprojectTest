package com.example.project1.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    @GetMapping("/helloworld")
    public String helloWorld() {
        return "Hello, world";
    }

}
