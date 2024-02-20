package com.java.javacore.dao.hw.template.services;

import com.java.javacore.dao.hw.template.enteties.User;

import java.util.List;

public interface UserManagementService {
    String registerUser(User user);

    List<User> getUsers();

    User getUserByEmail(String userEmail);
}
