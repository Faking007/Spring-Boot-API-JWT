package com.oocl.felix.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/jwtapi")
public class HelloWorldController {

    @GetMapping("/hello")
    public String sayHello() {
        return "Hello World";
    }
}
