import java.util.Scanner;

public class ques_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        int originalNumber = number; 
        int sum = 0;

        
        while (number != 0) {
            int digit = number % 10; 
            sum += digit;             
            number = number / 10;     
        

        if (originalNumber % sum == 0) {
            System.out.println(originalNumber + " is a Harshad Number.");
        } else {
            System.out.println(originalNumber + " is NOT a Harshad Number.");
        }

        scanner.close();
    }
}

