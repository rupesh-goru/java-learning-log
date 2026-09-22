package com.jdbc.practice.util;

import com.jdbc.practice.constants.DBConstants;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DBConnection {

        public static Connection createConnection() {
            Connection connection = null;
            try {
                connection = DriverManager.getConnection(
                        DBConstants.DB_URL,
                        DBConstants.DB_USER_NAME,
                        DBConstants.DB_PASSWORD);
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
