import java.util.Scanner;

public class ques_8 {

    // Method to generate ArrayIndexOutOfBoundsException
    public static void generateArrayIndexOutOfBoundsException(String[] names) {
        // Accessing invalid index: length is names.length, valid indices are 0 to length-1
        int invalidIndex = names.length; // This is out of bounds
        System.out.println("Accessing index " + invalidIndex + ": " + names[invalidIndex]);
    }

    // Method to handle ArrayIndexOutOfBoundsException using try-catch
    public static void handleArrayIndexOutOfBoundsException(String[] names) {
        int invalidIndex = names.length;

        try {
            System.out.println("Accessing index " + invalidIndex + ": " + names[invalidIndex]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught ArrayIndexOutOfBoundsException!");
            System.out.println("Error Message: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("Caught RuntimeException!");
            System.out.println("Error Message: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take number of names from user
        System.out.print("Enter number of names: ");
        int n = scanner.nextInt();
        String[] names = new String[n];

        // Input names
        for (int i = 0; i < n; i++) {
            System.out.print("Enter name #" + (i + 1) + ": ");
            names[i] = scanner.next();
        }

        // Demonstrate the exception
        System.out.println("\n=== Generating ArrayIndexOutOfBoundsException ===");
        try {
            generateArrayIndexOutOfBoundsException(names);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception caught in main: " + e.getMessage());
        }

        // Handle the exception gracefully
        System.out.println("\n=== Handling ArrayIndexOutOfBoundsException Gracefully ===");
        handleArrayIndexOutOfBoundsException(names);

        scanner.close();
    }
}

