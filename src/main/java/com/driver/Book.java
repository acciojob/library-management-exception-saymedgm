package com.driver;

public class Book {
	private String bookId;
	private String title;
	private boolean isBorrowed;

	public Book(String bookId, String title) {
		this.bookId = bookId;
		this.title = title;
	}

	public String getBookId() {
		return bookId;
	}

	public String getTitle() {
		return title;
	}

	public boolean isBorrowed() {
		return isBorrowed;
	}

	public void setBorrowed(boolean borrowed) {
		isBorrowed = borrowed;
	}
}