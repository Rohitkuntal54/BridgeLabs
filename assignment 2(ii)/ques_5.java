import java.util.Scanner;

public class ques_5{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input unit price
        System.out.print("Enter the unit price (INR): ");
        double unitPrice = input.nextDouble();

        // Input quantity
        System.out.print("Enter the quantity: ");
        int quantity = input.nextInt();

        // Calculate total price
        double totalPrice = unitPrice * quantity;

        // Display the result
        System.out.println("The total purchase price is INR " + totalPrice + " if the quantity " + quantity + " and unit price is INR " + unitPrice);

        input.close();
    }
}

