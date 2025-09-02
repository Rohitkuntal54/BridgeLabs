import java.util.Scanner;

public class ques_5{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Step 1: Take input
        System.out.print("Enter a number to generate its multiplication table from 6 to 9: ");
        int number = scanner.nextInt();

        // Step 2: Define array to store results (from 6 to 9 means 4 results)
        int[] multiplicationResult = new int[4];

        // Step 3: Calculate multiplication from 6 to 9 and store in array
        for (int i = 6; i <= 9; i++) {
            multiplicationResult[i - 6] = number * i;
        }

        // Step 4: Display the results
        System.out.println("\nMultiplication Table of " + number + " from 6 to 9:");
        for (int i = 6; i <= 9; i++) {
            System.out.println(number + " * " + i + " = " + multiplicationResult[i - 6]);
        }

        scanner.close();
    }
}

