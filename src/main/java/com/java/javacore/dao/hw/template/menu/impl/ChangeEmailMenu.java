package com.java.javacore.dao.hw.template.menu.impl;

import com.java.javacore.dao.hw.template.config.ApplicationContext;
import com.java.javacore.dao.hw.template.menu.Menu;

import java.util.Scanner;

public class ChangeEmailMenu implements Menu {
    private ApplicationContext context;

    {
        context = ApplicationContext.getInstance();
    }

    @Override
    public void start() {
        printMenuHeader();
        Scanner sc = new Scanner(System.in);
        String userInput = sc.next();
        context.getLoggedInUser().setEmail(userInput);
        System.out.println("Your email has been successfully changed");
        new MainMenu().start();
    }

    @Override
    public void printMenuHeader() {
        System.out.println("***** CHANGE EMAIL *****");
        System.out.print("Enter new email: ");
    }
}
