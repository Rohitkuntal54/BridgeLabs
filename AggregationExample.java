
package AssistedProblems;
import java.util.*;

class Book {
    private String title;
    private String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public void display() {
        System.out.println("Book: " + title + " | Author: " + author);
    }
}

class Library {
    private String name;
    private List<Book> books;

    public Library(String name) {
        this.name = name;
        books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void showLibraryBooks() {
        System.out.println("Library: " + name);
        for (Book b : books) {
            b.display();
        }
    }
}

public class AggregationExample {
    public static void main(String[] args) {
        Book b1 = new Book("Java Basics", "James Gosling");
        Book b2 = new Book("Effective Java", "Joshua Bloch");
        Book b3 = new Book("C++ Primer", "Bjarne Stroustrup");

        Library lib1 = new Library("Central Library");
        Library lib2 = new Library("Community Library");

        lib1.addBook(b1);
        lib1.addBook(b2);
        lib2.addBook(b2);
        lib2.addBook(b3);

        lib1.showLibraryBooks();
        lib2.showLibraryBooks();
    }
}