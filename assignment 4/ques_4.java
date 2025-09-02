import java.util.Scanner;

public class ques_4{
    public static void main(String[] args) {
        double[] numbers = new double[10]; // Array of max 10 elements
        double total = 0.0;                // To store the sum
        int index = 0;                     // To keep track of number of inputs

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter up to 10 positive numbers (enter 0 or negative to stop):");

        // Infinite loop for input
        while (true) {
            System.out.print("Enter number " + (index + 1) + ": ");
            double input = scanner.nextDouble();

            // Check for stopping conditions
            if (input <= 0) {
                System.out.println("Stopping input: 0 or negative number entered.");
                break;
            }

            if (index == 10) {
                System.out.println("Maximum of 10 numbers reached.");
                break;
            }

            // Store the number and increment index
            numbers[index] = input;
            index++;
        }

        // Calculate the total using a loop
        for (int i = 0; i < index; i++) {
            total += numbers[i];
        }

        // Display results
        System.out.println("\nNumbers entered:");
        for (int i = 0; i < index; i++) {
            System.out.println("Number " + (i + 1) + ": " + numbers[i]);
        }

        System.out.println("\nTotal sum of numbers: " + total);

        scanner.close();
    }
}

