package com.java.javacore.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtils {

    private static final String JDBC_MYSQL_HOST = "jdbc:postgres://localhost:33061/";
    private static final String DB_NAME = "learn_it_db";
    private static final String USERNAME = "postgres";
    private static final String PASSWORD = "postgres";

    private DBUtils() {
    }

    public static Connection getConnection() {
        try {
            return DriverManager.getConnection(JDBC_MYSQL_HOST + DB_NAME, USERNAME, PASSWORD);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

}