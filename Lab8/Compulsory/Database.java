/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab8;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Mihnea
 */
public class Database {

    private static final String URL
            = "jdbc:postgresql://localhost:5432/javadb";
    private static final String USER = "postgres";
    private static final String PASSWORD = "admin";
    private static Connection connection;

    private Database() {
        
    }

    public static Connection getConnection() {
       return connection;
    }

    public static void createConnection() {
        try {
            connection = DriverManager.getConnection(URL, USER, PASSWORD);
            connection.setAutoCommit(false);
        } catch (SQLException e) {
            System.err.println(e);
        }
    }

    public static void closeConnection() throws SQLException {
        getConnection().close();
    }
}
