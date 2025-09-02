import java.util.Scanner;

public class ques_7 {

    // Method to generate NumberFormatException
    public static void generateNumberFormatException(String text) {
        // This will throw NumberFormatException if text is not a valid integer
        int number = Integer.parseInt(text);
        System.out.println("Parsed number: " + number);
    }

    // Method to handle NumberFormatException using try-catch
    public static void handleNumberFormatException(String text) {
        try {
            int number = Integer.parseInt(text);
            System.out.println("Parsed number: " + number);
        } catch (NumberFormatException e) {
            System.out.println("Caught NumberFormatException!");
            System.out.println("Error Message: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("Caught RuntimeException!");
            System.out.println("Error Message: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a string (not a valid number): ");
        String input = scanner.next();

        // Generate the exception
        System.out.println("\n=== Generating NumberFormatException ===");
        try {
            generateNumberFormatException(input);
        } catch (NumberFormatException e) {
            System.out.println("Exception caught in main: " + e.getMessage());
        }

        // Handle the exception gracefully
        System.out.println("\n=== Handling NumberFormatException Gracefully ===");
        handleNumberFormatException(input);

        scanner.close();
    }
}

