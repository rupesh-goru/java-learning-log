package com.jdbc.usermanagement.com;

import com.jdbc.usermanagement.util.DBConnection;

import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class SignUp {

    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your new Username: ");
        String userName = sc.nextLine();

        System.out.println("Enter your Password: ");
        String password = sc.nextLine();

        Statement statement = DBConnection.getStatement();
        try {
            statement.executeUpdate("insert into users(user_name, password) values('" + userName + "','" + password + "')");
            System.out.println("You have signed up successfully!");
        } catch (SQLException e) {
            System.out.println("Username already exists!");
        }


    }
}
