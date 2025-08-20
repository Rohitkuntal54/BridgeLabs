import java.util.Scanner;

public class ques_14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take input distance in feet
        System.out.print("Enter distance in feet: ");
        double distanceInFeet = input.nextDouble();

        // Convert feet to yards (1 yard = 3 feet)
        double distanceInYards = distanceInFeet / 3.0;

        // Convert yards to miles (1 mile = 1760 yards)
        double distanceInMiles = distanceInYards / 1760.0;

        // Output the result
        System.out.println("The distance in feet is " + distanceInFeet +
                           ", which is " + distanceInYards + " yards and " + distanceInMiles + " miles");

        input.close();
    }
}

