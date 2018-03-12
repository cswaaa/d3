package com.example.d3.service.impl;


import com.example.d3.domain.User;

import com.example.d3.repository.UserRepository;
import com.example.d3.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public List<User> list() {
        return userRepository.findAll();
    }

    @Override
    public User add(User user) {
        userRepository.save(user);
        return null;
    }
}
