import java.util.Scanner;
import java.util.Random;

public class ques_13 {

    // Method to generate random 2-digit scores for PCM
    public static int[][] generateScores(int studentCount) {
        int[][] scores = new int[studentCount][3]; // 3 subjects: Physics, Chemistry, Math
        Random rand = new Random();

        for (int i = 0; i < studentCount; i++) {
            scores[i][0] = rand.nextInt(41) + 60; // Physics score (60 to 100)
            scores[i][1] = rand.nextInt(41) + 60; // Chemistry
            scores[i][2] = rand.nextInt(41) + 60; // Math
        }

        return scores;
    }

    // Method to calculate total, average, and percentage for each student
    public static double[][] calculateStats(int[][] scores) {
        int studentCount = scores.length;
        double[][] stats = new double[studentCount][3]; // total, average, percentage

        for (int i = 0; i < studentCount; i++) {
            int total = scores[i][0] + scores[i][1] + scores[i][2];
            double average = total / 3.0;
            double percentage = (total / 300.0) * 100;

            stats[i][0] = total;
            stats[i][1] = Math.round(average * 100.0) / 100.0;
            stats[i][2] = Math.round(percentage * 100.0) / 100.0;
        }

        return stats;
    }

    // Method to display the scorecard
    public static void displayScoreCard(int[][] scores, double[][] stats) {
        System.out.println("ID\tPhysics\tChemistry\tMath\tTotal\tAverage\tPercentage");
        System.out.println("---------------------------------------------------------------");

        for (int i = 0; i < scores.length; i++) {
            System.out.printf("%d\t%d\t%d\t\t%d\t%.0f\t%.2f\t%.2f%%\n",
                    (i + 1),
                    scores[i][0],
                    scores[i][1],
                    scores[i][2],
                    stats[i][0],
                    stats[i][1],
                    stats[i][2]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take input for number of students
        System.out.print("Enter number of students: ");
        int studentCount = sc.nextInt();

        // Generate PCM scores
        int[][] scores = generateScores(studentCount);

        // Calculate total, average, percentage
        double[][] stats = calculateStats(scores);

        // Display scorecard
        displayScoreCard(scores, stats);
    }
}

