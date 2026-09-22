package com.jdbc.usermanagement.com;

import com.jdbc.usermanagement.util.DBConnection;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Login {

    static void main(String[] args) throws SQLException {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your Username: ");
        String userName = sc.nextLine();

        System.out.println("Enter your Password: ");
        String password = sc.nextLine();

        Statement statement = DBConnection.getStatement();

        System.out.println("Connected Database: " +
                statement.getConnection().getCatalog());

        String query = "SELECT * FROM users WHERE user_name = '"
                + userName + "' AND password = '" + password + "'";

        System.out.println("Query: " + query);

        ResultSet rs = statement.executeQuery(query);

        if (rs.next()) {
            System.out.println("Logged In ");
        } else {
            System.out.println("Invalid Username or Password");
        }
    }
}