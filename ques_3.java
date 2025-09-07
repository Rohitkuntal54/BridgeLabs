import java.util.Scanner;

public class ques_3 {

    // Method to calculate number of rounds to complete 5 km
    public static int calculateRounds(double side1, double side2, double side3) {
        double perimeter = side1 + side2 + side3; // in meters
        double totalDistance = 5000; // 5 km = 5000 meters
        return (int) Math.ceil(totalDistance / perimeter); // round up to complete full run
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking input for the three sides of the triangular park
        System.out.print("Enter length of side 1 (in meters): ");
        double side1 = scanner.nextDouble();

        System.out.print("Enter length of side 2 (in meters): ");
        double side2 = scanner.nextDouble();

        System.out.print("Enter length of side 3 (in meters): ");
        double side3 = scanner.nextDouble();

        // Validate triangle sides (optional but good practice)
        if (side1 + side2 > side3 && side1 + side3 > side2 && side2 + side3 > side1) {
            int rounds = calculateRounds(side1, side2, side3);
            System.out.println("The athlete must complete " + rounds + " round(s) to complete a 5 km run.");
        } else {
            System.out.println("The given sides do not form a valid triangle.");
        }

        scanner.close();
    }
}

