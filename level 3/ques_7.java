import java.util.Scanner;

public class ques_7 {

    // Logic 1: Iterative palindrome check using start and end indexes
    public static boolean isPalindromeIterative(String text) {
        int start = 0;
        int end = text.length() - 1;
        while (start < end) {
            if (text.charAt(start) != text.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    // Logic 2: Recursive palindrome check
    public static boolean isPalindromeRecursive(String text, int start, int end) {
        if (start >= end) {
            return true;
        }
        if (text.charAt(start) != text.charAt(end)) {
            return false;
        }
        return isPalindromeRecursive(text, start + 1, end - 1);
    }

    // Helper method to reverse a string using charAt()
    public static char[] reverseStringUsingCharAt(String text) {
        int len = text.length();
        char[] reversed = new char[len];
        for (int i = 0; i < len; i++) {
            reversed[i] = text.charAt(len - 1 - i);
        }
        return reversed;
    }

    // Logic 3: Palindrome check using character arrays and reverse array
    public static boolean isPalindromeUsingArrays(String text) {
        char[] original = text.toCharArray();
        char[] reversed = reverseStringUsingCharAt(text);

        if (original.length != reversed.length) return false;

        for (int i = 0; i < original.length; i++) {
            if (original[i] != reversed[i]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter text to check palindrome: ");
        String input = scanner.nextLine();

        // Remove spaces and convert to lowercase for better palindrome checking
        String text = input.replaceAll("\\s+", "").toLowerCase();

        boolean resultIterative = isPalindromeIterative(text);
        boolean resultRecursive = isPalindromeRecursive(text, 0, text.length() - 1);
        boolean resultArrays = isPalindromeUsingArrays(text);

        System.out.println("\nPalindrome check results:");
        System.out.println("Using Iterative method: " + (resultIterative ? "Palindrome" : "Not Palindrome"));
        System.out.println("Using Recursive method: " + (resultRecursive ? "Palindrome" : "Not Palindrome"));
        System.out.println("Using Character Array method: " + (resultArrays ? "Palindrome" : "Not Palindrome"));

        scanner.close();
    }
}

