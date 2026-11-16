package org.example.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class BooksRepository {
    String url = "jdbc:mysql://localhost:3306/Books";
    String name = "root";
    String password = "root123";

    public String createUser() {
        try {
            Connection conn = DriverManager.getConnection(url, name, password);

            String connSql = "create table book(id int AUTO_INCREMENT PRIMARY KEY, title varchar(30),author varchar(30),count int,price int);";


            conn.endRequest();
        } catch (SQLException e) {
            return
        }

    }
}
