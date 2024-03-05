package com.sushil.sociallogin.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    @GetMapping("/")
    public String home() {
        return "Hello, Home!";
    }

    @GetMapping("/secure")
    public String secured() {
        return "Hello, Secured!";
    }
}
