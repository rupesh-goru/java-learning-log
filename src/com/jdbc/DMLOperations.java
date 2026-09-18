package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DMLOperations {

    static void main(String[] args) throws ClassNotFoundException, SQLException {

        /*Step1: Register a Driver.*/

        System.out.println("Starting to register a Driver");
        Class.forName("com.mysql.cj.jdbc.Driver");
        System.out.println("Driver registered successfully");

        /*Step2: Creating connection.*/

        String url = "jdbc:mysql://localhost:3306/";
        String userName = "root";
        String password = "root"; //password should be correct.
        /*.getConnection() [just press ctrl and hover getConnection(); you can see what's it returning.]returns a Connection so we should catch it back using introducing a variable.*/
        Connection connection = DriverManager.getConnection(url, userName, password);
        System.out.println("Connection established successfully");






    }
}
