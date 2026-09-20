package com.jdbc.realtimescenario.util;

import com.jdbc.realtimescenario.constants.DbConstants;

import java.sql.SQLException;
import java.sql.Statement;

public class InsertOps {

    static void main(String[] args) {

        Statement statement = DBConnection.getStatement();

        try {
            statement.executeUpdate(DbConstants.INSERT_QUERY);
        } catch (SQLException e) {
            System.out.println("Failed to execute statement");
        }

    }
}
