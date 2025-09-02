import java.util.Scanner;

public class ques_10{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a positive integer: ");
        int number = scanner.nextInt();

        // Validate input
        if (number < 0) {
            System.out.println("Error: Please enter a positive integer.");
            scanner.close();
            return;
        }

        // Create String array to store results (0 to number inclusive)
        String[] results = new String[number + 1];

        // Loop to generate FizzBuzz values
        for (int i = 0; i <= number; i++) {
            if (i == 0) {
                results[i] = "0";  // You can decide if 0 should be treated specially or just number
            } else if (i % 3 == 0 && i % 5 == 0) {
                results[i] = "FizzBuzz";
            } else if (i % 3 == 0) {
                results[i] = "Fizz";
            } else if (i % 5 == 0) {
                results[i] = "Buzz";
            } else {
                results[i] = Integer.toString(i);
            }
        }

        // Loop to display the results with position
        System.out.println("\nFizzBuzz Results:");
        for (int i = 0; i < results.length; i++) {
            System.out.println("Position " + i + " = " + results[i]);
        }

        scanner.close();
    }
}

