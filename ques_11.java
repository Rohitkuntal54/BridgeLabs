import java.util.Scanner;

public class ques_11{

    // Method to calculate and display sine, cosine, and tangent of an angle in degrees
    public static void calculateTrigFunctions(double degrees) {
        // Convert degrees to radians
        double radians = Math.toRadians(degrees);

        // Calculate sine, cosine, tangent
        double sine = Math.sin(radians);
        double cosine = Math.cos(radians);
        double tangent = Math.tan(radians);

        // Display results rounded to 4 decimal places
        System.out.printf("For angle %.2f degrees:%n", degrees);
        System.out.printf("Sine: %.4f%n", sine);
        System.out.printf("Cosine: %.4f%n", cosine);
        System.out.printf("Tangent: %.4f%n", tangent);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take user input
        System.out.print("Enter an angle in degrees: ");
        double angle = scanner.nextDouble();

        // Calculate and display trig functions
        calculateTrigFunctions(angle);

        scanner.close();
    }
}
