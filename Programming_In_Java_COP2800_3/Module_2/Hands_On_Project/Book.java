package Programming_In_Java_COP2800_3.Module_2.Hands_On_Project;

import java.util.ArrayList;

public class Book {
    private String title;
    private String author;
    private String isbn;
    private static ArrayList<Book> bookCollection = new ArrayList<>();

    // Constructor
    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    // Method to add a book to the collection
    public static void addBook(Book book) {
        bookCollection.add(book);
    }

    // Method to remove a book from the collection
    public static void removeBook(Book book) {
        bookCollection.remove(book);
    }

    // Method to display the collection
    public static void displayBooks() {
        for (Book book : bookCollection) {
            System.out.println("Title: " + book.title + ", Author: " + book.author + ", ISBN: " + book.isbn);
        }
    }

    public static void main(String[] args) {
        // Creating book instances
        Book book1 = new Book("1984", "George Orwell", "1234567890");
        Book book2 = new Book("To Kill a Mockingbird", "Harper Lee", "0987654321");

        // Adding books to the collection
        addBook(book1);
        addBook(book2);

        // Displaying books in the collection
        System.out.println("Books in the collection:");
        displayBooks();

        // Removing a book from the collection
        removeBook(book1);

        // Displaying books in the collection after removal
        System.out.println("\nBooks in the collection after removal:");
        displayBooks();
    }
}
