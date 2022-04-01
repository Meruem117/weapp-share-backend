package com.niit.share.controller;

import com.niit.share.entity.User;
import com.niit.share.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    @Resource
    private UserService userService;

    @GetMapping("/all")
    public List<User> findAll() {
        return userService.findAll();
    }
}
