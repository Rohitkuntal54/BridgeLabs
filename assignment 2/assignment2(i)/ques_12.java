import java.util.Scanner;

public class ques_12{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take input for base and height (in inches)
        System.out.print("Enter the base of the triangle in inches: ");
        double baseInches = input.nextDouble();

        System.out.print("Enter the height of the triangle in inches: ");
        double heightInches = input.nextDouble();

        // Calculate area in square inches
        double areaInches = 0.5 * baseInches * heightInches;

        // Convert area to square centimeters (1 inch = 2.54 cm)
        // Area conversion: (inches^2) * (2.54)^2 = cm^2
        double areaCm = areaInches * Math.pow(2.54, 2);

        // Output results
        System.out.println("The area of the triangle is " + areaInches + " square inches and " + areaCm + " square centimeters.");

        input.close();
    }
}

