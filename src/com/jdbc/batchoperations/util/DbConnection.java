package com.jdbc.batchoperations.util;

import com.jdbc.batchoperations.constants.DbConstants;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DbConnection {
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



}
