import java.util.Scanner;

public class ques_9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take input for fee
        System.out.print("Enter the Student Fee (INR): ");
        double fee = input.nextDouble();

        // Take input for discount percentage
        System.out.print("Enter the University Discount Percentage: ");
        double discountPercent = input.nextDouble();

        // Calculate discount amount
        double discount = (fee * discountPercent) / 100;

        // Calculate final fee after discount
        double finalFee = fee - discount;

        // Print the results
        System.out.println("The discount amount is INR " + discount);
        System.out.println("The final discounted fee is INR " + finalFee);

        input.close();
    }
}

