package com.driver;

import java.util.Scanner;

public class LibraryManagementSystem {
	  public static void main(String[] args) {
	        Library library = new Library();
	        library.addBook(new Book("B001", "Introduction to Java Programming"));
	        library.addBook(new Book("B002", "Data Structures and Algorithms"));
	        library.addBook(new Book("B003", "Design Patterns"));

	        Scanner scanner = new Scanner(System.in);
	        while (true) {
	            System.out.println("\n1. Borrow a book");
	            System.out.println("2. Return a book");
	            System.out.println("3. Exit");
	            System.out.print("Enter your choice: ");
	            int choice = scanner.nextInt();
	            scanner.nextLine(); // Consume the newline character

	            if (choice == 1) {
	                System.out.print("Enter book ID to borrow: ");
	                String bookId = scanner.nextLine();
	                try {
	                    library.borrowBook(bookId);
	                    System.out.println("Book with ID " + bookId + " is borrowed successfully.");
	                } catch (BookNotFoundException | BookAlreadyBorrowedException e) {
	                    System.out.println(e.getMessage());
	                }
	            } else if (choice == 2) {
	                System.out.print("Enter book ID to return: ");
	                String bookId = scanner.nextLine();
	                try {
	                    library.returnBook(bookId);
	                    System.out.println("Book with ID " + bookId + " is returned successfully.");
	                } catch (BookNotFoundException | BookNotBorrowedException e) {
	                    System.out.println(e.getMessage());
	                }
	            } else if (choice == 3) {
	                break;
	            } else {
	                System.out.println("Invalid choice. Please try again.");
	            }
	        }
	        scanner.close();
	    }
}
