import java.util.Scanner;

public class ques_7{

    // Method to find and print the smallest and largest among 3 numbers
    public static void findSmallestAndLargest(int a, int b, int c) {
        int smallest = a;
        int largest = a;

        // Compare for smallest
        if (b < smallest) smallest = b;
        if (c < smallest) smallest = c;

        // Compare for largest
        if (b > largest) largest = b;
        if (c > largest) largest = c;

        System.out.println("Smallest number is: " + smallest);
        System.out.println("Largest number is: " + largest);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take user input
        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();

        System.out.print("Enter third number: ");
        int num3 = scanner.nextInt();

        // Call method
        findSmallestAndLargest(num1, num2, num3);

        scanner.close();
    }
}

