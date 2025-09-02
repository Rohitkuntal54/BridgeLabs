import java.util.Scanner;

public class ques_10 {

    // Generate random 2-digit scores for PCM subjects for n students
    public static int[][] generateRandomScores(int n) {
        int[][] scores = new int[n][3];  // 3 subjects: Physics, Chemistry, Maths
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 3; j++) {
                scores[i][j] = (int) (Math.random() * 100);  // 0-99 scores
            }
        }
        return scores;
    }

    // Calculate total, average, percentage for each student
    public static double[][] calculateTotalsAndPercentages(int[][] scores) {
        int n = scores.length;
        double[][] result = new double[n][3]; // total, average, percentage
        for (int i = 0; i < n; i++) {
            int total = scores[i][0] + scores[i][1] + scores[i][2];
            double average = total / 3.0;
            double percentage = (total / 300.0) * 100;

            // Round to 2 decimal places
            average = Math.round(average * 100.0) / 100.0;
            percentage = Math.round(percentage * 100.0) / 100.0;

            result[i][0] = total;
            result[i][1] = average;
            result[i][2] = percentage;
        }
        return result;
    }

    // Calculate grades based on percentage
    public static String[] calculateGrades(double[][] totalsAndPercentages) {
        int n = totalsAndPercentages.length;
        String[] grades = new String[n];

        for (int i = 0; i < n; i++) {
            double percentage = totalsAndPercentages[i][2];

            if (percentage >= 90) {
                grades[i] = "A+";
            } else if (percentage >= 80) {
                grades[i] = "A";
            } else if (percentage >= 70) {
                grades[i] = "B+";
            } else if (percentage >= 60) {
                grades[i] = "B";
            } else if (percentage >= 50) {
                grades[i] = "C";
            } else if (percentage >= 40) {
                grades[i] = "D";
            } else {
                grades[i] = "F";
            }
        }
        return grades;
    }

    // Display the scorecard in tabular format
    public static void displayScorecard(int[][] scores, double[][] totalsAndPercentages, String[] grades) {
        System.out.printf("%-8s | %-7s | %-9s | %-5s | %-5s | %-7s | %-7s | %-7s | %-6s\n",
                "Student", "Physics", "Chemistry", "Math", "Total", "Average", "Percent", "Grade", "");
        System.out.println("---------------------------------------------------------------------------------------");

        for (int i = 0; i < scores.length; i++) {
            System.out.printf("%-8d | %-7d | %-9d | %-5d | %-5.0f | %-7.2f | %-7.2f%% | %-6s\n",
                    i + 1,
                    scores[i][0], scores[i][1], scores[i][2],
                    totalsAndPercentages[i][0],
                    totalsAndPercentages[i][1],
                    totalsAndPercentages[i][2],
                    grades[i]);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int n = scanner.nextInt();

        // Generate random scores
        int[][] scores = generateRandomScores(n);

        // Calculate total, average, percentage
        double[][] totalsAndPercentages = calculateTotalsAndPercentages(scores);

        // Calculate grades
        String[] grades = calculateGrades(totalsAndPercentages);

        // Display scorecard
        System.out.println("\nScorecard:");
        displayScorecard(scores, totalsAndPercentages, grades);

        scanner.close();
    }
}

