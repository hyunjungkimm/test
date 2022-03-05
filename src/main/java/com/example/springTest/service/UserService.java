package com.example.springTest.service;

import com.example.springTest.entity.User;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    public User retrieveUserInfo(User user) {
        return user;
    }

    public User retrieveUserInfo(String user) {
        User user1 = new User();
        user1.setId(user);
        return user1;
    }
}
