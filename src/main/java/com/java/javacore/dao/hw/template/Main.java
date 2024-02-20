package com.java.javacore.dao.hw.template;

import com.java.javacore.dao.hw.template.menu.Menu;
import com.java.javacore.dao.hw.template.menu.impl.MainMenu;

public class Main {
    public static final String EXIT_COMMAND = "exit";
    public static void main(String[] args) {
        Menu mainMenu = new MainMenu();
        mainMenu.start();
    }

}