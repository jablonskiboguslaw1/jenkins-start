package com.jablonski.jenkinsstart.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {


    @GetMapping
    public String getHello(){
        return "Hello World";
    }


}
