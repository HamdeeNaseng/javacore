package com.java.javacore.dao.hw.template.menu.impl;

import com.java.javacore.dao.hw.template.config.ApplicationContext;
import com.java.javacore.dao.hw.template.menu.Menu;

public class SignOutMenu implements Menu {

    private ApplicationContext context;

    {
        context = ApplicationContext.getInstance();
    }

    @Override
    public void start() {
        printMenuHeader();
        context.setLoggedInUser(null);
        context.getMainMenu().start();
    }

    @Override
    public void printMenuHeader() {
        System.out.println("***** Sign Out *****");
        System.out.println("Have a nice day! Look forward to welcoming back!");
    }

}