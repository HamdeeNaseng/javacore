package com.java.javacore.dao.hw.template.menu.impl;

import com.java.javacore.dao.hw.template.config.ApplicationContext;
import com.java.javacore.dao.hw.template.enteties.User;
import com.java.javacore.dao.hw.template.enteties.impl.DefaultUser;
import com.java.javacore.dao.hw.template.menu.Menu;
import com.java.javacore.dao.hw.template.services.UserManagementService;
import com.java.javacore.dao.hw.template.services.impl.DefaultUserManagementService;

import java.util.Scanner;

public class SignUpMenu implements Menu {

    private UserManagementService userManagementService;
    private ApplicationContext context;

    {
        userManagementService = DefaultUserManagementService.getInstance();
        context = ApplicationContext.getInstance();
    }

    @Override
    public void start() {
        printMenuHeader();

        Scanner sc = new Scanner(System.in);
        System.out.print("Please, enter your first name: ");
        String firstName = sc.next();
        System.out.print("Please, enter your last name: ");
        String lastName = sc.next();
        System.out.print("Please, enter your password: ");
        String password = sc.next();
        System.out.print("Please, enter your email: ");

        sc = new Scanner(System.in);
        String email = sc.nextLine();

        userManagementService.getUsers(); // this is needed to load all users for proper ID generation
        User user = new DefaultUser(firstName, lastName, password, email);

        String errorMessage = userManagementService.registerUser(user);
        if (errorMessage == null || errorMessage.isEmpty()) {
            context.setLoggedInUser(user);
            System.out.println("New user is created");
        } else {
            System.out.println(errorMessage);
        }

        context.getMainMenu().start();
    }

    @Override
    public void printMenuHeader() {
        System.out.println("***** SIGN UP *****");
    }

}
