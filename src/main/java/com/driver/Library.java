package com.driver;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Library {
	private Map<String, Book> booksMap;
	private List<Book> borrowedBooks;

	public Library() {
		booksMap = new HashMap<>();
		borrowedBooks = new ArrayList<>();
	}

	public void addBook(Book book) {
		booksMap.put(book.getBookId(), book);
	}

	public void borrowBook(String bookId) throws BookNotFoundException, BookAlreadyBorrowedException {
		if (!booksMap.containsKey(bookId)) {
			throw new BookNotFoundException("Book with ID " + bookId + " not found in the library.");
		}

		Book book = booksMap.get(bookId);

		if (book.isBorrowed()) {
			throw new BookAlreadyBorrowedException("Book with ID " + bookId + " is already borrowed.");
		}

		book.setBorrowed(true);
		borrowedBooks.add(book);
	}

	public void returnBook(String bookId) throws BookNotFoundException, BookNotBorrowedException {
		if (!booksMap.containsKey(bookId)) {
			throw new BookNotFoundException("Book with ID " + bookId + " not found in the library.");
		}

		Book book = booksMap.get(bookId);

		if (!book.isBorrowed()) {
			throw new BookNotBorrowedException("Book with ID " + bookId + " was not borrowed.");
		}

		book.setBorrowed(false);
		borrowedBooks.remove(book);
	}
}