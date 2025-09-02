import java.util.Scanner;

public class ques_7 {

    // Method to find start and end indices after trimming leading/trailing spaces
    public static int[] findTrimIndices(String text) {
        int length = 0;
        // Calculate length without using length()
        try {
            while (true) {
                text.charAt(length);
                length++;
            }
        } catch (IndexOutOfBoundsException e) {
            // end of string
        }

        int start = 0;
        // Find first non-space from start
        while (start < length && text.charAt(start) == ' ') {
            start++;
        }

        int end = length - 1;
        // Find first non-space from end
        while (end >= start && text.charAt(end) == ' ') {
            end--;
        }

        return new int[]{start, end};
    }

    // Method to create substring using charAt() from start to end (inclusive)
    public static String substringUsingCharAt(String text, int start, int end) {
        StringBuilder sb = new StringBuilder();
        for (int i = start; i <= end; i++) {
            sb.append(text.charAt(i));
        }
        return sb.toString();
    }

    // Method to compare two strings using charAt()
    public static boolean compareStrings(String s1, String s2) {
        // First, find lengths without using length()
        int len1 = 0, len2 = 0;
        try {
            while (true) {
                s1.charAt(len1);
                len1++;
            }
        } catch (IndexOutOfBoundsException e) {}

        try {
            while (true) {
                s2.charAt(len2);
                len2++;
            }
        } catch (IndexOutOfBoundsException e) {}

        if (len1 != len2) return false;

        for (int i = 0; i < len1; i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string with leading/trailing spaces: ");
        String input = scanner.nextLine();

        // Get trimmed indices
        int[] indices = findTrimIndices(input);

        String trimmedUsingCharAt = "";
        if (indices[0] <= indices[1]) {
            trimmedUsingCharAt = substringUsingCharAt(input, indices[0], indices[1]);
        } // else empty string (all spaces)

        // Using built-in trim()
        String trimmedUsingBuiltIn = input.trim();

        // Compare the two results
        boolean areEqual = compareStrings(trimmedUsingCharAt, trimmedUsingBuiltIn);

        System.out.println("\nTrimmed using charAt(): '" + trimmedUsingCharAt + "'");
        System.out.println("Trimmed using built-in trim(): '" + trimmedUsingBuiltIn + "'");
        System.out.println("Are both trimmed results equal? " + areEqual);

        scanner.close();
    }
}
