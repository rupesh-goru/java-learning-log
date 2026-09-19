package com.jdbc.dmloperations;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DMLOperations {

    static void main(String[] args) throws ClassNotFoundException, SQLException {

        /*Step1: Register a Driver.*/

        System.out.println("Starting to register a Driver");
        Class.forName("com.mysql.cj.jdbc.Driver");
        System.out.println("Driver registered successfully");

        /*Step2: Creating connection.*/
        //"jdbc:mysql://localhost:3306/databasename"
        String url = "jdbc:mysql://localhost:3306/jdbc";
        String userName = "root";
        String password = "root"; //password should be correct.
        /*.getConnection() [just press ctrl and hover getConnection(); you can see what's it returning.]returns a Connection so we should catch it back using introducing a variable.*/
        Connection connection = DriverManager.getConnection(url, userName, password);
        System.out.println("Connection established successfully");


        /*Step3: Prepare an SQL Query.*/

        String query = "insert into students values(4, 'Tiruttani Subrahmanyam', 100)";

        /*Step4: Create a statement.*/

        Statement statement = connection.createStatement();

        /*Step5: Execute this statement.*/
        statement.executeUpdate(query);

        /*Step6: Closing the resources(not mandatory).*/
        connection.close();
        statement.close();
        System.out.println("Inserted data into students table");






    }
}
