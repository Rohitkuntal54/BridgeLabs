import java.util.Scanner;

public class ques_3{

    // Method to find the first non-repeating character
    public static char findFirstNonRepeatingChar(String text) {
        int[] frequency = new int[256];  // ASCII size
        int length = findLength(text);

        // Count frequency of each character
        for (int i = 0; i < length; i++) {
            char ch = text.charAt(i);
            frequency[ch]++;
        }

        // Find first character with frequency 1
        for (int i = 0; i < length; i++) {
            char ch = text.charAt(i);
            if (frequency[ch] == 1) {
                return ch;
            }
        }

        // If no non-repeating character found
        return '\0'; // Null char to indicate none found
    }

    // Method to find length without using built-in length()
    public static int findLength(String text) {
        int count = 0;
        try {
            while (true) {
                text.charAt(count);
                count++;
            }
        } catch (IndexOutOfBoundsException e) {
            return count;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        char result = findFirstNonRepeatingChar(input);

        if (result != '\0') {
            System.out.println("The first non-repeating character is: " + result);
        } else {
            System.out.println("No non-repeating character found.");
        }

        scanner.close();
    }
}

