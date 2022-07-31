package com.niit.share.controller;

import com.niit.share.base.response.BaseResponse;
import com.niit.share.utils.ResUtils;
import com.niit.share.utils.SecurityUtils;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.core.userdetails.User;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.Map;

@RestController
@RequestMapping("/security")
public class SecurityController {
    @Resource
    AuthenticationManager authenticationManager;

    @GetMapping("/hello")
    public String hello() {
        return "Hello Security";
    }

    @PostMapping("/login")
    public BaseResponse<User> login(@RequestBody Map<String, String> params) {
        User user = SecurityUtils.login(params.get("username"), params.get("password"), authenticationManager);
        return ResUtils.success(user);
    }
}
