import java.util.Scanner;

public class ques_9 {

    // Method to convert lowercase letters to uppercase using ASCII logic
    public static String convertToUpperManually(String text) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);

            // Check if character is lowercase a-z (ASCII 97 to 122)
            if (ch >= 'a' && ch <= 'z') {
                // Convert to uppercase by subtracting 32
                ch = (char)(ch - 32);
            }

            result.append(ch);
        }

        return result.toString();
    }

    // Method to compare two strings character by character using charAt()
    public static boolean compareUsingCharAt(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }

        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take full line input from user
        System.out.print("Enter a line of text: ");
        String inputText = scanner.nextLine();

        // Convert using manual method
        String manualUpper = convertToUpperManually(inputText);

        // Convert using built-in method
        String builtInUpper = inputText.toUpperCase();

        // Compare the two results
        boolean areEqual = compareUsingCharAt(manualUpper, builtInUpper);

        // Display results
        System.out.println("\n=== Results ===");
        System.out.println("Manual Uppercase:   " + manualUpper);
        System.out.println("Built-in Uppercase: " + builtInUpper);
        System.out.println("Comparison Result:  " + (areEqual ? "✅ Strings are equal." : "❌ Strings are not equal."));

        scanner.close();
    }
}

