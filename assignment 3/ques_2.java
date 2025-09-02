import java.util.Scanner;

public class ques_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        boolean isPrime = true; // Assume the number is prime

        // Check if number is greater than 1
        if (number <= 1) {
            isPrime = false;
        } else {
            // Loop from 2 to number-1
            for (int i = 2; i <= number / 2; i++) {
                if (number % i == 0) {
                    isPrime = false; // Found a divisor
                    break; // No need to check further
                }
            }
        }

        // Output result
        if (isPrime) {
            System.out.println(number + " is a Prime Number.");
        } else {
            System.out.println(number + " is NOT a Prime Number.");
        }

        scanner.close();
    }
}
