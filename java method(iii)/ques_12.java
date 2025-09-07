import java.util.Scanner;

public class ques_12 {

    // Method to calculate Euclidean distance between two points
    public static double calculateDistance(double x1, double y1, double x2, double y2) {
        return Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
    }

    // Method to find the slope and intercept of the line
    // Returns a double array: [slope, intercept]
    public static double[] getLineEquation(double x1, double y1, double x2, double y2) {
        double[] result = new double[2];

        // Prevent division by zero when line is vertical
        if (x2 == x1) {
            System.out.println("The line is vertical. Slope is undefined.");
            result[0] = Double.POSITIVE_INFINITY;
            result[1] = Double.NaN; // No y-intercept
        } else {
            double slope = (y2 - y1) / (x2 - x1);
            double intercept = y1 - slope * x1;

            result[0] = slope;
            result[1] = intercept;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input
        System.out.print("Enter x1: ");
        double x1 = scanner.nextDouble();
        System.out.print("Enter y1: ");
        double y1 = scanner.nextDouble();
        System.out.print("Enter x2: ");
        double x2 = scanner.nextDouble();
        System.out.print("Enter y2: ");
        double y2 = scanner.nextDouble();

        // Calculate distance
        double distance = calculateDistance(x1, y1, x2, y2);
        System.out.printf("Euclidean Distance between the two points: %.2f\n", distance);

        // Get line equation
        double[] lineEq = getLineEquation(x1, y1, x2, y2);
        double slope = lineEq[0];
        double intercept = lineEq[1];

        // Display result
        if (slope == Double.POSITIVE_INFINITY) {
            System.out.println("Line Equation: x = " + x1 + " (Vertical Line)");
        } else {
            System.out.printf("Line Equation: y = %.2fx + %.2f\n", slope, intercept);
        }
    }
}

