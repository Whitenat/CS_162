package com.osucascades.white;
import java.util.*;

public class Library {
    String location;
    ArrayList<Book> books;

    // Add the missing implementation to this class
    public Library(String location) {
        books = new ArrayList<>();
        this.location = location;
    }

    void addBook(Book newBook) {

        books.add(newBook);
    }

    static void printOpeningHours() {
        System.out.println("Libraries are open daily from 9am - 5pm");
    }

    void printAddress() {
        System.out.println(location);
    }

    void borrowBook(String title) {
        boolean inLibrary = false;
        for (Book book : books) {
            if (book.title == title) {
                inLibrary = true;
            }
        }
        if (inLibrary) {
            for (Book book : books) {
                if (book.title == title && !book.isBorrowed()) {
                    book.borrowed();
                    System.out.println("You successfully borrowed " + title);
                } else if (book.title == title && book.isBorrowed()) {
                    System.out.println("Sorry, this book is already borrowed.");
                }
            }
        }else{
            System.out.println("Sorry, this book is not in our catalog.");
        }

    }

    void printAvailableBooks() {
        if (books.size() >= 1) {
            for (Book book : books) {
                if (!book.isBorrowed()) {
                    System.out.println(book.getTitle());
                }
            }
        } else {
            System.out.println("No books in catalog");
        }
    }

    void returnBook(String title){
        for(Book book : books){
            if(book.title == title && book.isBorrowed()){
                book.returned();
                System.out.println("You successfully returned " + title);
            }
        }
    }


    public static void main(String[] args) {
// Create two libraries
        Library firstLibrary = new Library("10 Main St.");
        Library secondLibrary = new Library("228 Liberty St.");
// Add four books to the first library
        firstLibrary.addBook(new Book("The Da Vinci Code"));
        firstLibrary.addBook(new Book("Le Petit Prince"));
        firstLibrary.addBook(new Book("A Tale of Two Cities"));
        firstLibrary.addBook(new Book("The Lord of the Rings"));
// Print opening hours and the addresses
        System.out.println("Library hours:");
        printOpeningHours();
        System.out.println();
        System.out.println("Library addresses:");
        firstLibrary.printAddress();
        secondLibrary.printAddress();
        System.out.println();
// Try to borrow The Lords of the Rings from both libraries
        System.out.println("Borrowing The Lord of the Rings:");
        firstLibrary.borrowBook("The Lord of the Rings");
        firstLibrary.borrowBook("The Lord of the Rings");
        secondLibrary.borrowBook("The Lord of the Rings");
        System.out.println();
// Print the titles of all available books from both libraries
        System.out.println("Books available in the first library:");
        firstLibrary.printAvailableBooks();
        System.out.println();
        System.out.println("Books available in the second library:");
        secondLibrary.printAvailableBooks();
        System.out.println();
// Return The Lords of the Rings to the first library
        System.out.println("Returning The Lord of the Rings:");
        firstLibrary.returnBook("The Lord of the Rings");
        System.out.println();

// Print the titles of available from the first library
        System.out.println("Books available in the first library:");
        firstLibrary.printAvailableBooks();
    }
}
