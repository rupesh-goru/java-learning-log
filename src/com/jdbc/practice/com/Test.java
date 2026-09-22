package com.jdbc.practice.com;

import com.jdbc.practice.util.DBConnection;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

public class Test {

    static void main(String[] args) throws SQLException {

        Statement statement = DBConnection.getStatement();

        ResultSet resultSet = statement.executeQuery("select * from students");

        /*If we don't know how many columns are there; for that only we have meta data--->*/
        //metadata(data above data) - resultSet.getMetaData();

        //it stores in the ResultSetMetaData
        ResultSetMetaData metaData = resultSet.getMetaData();
        //to get the column count.-metaData.getColumnCount()
        System.out.println(metaData.getColumnCount());

        //to get column names.metaData.getColumnName(column index)
        System.out.println(metaData.getColumnName(1));
        System.out.println(metaData.getColumnName(2));
        System.out.println(metaData.getColumnName(3));

        //to get the column type.-metaData.getColumnTypeName(column index)
        /*it gives sql types of dataType*/
        System.out.println(metaData.getColumnTypeName(1));
        System.out.println(metaData.getColumnTypeName(2));
        System.out.println(metaData.getColumnTypeName(3));

        //to get the table name.-metaData.getTableName(any column index you can pass here)
        System.out.println(metaData.getTableName(1));


        while (resultSet.next()){

            System.out.println(resultSet.getInt(1) + " " + resultSet.getString(2) + " " + resultSet.getInt(3));




        }



    }
}
