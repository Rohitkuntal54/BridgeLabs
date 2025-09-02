 import java.util.Scanner;

public class ques_5{

    // Method to generate StringIndexOutOfBoundsException
    public static void generateException(String input) {
        // Trying to access an index beyond the length of the string
        int invalidIndex = input.length();  // This is out-of-bounds (0-based index)
        System.out.println("Character at index " + invalidIndex + ": " + input.charAt(invalidIndex));
    }

    // Method to handle StringIndexOutOfBoundsException using try-catch
    public static void handleException(String input) {
        int invalidIndex = input.length();  // Again, this index is invalid
        try {
            System.out.println("Character at index " + invalidIndex + ": " + input.charAt(invalidIndex));
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Caught StringIndexOutOfBoundsException!");
            System.out.println("Error Message: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get string input from user
        System.out.print("Enter a string: ");
        String userInput = scanner.next();

        // Demonstrate unhandled exception
        System.out.println("\n=== Generating StringIndexOutOfBoundsException ===");
        try {
            generateException(userInput); // This will throw the exception
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Exception caught in main: " + e.getMessage());
        }

        // Demonstrate handled exception
        System.out.println("\n=== Handling StringIndexOutOfBoundsException Gracefully ===");
        handleException(userInput);

        scanner.close();
    }
}

