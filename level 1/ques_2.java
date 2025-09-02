import java.util.Scanner;

public class ques_2{

    // Method to create substring using charAt()
    public static String createSubstringUsingCharAt(String str, int start, int end) {
        StringBuilder subStr = new StringBuilder();

        // Add characters from start to end-1
        for (int i = start; i < end; i++) {
            subStr.append(str.charAt(i));
        }

        return subStr.toString();
    }

    // Method to compare two strings using charAt()
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

        // User input
        System.out.print("Enter the main string: ");
        String input = scanner.next();

        System.out.print("Enter start index: ");
        int start = scanner.nextInt();

        System.out.print("Enter end index: ");
        int end = scanner.nextInt();

        // Check bounds
        if (start < 0 || end > input.length() || start >= end) {
            System.out.println("Invalid start or end index.");
            return;
        }

        // Get substrings
        String substringCharAt = createSubstringUsingCharAt(input, start, end);
        String substringBuiltIn = input.substring(start, end);

        // Compare substrings
        boolean resultUsingCharAt = compareUsingCharAt(substringCharAt, substringBuiltIn);
        boolean resultUsingEquals = substringCharAt.equals(substringBuiltIn);

        // Display results
        System.out.println("\nSubstring using charAt(): " + substringCharAt);
        System.out.println("Substring using substring(): " + substringBuiltIn);

        System.out.println("\nComparison using charAt(): " + resultUsingCharAt);
        System.out.println("Comparison using equals(): " + resultUsingEquals);

        if (resultUsingCharAt == resultUsingEquals) {
            System.out.println("✅ Both methods give the same comparison result.");
        } else {
            System.out.println("❌ Methods give different results!");
        }

        scanner.close();
    }
}

