package com.example.d3.repository;



import com.example.d3.domain.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface UserRepository {

    List<User> findAll();
    int save(User user);
}
