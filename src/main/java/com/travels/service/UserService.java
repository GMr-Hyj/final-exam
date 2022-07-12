package com.travels.service;

import com.travels.entity.User;

public interface UserService {
    void register(User user);
    User login(User user);
}
