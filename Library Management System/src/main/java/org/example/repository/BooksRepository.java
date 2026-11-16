package org.example.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class BooksRepository {
    String url = "jdbc:mysql://localhost:3306/Books";
    String name = "root";
    String password = "root123";

    public String createTable() {
        try {
            Connection conn = DriverManager.getConnection(url, name, password);

            String connSql = "create table book(id int AUTO_INCREMENT PRIMARY KEY, title varchar(30),author varchar(30),count int,price int);";

            conn.endRequest();
        } catch (SQLException e) {
            return "Table Creation Failed.";
        }
        return  "Table Created";
    }
    public String addBooks() {
        try {
            Connection conn = DriverManager.getConnection(url, name, password);

            String addSql = "insert into Books (id,title,author,count,price)" + "values(1,'game of trones','luffy noob',789,2300);";

            conn.endRequest();
        } catch (SQLException e) {
            return "adding New Books Failed.";
        }
        return  "Row added";
    }
    public String deleteBook(){
        try {
            Connection conn = DriverManager.getConnection(url, name, password);

            String deleteSql = "drop table Books (id,title,author,count,price)" + "values(1,'game of trones','luffy noob',789,2300);";

            conn.endRequest();
        }catch(Exception e){

        }
        return "Record deleted";
    }
}
