package com.java.javacore.dao.hw.template.storage;

import com.java.javacore.dao.hw.template.enteties.User;

import java.util.List;

public interface UserStoringService {
    void saveUser(User user);

    List<User> loadUsers();
}
