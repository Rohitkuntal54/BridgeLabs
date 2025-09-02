import java.util.Scanner;
import java.util.Random;

public class ques_8{

    // Method to generate random 2-digit ages for n students
    public static int[] generateRandomAges(int n) {
        Random random = new Random();
        int[] ages = new int[n];

        for (int i = 0; i < n; i++) {
            // generate random age between 10 and 99 (2-digit)
            ages[i] = random.nextInt(90) + 10;
        }
        return ages;
    }

    // Method to evaluate voting eligibility and return 2D array [age, "true"/"false"]
    public static String[][] evaluateVotingEligibility(int[] ages) {
        int n = ages.length;
        String[][] results = new String[n][2];

        for (int i = 0; i < n; i++) {
            results[i][0] = String.valueOf(ages[i]);
            if (ages[i] < 0) {
                // Negative age - cannot vote
                results[i][1] = "false";
            } else if (ages[i] >= 18) {
                results[i][1] = "true";
            } else {
                results[i][1] = "false";
            }
        }
        return results;
    }

    // Method to display 2D array in tabular format
    public static void displayResults(String[][] data) {
        System.out.printf("%-10s | %-10s\n", "Age", "Can Vote");
        System.out.println("-----------------------");
        for (String[] row : data) {
            System.out.printf("%-10s | %-10s\n", row[0], row[1]);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int n = scanner.nextInt();

        // Generate random ages for n students
        int[] ages = generateRandomAges(n);

        // Evaluate voting eligibility
        String[][] votingResults = evaluateVotingEligibility(ages);

        // Display ages and voting eligibility
        System.out.println("\nStudent Ages and Voting Eligibility:");
        displayResults(votingResults);

        scanner.close();
    }
}

