package com.java.javacore.dao.hw.template.menu.impl;

import com.java.javacore.dao.hw.template.config.ApplicationContext;
import com.java.javacore.dao.hw.template.enteties.User;
import com.java.javacore.dao.hw.template.menu.Menu;
import com.java.javacore.dao.hw.template.services.UserManagementService;
import com.java.javacore.dao.hw.template.services.impl.DefaultUserManagementService;

import java.util.List;

public class CustomerListMenu implements Menu {

    private ApplicationContext context;
    private UserManagementService userManagementService;

    {
        userManagementService = DefaultUserManagementService.getInstance();
        context = ApplicationContext.getInstance();
    }

    @Override
    public void start() {
        printMenuHeader();
        List<User> users = userManagementService.getUsers();

        if (users == null || users.size() == 0) {
            System.out.println("Unfortunately, there are no customers.");
        } else {
            for (User user : users) {
                System.out.println(user);
            }
        }
        context.getMainMenu().start();
    }

    @Override
    public void printMenuHeader() {
        System.out.println("***** USERS *****");
    }

}