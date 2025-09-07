import java.util.Scanner;

public class ques_9 {

    // Method to calculate chocolates per child and remaining chocolates
    public static int[] distributeChocolates(int totalChocolates, int children) {
        int[] result = new int[2]; // result[0] = chocolates per child, result[1] = remaining chocolates

        if (children == 0) {
            System.out.println("Number of children cannot be zero.");
            result[0] = 0;
            result[1] = totalChocolates;
            return result;
        }

        result[0] = totalChocolates / children;   // chocolates each child gets
        result[1] = totalChocolates % children;   // remaining chocolates
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get inputs from user
        System.out.print("Enter the total number of chocolates: ");
        int numberOfChocolates = scanner.nextInt();

        System.out.print("Enter the number of children: ");
        int numberOfChildren = scanner.nextInt();

        // Calculate distribution
        int[] distribution = distributeChocolates(numberOfChocolates, numberOfChildren);

        System.out.println("Each child gets " + distribution[0] + " chocolate(s).");
        System.out.println("Remaining chocolates: " + distribution[1]);

        scanner.close();
    }
}

