import java.util.Scanner;

public class ques_11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take inputs
        System.out.print("Enter the first number: ");
        double number1 = input.nextDouble();

        System.out.print("Enter the second number: ");
        double number2 = input.nextDouble();

        // Perform operations
        double addition = number1 + number2;
        double subtraction = number1 - number2;
        double multiplication = number1 * number2;
        double division = 0;
        
        // Check to avoid division by zero
        if (number2 != 0) {
            division = number1 / number2;
        } else {
            System.out.println("Division by zero is not allowed.");
        }

        // Print results
        if (number2 != 0) {
            System.out.println("The addition, subtraction, multiplication and division value of 2 numbers " 
                               + number1 + " and " + number2 + " is " 
                               + addition + ", " + subtraction + ", " + multiplication + ", and " + division);
        } else {
            System.out.println("The addition, subtraction and multiplication value of 2 numbers " 
                               + number1 + " and " + number2 + " is " 
                               + addition + ", " + subtraction + ", and " + multiplication);
        }

        input.close();
    }
}

