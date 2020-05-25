package com.kevin.demo.service;

import com.kevin.demo.domain.user.User;

import java.util.List;

public interface UserService {

    List<User> userList();

    User register(String mobile, String userName);

    User get(int id);
}
