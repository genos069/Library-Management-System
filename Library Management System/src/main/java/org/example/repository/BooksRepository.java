package org.example.repository;

import org.example.entity.Books;

import java.sql.*;
import java.util.Arrays;

public class BooksRepository {
    String url = "jdbc:mysql://localhost:3306/books";
    String name = "root";
    String password = "root123";

//   public String createTable() {
//        try {
//            Connection conn = DriverManager.getConnection(url, name, password);
//
//            String connSql = "create table book(id int AUTO_INCREMENT PRIMARY KEY, title varchar(30),author varchar(30),count int,price int);";
//
//            conn.endRequest();
//        } catch (SQLException e) {
//            return "Table Creation Failed.";
//        }
//        return  "Table Created";
//    }

    public void addBooks(Books book) {
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(url, name, password);
            Statement statement = conn.createStatement();

            String addSql = """
                    insert into Books (title,author,count,price)
                    + values('%s','%s','%d','%d')
                    """.formatted(book.getTitle(), book.getAuthor(), book.getCount(), book.getPrice());

            int result = statement.executeUpdate(addSql);

            if(result == 1){
                System.out.println("Book added successfully");
            }else{
                System.out.println("Book addition Failed");
            }

        } catch (SQLException e) {
            System.out.println("Connection failed");
        } finally {
            try {
                conn.close();
            } catch (Exception e) {
                System.out.println("Closing connection failed");
            }
        }
    }

    public String deleteBook() {
        try {
            Connection conn = DriverManager.getConnection(url, name, password);

            String deleteSql = "delete from Books where age = 99;";

            conn.endRequest();
        } catch (Exception e) {

        }
        return "Record deleted";
    }

    public String updateBook() {
        try {
            Connection conn = DriverManager.getConnection(url, name, password);

            String updateSql = "update Books set age = 99 where customer_id = 1;";

            conn.endRequest();
        } catch (Exception e) {

        }
        return "Record updates";
    }

    public String getBook() {
        try {
            Connection conn = DriverManager.getConnection(url, name, password);

            String getSql = "select * from Books where age = 1;";

            conn.endRequest();
        } catch (Exception e) {

        }
        return "Record obtained";
    }
}
