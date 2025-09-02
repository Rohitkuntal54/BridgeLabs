import java.util.Scanner;

public class ques_1 {

    // Method to compare two strings using charAt()
    public static boolean compareUsingCharAt(String str1, String str2) {
        // If lengths are not equal, strings are not equal
        if (str1.length() != str2.length()) {
            return false;
        }

        // Compare characters one by one
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking user input
        System.out.print("Enter first string: ");
        String first = scanner.next();

        System.out.print("Enter second string: ");
        String second = scanner.next();

        // Compare using custom method
        boolean resultUsingCharAt = compareUsingCharAt(first, second);

        // Compare using built-in equals()
        boolean resultUsingEquals = first.equals(second);

        // Display both results
        System.out.println("Result using charAt(): " + resultUsingCharAt);
        System.out.println("Result using equals(): " + resultUsingEquals);

        // Check if both results are the same
        if (resultUsingCharAt == resultUsingEquals) {
            System.out.println("Both methods give the same result.");
        } else {
            System.out.println("Methods give different results!");
        }

        scanner.close();
    }
}
