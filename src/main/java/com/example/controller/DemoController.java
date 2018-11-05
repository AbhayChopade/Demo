package com.example.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController{

    @RequestMapping("/sample")
    public String getString(){
        return "Hello World!";
    }

    @RequestMapping("/sampled")
    public String getStringAll(){
        return "Hello World!";
    }

}