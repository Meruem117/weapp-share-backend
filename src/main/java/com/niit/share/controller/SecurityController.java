package com.niit.share.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class SecurityController {
    @GetMapping("/hello")
    public String hello() {
        return "Hello";
    }

    @GetMapping("/login")
    public ModelAndView login() {
        return new ModelAndView("login");
    }

    @GetMapping("/home")
    public String home() {
        return "home";
    }

    @GetMapping("/main")
    public String main() {
        return "main";
    }

    @GetMapping("/error")
    public String error() {
        return "error";
    }
}
