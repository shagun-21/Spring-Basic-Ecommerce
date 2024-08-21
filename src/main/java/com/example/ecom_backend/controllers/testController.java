package com.example.ecom_backend.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/api")
@RestController
public class testController {

    @GetMapping("/test")
    public String test(){
        return "running good";
    }
}
