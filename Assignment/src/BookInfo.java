/*
12. Encapsulation in Real World: Create a class Book with private fields for title,
author, and price. Write methods to encapsulate the fields and add validation that
ensures the price cannot be negative. Then, create a Library class that stores an array
of books and allows adding/removing books using encapsulated methods.
 */



class Book {
    // Private fields
    private String title;
    private String author;
    private double price;

    // Constructor
    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        setPrice(price);  // Use setter to enforce validation
    }

    // Getter for title
    public String getTitle() {
        return title;
    }

    // Setter for title
    public void setTitle(String title) {
        this.title = title;
    }

    // Getter for author
    public String getAuthor() {
        return author;
    }

    // Setter for author
    public void setAuthor(String author) {
        this.author = author;
    }

    // Getter for price
    public double getPrice() {
        return price;
    }

    // Setter for price with validation
    public void setPrice(double price) {
        if (price >= 0) {
            this.price = price;
        } else {
            System.out.println("Price cannot be negative.");
        }
    }

    // Method to display book details
    public String getDetails() {
        return "Title: " + title + ", Author: " + author + ", Price: " + price;
    }
}


class Library {
    private Book[] books;  // Array to store books
    private int count;      // Keep track of the number of books

    // Constructor to initialize the array
    public Library(int capacity) {
        books = new Book[capacity];  // Initialize array with given capacity
        count = 0;
    }

    // Method to add a book to the library
    public void addBook(Book book) {
        if (count < books.length) {
            books[count] = book;
            count++;
            System.out.println(book.getTitle() + " has been added to the library.");
        } else {
            System.out.println("Library is full, cannot add more books.");
        }
    }

    // Method to remove a book by title
    public void removeBook(String title) {
        for (int i = 0; i < count; i++) {
            if (books[i].getTitle().equals(title)) {
                System.out.println(books[i].getTitle() + " has been removed from the library.");
                books[i] = books[count - 1];  // Replace removed book with the last book
                books[count - 1] = null;      // Set the last book to null
                count--;
                return;
            }
        }
        System.out.println("Book not found in the library.");
    }

    // Method to display all books in the library
    public void displayBooks() {
        if (count == 0) {
            System.out.println("Library is empty.");
        } else {
            System.out.println("Books in the library:");
            for (int i = 0; i < count; i++) {
                System.out.println(books[i].getDetails());
            }
        }
    }
}


public class BookInfo {
    public static void main(String[] args) {
        // Create some Book objects
        Book book1 = new Book("1984", "George Orwell", 15.99);
        Book book2 = new Book("To Kill a Mockingbird", "Harper Lee", 10.99);
        Book book3 = new Book("The Catcher in the Rye", "J.D. Salinger", -5.00);  // Invalid price

        // Create a Library with capacity of 5 books
        Library library = new Library(5);

        // Add books to the library
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);  // Price will not be set due to validation

        // Display all books in the library
        library.displayBooks();

        // Remove a book by title
        library.removeBook("1984");

        // Display books after removal
        library.displayBooks();
    }
}


