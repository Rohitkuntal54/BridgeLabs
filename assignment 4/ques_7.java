
import java.util.Scanner;

public class ques_7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Step 1: Get input from user
        System.out.print("Enter a natural number: ");
        int number = scanner.nextInt();

        // Step 2: Check for valid natural number
        if (number <= 0) {
            System.out.println("Error: Input must be a natural number (greater than 0).");
            return; // Exit the program
        }

        // Step 3: Create arrays for odd and even numbers
        int size = number / 2 + 1; // max size needed for either array
        int[] oddNumbers = new int[size];
        int[] evenNumbers = new int[size];

        int oddIndex = 0;
        int evenIndex = 0;

        // Step 4: Loop through 1 to number and separate odd/even
        for (int i = 1; i <= number; i++) {
            if (i % 2 == 0) {
                evenNumbers[evenIndex] = i;
                evenIndex++;
            } else {
                oddNumbers[oddIndex] = i;
                oddIndex++;
            }
        }

        // Step 5: Print the odd numbers
        System.out.print("\nOdd numbers: ");
        for (int i = 0; i < oddIndex; i++) {
            System.out.print(oddNumbers[i] + " ");
        }

        // Step 6: Print the even numbers
        System.out.print("\nEven numbers: ");
        for (int i = 0; i < evenIndex; i++) {
            System.out.print(evenNumbers[i] + " ");
        }

        scanner.close();
    }
}
