import java.util.Scanner;

public class ques_6{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Step 1: Declare array for 11 players
        double[] heights = new double[11];
        double sum = 0.0;

        // Step 2: Get heights from user
        System.out.println("Enter the height (in cm or meters) of 11 football players:");
        for (int i = 0; i < heights.length; i++) {
            System.out.print("Enter height of player " + (i + 1) + ": ");
            heights[i] = scanner.nextDouble();
            sum += heights[i]; // Add to sum while taking input
        }

        // Step 3: Calculate mean
        double mean = sum / heights.length;

        // Step 4: Display the mean height
        System.out.printf("\nThe mean height of the football team is: %.2f\n", mean);

        scanner.close();
    }
}

