import java.util.Scanner;

public class ques_10 {

    // Method to check collinearity using slope formula
    public static boolean areCollinearBySlope(double x1, double y1, double x2, double y2, double x3, double y3) {
        // To avoid division by zero in slope calculations, handle vertical lines carefully

        // Calculate slopes
        double slopeAB, slopeBC, slopeAC;

        if (x2 - x1 == 0) { // vertical line AB
            slopeAB = Double.POSITIVE_INFINITY;
        } else {
            slopeAB = (y2 - y1) / (x2 - x1);
        }

        if (x3 - x2 == 0) { // vertical line BC
            slopeBC = Double.POSITIVE_INFINITY;
        } else {
            slopeBC = (y3 - y2) / (x3 - x2);
        }

        if (x3 - x1 == 0) { // vertical line AC
            slopeAC = Double.POSITIVE_INFINITY;
        } else {
            slopeAC = (y3 - y1) / (x3 - x1);
        }

        // Check if all slopes are equal
        return (slopeAB == slopeBC) && (slopeBC == slopeAC);
    }

    // Method to check collinearity using area of triangle formula
    public static boolean areCollinearByArea(double x1, double y1, double x2, double y2, double x3, double y3) {
        // Calculate the area of the triangle formed by the points
        double area = 0.5 * (x1 * (y2 - y3) + 
                             x2 * (y3 - y1) + 
                             x3 * (y1 - y2));

        // If area is zero, points are collinear
        return area == 0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input points
        System.out.print("Enter x1: ");
        double x1 = scanner.nextDouble();

        System.out.print("Enter y1: ");
        double y1 = scanner.nextDouble();

        System.out.print("Enter x2: ");
        double x2 = scanner.nextDouble();

        System.out.print("Enter y2: ");
        double y2 = scanner.nextDouble();

        System.out.print("Enter x3: ");
        double x3 = scanner.nextDouble();

        System.out.print("Enter y3: ");
        double y3 = scanner.nextDouble();

        // Check collinearity using slope method
        boolean collinearSlope = areCollinearBySlope(x1, y1, x2, y2, x3, y3);

        // Check collinearity using area method
        boolean collinearArea = areCollinearByArea(x1, y1, x2, y2, x3, y3);

        // Display results
        System.out.println("\nUsing slope method: ");
        if (collinearSlope) {
            System.out.println("Points are Collinear");
        } else {
            System.out.println("Points are NOT Collinear");
        }

        System.out.println("\nUsing area method: ");
        if (collinearArea) {
            System.out.println("Points are Collinear");
        } else {
            System.out.println("Points are NOT Collinear");
        }

        // Sample check for points (2, 4), (4, 6), (6, 8)
        System.out.println("\nSample check for points A(2,4), B(4,6), C(6,8):");
        boolean sampleSlope = areCollinearBySlope(2, 4, 4, 6, 6, 8);
        boolean sampleArea = areCollinearByArea(2, 4, 4, 6, 6, 8);
        System.out.println("Using slope: " + (sampleSlope ? "Collinear" : "Not Collinear"));
        System.out.println("Using area: " + (sampleArea ? "Collinear" : "Not Collinear"));
    }
}

