import java.util.Scanner;

public class ques_6{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take inputs
        System.out.print("Enter the first number: ");
        int number1 = input.nextInt();

        System.out.print("Enter the second number: ");
        int number2 = input.nextInt();

        // Check for division by zero
        if (number2 == 0) {
            System.out.println("Division by zero is not allowed.");
        } else {
            int quotient = number1 / number2;
            int remainder = number1 % number2;

            // Print the result
            System.out.println("The Quotient is " + quotient + " and Reminder is " + remainder + " of two number " + number1 + " and " + number2);
        }

        input.close();
    }
}

