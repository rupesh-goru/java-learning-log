package com.jdbc.batchoperations.com;

import com.jdbc.batchoperations.util.DbConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class BatchOperations {

    static void main(String[] args) throws SQLException {

        Connection connection = DbConnection.createConnection();
        PreparedStatement preparedStatement = connection.prepareStatement("insert into students values(?,?,?)");

        preparedStatement.setInt(1, 7);
        preparedStatement.setString(2, "Lokesh Knagaraj");
        preparedStatement.setInt(3, 35);

        /*This will add the above data to a batch.*/
        preparedStatement.addBatch();

        preparedStatement.setInt(1, 8);
        preparedStatement.setString(2, "Wamiqa Gabbi");
        preparedStatement.setInt(3, 69);
        preparedStatement.addBatch();

        preparedStatement.setInt(1, 9);
        preparedStatement.setString(2, "Lovepreet Singh");
        preparedStatement.setInt(3, 90);
        preparedStatement.addBatch();

        /*To execute the batch.*/
        preparedStatement.executeBatch();
        System.out.println("Inserted 3 rows");


    }
}