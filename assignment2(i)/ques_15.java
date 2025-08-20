import java.util.Scanner;

public class ques_15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take unit price input
        System.out.print("Enter the unit price (INR): ");
        double unitPrice = input.nextDouble();

        // Take quantity input
        System.out.print("Enter the quantity: ");
        int quantity = input.nextInt();

        // Calculate total price
        double totalPrice = unitPrice * quantity;

        // Output the result
        System.out.println("The total purchase price is INR " + totalPrice +
                           " if the quantity " + quantity + " and unit price is INR " + unitPrice);

        input.close();
    }
}


