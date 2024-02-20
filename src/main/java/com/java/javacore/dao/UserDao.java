package com.java.javacore.dao;

import com.java.javacore.dao.dto.UserDto;

public interface UserDao {

    UserDto getUserById(int id);
    UserDto getUserByEmail(String email);
    void saveUser(UserDto user);

}