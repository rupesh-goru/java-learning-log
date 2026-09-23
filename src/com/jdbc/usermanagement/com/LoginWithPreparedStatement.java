package com.jdbc.usermanagement.com;

import com.jdbc.usermanagement.util.DBConnection;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;
import java.sql.PreparedStatement;


public class LoginWithPreparedStatement {

    static void main(String[] args) throws SQLException {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your Username: ");
        String userName = sc.nextLine();

        System.out.println("Enter your Password: ");
        String password = sc.nextLine();

        Connection connection = DBConnection.createConnection();

        /*Prepared Statement
        * this expects a sql query for sure inside it only.
        * whenever you want to pass a value dynamically just use a ? inside query.*/

     PreparedStatement preparedStatement = connection.prepareStatement("select * from users where user_name=? and password=?");

     preparedStatement.setString(1,userName);
     preparedStatement.setString(2, password);

     ResultSet rs = preparedStatement.executeQuery();

        if (rs.next()) {
            System.out.println("Logged in successfully!");
        } else {
            System.out.println("Invalid credentials!");

        }
    }
}


