import java.util.Scanner;

public class ques_8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Step 1: Take input
        System.out.print("Enter a positive integer to find its factors: ");
        int number = scanner.nextInt();

        if (number <= 0) {
            System.out.println("Invalid input. Please enter a positive integer.");
            return;
        }

        // Step 2: Initialize variables
        int maxFactor = 10;
        int[] factors = new int[maxFactor];
        int index = 0;

        // Step 3: Find factors
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                // Resize array if needed
                if (index == maxFactor) {
                    maxFactor *= 2;
                    int[] temp = new int[maxFactor];
                    for (int j = 0; j < index; j++) {
                        temp[j] = factors[j];
                    }
                    factors = temp;
                }
                // Add factor to array
                factors[index] = i;
                index++;
            }
        }

        // Step 4: Display results
        System.out.println("\nFactors of " + number + " are:");
        for (int i = 0; i < index; i++) {
            System.out.print(factors[i] + " ");
        }

        scanner.close();
    }
}

