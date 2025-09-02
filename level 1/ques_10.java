import java.util.Scanner;

public class ques_10 {

    // Method to convert uppercase letters to lowercase using ASCII logic
    public static String convertToLowerManually(String text) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);

            // Check if character is uppercase A-Z (ASCII 65 to 90)
            if (ch >= 'A' && ch <= 'Z') {
                // Convert to lowercase by adding 32
                ch = (char)(ch + 32);
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
        String manualLower = convertToLowerManually(inputText);

        // Convert using built-in method
        String builtInLower = inputText.toLowerCase();

        // Compare the two results
        boolean areEqual = compareUsingCharAt(manualLower, builtInLower);

        // Display results
        System.out.println("\n=== Results ===");
        System.out.println("Manual Lowercase:   " + manualLower);
        System.out.println("Built-in Lowercase: " + builtInLower);
        System.out.println("Comparison Result:  " + (areEqual ? "✅ Strings are equal." : "❌ Strings are not equal."));

        scanner.close();
    }
}

