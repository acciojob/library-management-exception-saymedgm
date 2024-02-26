package com.driver;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Library {
	 private Map<String, Book> booksMap;
	    private List<Book> borrowedBooks;

	    public Library() {
	        // your code goes here
	    }

	    public void addBook(Book book) {
	        // your code goes here
	    }

	    public void borrowBook(String bookId) throws BookNotFoundException, BookAlreadyBorrowedException {
	       // your code goes here
	    }

	    public void returnBook(String bookId) throws BookNotFoundException, BookNotBorrowedException {
	        // your code goes here
	    }
}
