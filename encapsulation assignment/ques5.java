interface Reservable {
    void reserveItem(String borrowerName);
    boolean checkAvailability();
}

abstract class LibraryItem {
    private String itemId;
    private String title;
    private String author;

    public LibraryItem(String id, String title, String author) {
        this.itemId = id;
        this.title = title;
        this.author = author;
    }

    
    public String getItemId() { return itemId; }
    public String getTitle() { return title; }
    public String getAuthor() { return author; }

    public void getItemDetails() {
        System.out.println("ID: " + itemId + ", Title: " + title + ", Author: " + author);
    }

    public abstract int getLoanDuration(); // in days
}

class Book extends LibraryItem implements Reservable {
    private boolean available = true;
    private String borrower;

    public Book(String id, String title, String author) {
        super(id, title, author);
    }

    @Override
    public int getLoanDuration() { return 14; } 
    @Override
    public void reserveItem(String borrowerName) {
        if (available) {
            borrower = borrowerName;
            available = false;
            System.out.println(borrower + " reserved the book: " + getTitle());
        } else System.out.println(getTitle() + " is already reserved.");
    }

    @Override
    public boolean checkAvailability() { return available; }
}


class Magazine extends LibraryItem implements Reservable {
    private boolean available = true;
    private String borrower;

    public Magazine(String id, String title, String author) {
        super(id, title, author);
    }

    @Override
    public int getLoanDuration() { return 7; } // 1 week

    @Override
    public void reserveItem(String borrowerName) {
        if (available) {
            borrower = borrowerName;
            available = false;
            System.out.println(borrower + " reserved the magazine: " + getTitle());
        } else System.out.println(getTitle() + " is not available.");
    }

    @Override
    public boolean checkAvailability() { return available; }
}
class DVD extends LibraryItem implements Reservable {
    private boolean available = true;
    private String borrower;

    public DVD(String id, String title, String author) {
        super(id, title, author);
    }

    @Override
    public int getLoanDuration() { return 3; } // 3 days

    @Override
    public void reserveItem(String borrowerName) {
        if (available) {
            borrower = borrowerName;
            available = false;
            System.out.println(borrower + " reserved the DVD: " + getTitle());
        } else System.out.println(getTitle() + " is already reserved.");
    }

    @Override
    public boolean checkAvailability() { return available; }
}


public class ques5 {
    public static void main(String[] args) {
        LibraryItem[] items = {
            new Book("B101", "Java Programming", "James Gosling"),
            new Magazine("M202", "Tech Weekly", "John Doe"),
            new DVD("D303", "Inception", "Christopher Nolan")
        };

       
        for (LibraryItem item : items) {
            item.getItemDetails();
            System.out.println("Loan Duration: " + item.getLoanDuration() + " days");

            Reservable r = (Reservable) item;
            System.out.println("Available: " + r.checkAvailability());
            r.reserveItem("Alice");
            System.out.println("Available after reservation: " + r.checkAvailability());
            System.out.println("----------------------------------");
        }
    }
}
