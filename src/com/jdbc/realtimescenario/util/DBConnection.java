package com.jdbc.realtimescenario.util;

import com.jdbc.realtimescenario.constants.DbConstants;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DBConnection {

    public static Connection createConnection() {
        Connection connection = null;
        try {
           connection = DriverManager.getConnection(
                    DbConstants.DB_URL,
                    DbConstants.DB_USER_NAME,
                    DbConstants.DB_PASSWORD);
        } catch (SQLException e) {
            System.out.println("Connection Failed! Check output console");
        }
        return connection;
    }

    public static Statement getStatement() {
        Connection connection = createConnection();
        Statement statement = null;
        try {
            statement = connection.createStatement();
        } catch (SQLException e) {
            System.out.println("Failed to create statement");
        }
        return statement;
    }

}
