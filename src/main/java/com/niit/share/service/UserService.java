package com.niit.share.service;

import com.niit.share.entity.User;

import java.util.List;

public interface UserService {
    List<User> getAll();

    User getUserById(Integer id);
}
