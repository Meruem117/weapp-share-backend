package com.niit.share.service.impl;

import com.niit.share.entity.User;
import com.niit.share.mapper.UserMapper;
import com.niit.share.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Resource
    private UserMapper userMapper;

    @Override
    public List<User> findAll() {
        return userMapper.findAll();
    }
}
