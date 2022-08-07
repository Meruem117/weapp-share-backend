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
    public List<User> getAll() {
        return userMapper.getAll();
    }

    @Override
    public User getUserById(Integer id) {
        return userMapper.getUserById(id);
    }

    @Override
    public User getUserByName(String name) {
        return userMapper.getUserByName(name);
    }
}
