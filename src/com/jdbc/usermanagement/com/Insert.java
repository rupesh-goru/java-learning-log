package com.jdbc.usermanagement.com;

import com.jdbc.usermanagement.util.DBConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Insert {
    static void main(String[] args) throws SQLException {


        Connection connection = DBConnection.createConnection();
        /*here we passed 3 ?(question marks)*/
        PreparedStatement preparedStatement = connection.prepareStatement("insert into users values (?,?,?)");
        //preparedStatement.setInt(1st(question mark) ? , user_id)
        preparedStatement.setInt(1,6);
        //preparedStatement.setInt(2nd(question mark) ? , user_name)
        preparedStatement.setString(2,"mylifemyrules");
        //preparedStatement.setInt(3rd(question mark) ? , password)
        preparedStatement.setString(3,"NoPassword");

        preparedStatement.executeUpdate();
        System.out.println("Inserted successfully!");


    }
}
