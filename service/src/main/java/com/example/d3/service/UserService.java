package com.example.d3.service;




import com.example.d3.domain.User;

import java.util.List;

public interface UserService {

    List<User> list();
    User add(User user);
}
