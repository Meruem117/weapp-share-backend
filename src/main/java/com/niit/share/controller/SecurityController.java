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
    public ModelAndView home() {
        return new ModelAndView("home");
    }

    @GetMapping("/main")
    public ModelAndView main() {
        return new ModelAndView("main");
    }

    @GetMapping("/error")
    public ModelAndView error() {
        return new ModelAndView("error");
    }
}
