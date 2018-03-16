package com.blog.service;

import com.blog.domain.User;

public interface UserService {

    public User findByEmail(String email);
}
