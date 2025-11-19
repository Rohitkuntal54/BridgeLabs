import java.util.*;

public class Q4_Library {
    public static void main(String[] args) {
        Map<String, String> books = new HashMap<>();

        books.put("978-1001", "Java Basics");
        books.put("978-1002", "Python Guide");
        books.put("978-1003", "C++ Master");

        // Search by ISBN
        String isbn = "978-1002";
        System.out.println(books.getOrDefault(isbn, "Book not found"));

        // Remove
        books.remove("978-1003");

        // Sorted print
        TreeMap<String, String> sorted = new TreeMap<>(books);
        for (String key : sorted.keySet()) {
            System.out.println(key + " → " + sorted.get(key));
        }

        // Search by title
        String title = "Java Basics";
        for (String key : books.keySet()) {
            if (books.get(key).equals(title)) {
                System.out.println("Found ISBN = " + key);
            }
        }
    }
}

