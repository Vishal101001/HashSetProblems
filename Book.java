package com.lmsDay6Ex;

import java.util.ArrayList;

public class Book {
   
    int bookId;
    String bookName;
    String authorName;

    // Parameterized Constructor
    public Book(int bookId, String bookName, String authorName) {
        this.bookId = bookId;
        this.bookName = bookName;
        this.authorName = authorName;
    }

    // Display book details
    public void displayBookDetails() {
        System.out.println("Book ID: " + bookId);
        System.out.println("Book Name: " + bookName);
        System.out.println("Author Name: " + authorName);
        System.out.println("------------------------");
    }

    public static void main(String[] args) {
        // Create an ArrayList to store books
        ArrayList<Book> bookList = new ArrayList<>();

        // Add books to the list
        bookList.add(new Book(101, "The Alchemist", "Paulo Coelho"));
        bookList.add(new Book(102, "To Kill a Mockingbird", "Harper Lee"));
        bookList.add(new Book(103, "1984", "George Orwell"));
        bookList.add(new Book(104, "The Great Gatsby", "F. Scott Fitzgerald"));

        // Display all book details using an advanced for loop
        for (Book book : bookList) {
            book.displayBookDetails();
        }
    }
    }


