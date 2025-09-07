import java.util.Scanner;

public class ques_2 {

    // Recursive method to calculate sum of first n natural numbers
    public static int recursiveSum(int n) {
        if (n == 1) {
            return 1;
        }
        return n + recursiveSum(n - 1);
    }

    // Method to calculate sum using formula n*(n+1)/2
    public static int formulaSum(int n) {
        return n * (n + 1) / 2;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a natural number (positive integer): ");
        int n = scanner.nextInt();

        // Validate input
        if (n <= 0) {
            System.out.println("Invalid input! Please enter a positive integer greater than 0.");
            scanner.close();
            return;
        }

        // Calculate sums
        int sumRecursive = recursiveSum(n);
        int sumFormula = formulaSum(n);

        // Display results
        System.out.println("Sum calculated using recursion: " + sumRecursive);
        System.out.println("Sum calculated using formula: " + sumFormula);

        // Compare results
        if (sumRecursive == sumFormula) {
            System.out.println("Both methods produce the same result. The calculation is correct!");
        } else {
            System.out.println("The results differ. Please check your methods.");
        }

        scanner.close();
    }
}
