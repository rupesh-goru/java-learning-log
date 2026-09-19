package com.jdbc.dmloperations;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class UpdateDeleteOps {
    static void main(String[] args) throws SQLException, ClassNotFoundException {

        Class.forName("com.mysql.cj.jdbc.Driver");

        Connection connection = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/jdbc",
                "root",
                "root");
/*Update Ops*/
        String query = "update students set marks = 100 where id = 1";
/*Delete Ops*/
        String query2 = "Delete from students where name = 'Md. Riyaz'";
        /*Insert ops*/
        String query3 = "insert into students values(5, 'Devasena', 98)";
        Statement statement = connection.createStatement();
        statement.executeUpdate(query);
        System.out.println("Student marks updated successfully");
        statement.executeUpdate(query2);
        System.out.println("Student data deleted successfully");
        statement.executeUpdate(query3);
        System.out.println("inserted new data successfully");
        statement.close();
        connection.close();


    }
}
