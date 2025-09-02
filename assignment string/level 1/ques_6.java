import java.util.Scanner;

public class ques_6 {

    // Method that generates IllegalArgumentException
    public static void generateIllegalArgumentException(String input) {
        int start = 5;
        int end = 3;

        // This will throw IllegalArgumentException since start > end
        System.out.println("Substring from " + start + " to " + end + ": " + input.substring(start, end));
    }

    // Method that handles IllegalArgumentException using try-catch
    public static void handleIllegalArgumentException(String input) {
        int start = 5;
        int end = 3;

        try {
            System.out.println("Substring from " + start + " to " + end + ": " + input.substring(start, end));
        } catch (IllegalArgumentException e) {
            System.out.println("Caught IllegalArgumentException!");
            System.out.println("Error Message: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("Caught RuntimeException!");
            System.out.println("Error Message: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a string: ");
        String userInput = scanner.next();

        // Generate the exception
        System.out.println("\n=== Generating IllegalArgumentException ===");
        try {
            generateIllegalArgumentException(userInput);
        } catch (IllegalArgumentException e) {
            System.out.println("Exception caught in main: " + e.getMessage());

