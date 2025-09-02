import java.util.Scanner;

public class ques_3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt user for perimeter
        System.out.print("Enter the perimeter of the square: ");
        double perimeter = input.nextDouble();

        // Calculate the side length (Perimeter = 4 * side)
        double side = perimeter / 4;

        // Display the result
        System.out.println("The length of the side is " + side + " whose perimeter is " + perimeter);

        input.close();
    }
}

