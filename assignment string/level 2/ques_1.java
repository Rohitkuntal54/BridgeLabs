import java.util.Scanner;

public class ques_1 {

    // Method to find string length without using length()
    public static int findLengthWithoutLength(String text) {
        int count = 0;
        try {
            while (true) {
                text.charAt(count);
                count++;
            }
        } catch (IndexOutOfBoundsException e) {
            // When charAt() throws exception, we've reached the end
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a string: ");
        String input = scanner.next();

        // Get length without length()
        int lengthWithoutLength = findLengthWithoutLength(input);

        // Get length with built-in method
        int lengthWithLength = input.length();

        // Display results
        System.out.println("\nLength without using length(): " + lengthWithoutLength);
        System.out.println("Length using built-in length(): " + lengthWithLength);

        scanner.close();
    }
}
