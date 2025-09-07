import java.util.Scanner;

public class ques_8 {

    // Method to calculate and print quotient and remainder
    public static void calculateQuotientAndRemainder(int dividend, int divisor) {
        if (divisor == 0) {
            System.out.println("Division by zero is not allowed.");
            return;
        }
        int quotient = dividend / divisor;
        int remainder = dividend % divisor;

        System.out.println("Quotient: " + quotient);
        System.out.println("Remainder: " + remainder);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take user inputs
        System.out.print("Enter dividend (integer): ");
        int dividend = scanner.nextInt();

        System.out.print("Enter divisor (integer): ");
        int divisor = scanner.nextInt();

        // Call method to calculate and print
        calculateQuotientAndRemainder(dividend, divisor);

        scanner.close();
    }
}

