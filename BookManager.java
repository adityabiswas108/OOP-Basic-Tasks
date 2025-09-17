import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

// Book class with attributes
class Book {
    private String title;
    private String author;
    private String isbn;

    // Constructor
    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    // Getters
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getIsbn() {
        return isbn;
    }

    // toString method for displaying book info
    @Override
    public String toString() {
        return "Book [Title: " + title + ", Author: " + author + ", ISBN: " + isbn + "]";
    }
}

// Manager class to handle the collection of books
public class BookManager {
    private List<Book> books;

    // Constructor
    public BookManager() {
        books = new ArrayList<>();
    }

    // Add a book
    public void addBook(Book book) {
        books.add(book);
        System.out.println("Book added: - BookManager.java:51" + book);
    }

    // Remove a book by ISBN
    public boolean removeBookByIsbn(String isbn) {
        Iterator<Book> iterator = books.iterator();
        while (iterator.hasNext()) {
            Book b = iterator.next();
            if (b.getIsbn().equals(isbn)) {
                iterator.remove();
                System.out.println("Book removed: - BookManager.java:61" + b);
                return true;
            }
        }
        System.out.println("No book found with ISBN: - BookManager.java:65" + isbn);
        return false;
    }

    // List all books
    public void listBooks() {
        if (books.isEmpty()) {
            System.out.println("No books in the collection. - BookManager.java:72");
        } else {
            System.out.println("Books in collection: - BookManager.java:74");
            for (Book b : books) {
                System.out.println(b);
            }
        }
    }

    // Main method for testing
    public static void main(String[] args) {
        BookManager manager = new BookManager();
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {
            System.out.println("\n Book Manager Menu - BookManager.java:88");
            System.out.println("1. Add Book - BookManager.java:89");
            System.out.println("2. Remove Book by ISBN - BookManager.java:90");
            System.out.println("3. List All Books - BookManager.java:91");
            System.out.println("4. Exit - BookManager.java:92");
            System.out.print("Choose an option: - BookManager.java:93");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter title: - BookManager.java:100");
                    String title = scanner.nextLine();
                    System.out.print("Enter author: - BookManager.java:102");
                    String author = scanner.nextLine();
                    System.out.print("Enter ISBN: - BookManager.java:104");
                    String isbn = scanner.nextLine();
                    Book book = new Book(title, author, isbn);
                    manager.addBook(book);
                    break;

                case 2:
                    System.out.print("Enter ISBN of the book to remove: - BookManager.java:111");
                    String removeIsbn = scanner.nextLine();
                    manager.removeBookByIsbn(removeIsbn);
                    break;

                case 3:
                    manager.listBooks();
                    break;

                case 4:
                    exit = true;
                    System.out.println("Exiting Book Manager. - BookManager.java:122");
                    break;

                default:
                    System.out.println("Invalid option. Try again. - BookManager.java:126");
            }
        }

        scanner.close();
    }
}
