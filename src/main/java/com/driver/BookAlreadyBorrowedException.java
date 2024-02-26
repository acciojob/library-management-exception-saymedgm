package com.driver;

public class BookAlreadyBorrowedException extends Exception {
	public BookAlreadyBorrowedException(String message) {
		// your code goes here
        super(message);
    }
}
