package org.example;

import org.example.repository.BooksRepository;
import org.example.entity.Books;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        BooksRepository book = new BooksRepository();
        //create method call
        book.addBooks(new Books("title","author",1,99));
    }
}