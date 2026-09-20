package com.jdbc.realtimescenario.constants;

public class DbConstants {

    public static final String DB_URL = "jdbc:mysql://localhost:3306/jdbc";
    public static final String DB_USER_NAME = "root";
    public static final String DB_PASSWORD = "root";

    public static final String INSERT_QUERY = (
            "insert into students values(6, 'Satyabhama', 35)"
            );
    public static final String UPDATE_QUERY = (
            "update students set name = 'Rukmini Krishna' where id = 2"
    );
    public static final String DELETE_QUERY = (
            "DELETE FROM students WHERE MARKS = 96"
    );
}
