import java.util.Scanner;

public class ques_3{

    // Method to return characters of a string without using toCharArray()
    public static char[] getCharsManually(String str) {
        int length = str.length();
        char[] chars = new char[length];

        for (int i = 0; i < length; i++) {
            chars[i] = str.charAt(i);
        }

        return chars;
    }

    // Method to compare two char arrays
    public static boolean compareCharArrays(char[] arr1, char[] arr2) {
        if (arr1.length != arr2.length) {
            return false;
        }

        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a string: ");
        String input = scanner.next();

        // Get char arrays
        char[] manualChars = getCharsManually(input);
        char[] builtInChars = input.toCharArray();

        // Compare arrays
        boolean areEqual = compareCharArrays(manualChars, builtInChars);

        // Display result
        System.out.println("\nCharacters from user-defined method:");
        for (char c : manualChars) {
            System.out.print(c + " ");
        }

        System.out.println("\n\nCharacters from built-in toCharArray():");
        for (char c : builtInChars) {
            System.out.print(c + " ");
        }

        System.out.println("\n\nComparison Result: " + (areEqual ? "✅ Arrays are equal." : "❌ Arrays are not equal."));

        scanner.close();
    }
}

