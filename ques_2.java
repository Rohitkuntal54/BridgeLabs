import java.util.Scanner;

public class ques_2{

    // Method to calculate maximum handshakes using combination formula
    public static int calculateHandshakes(int numberOfStudents) {
        return (numberOfStudents * (numberOfStudents - 1)) / 2;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get user input for number of students
        System.out.print("Enter the number of students: ");
        int numberOfStudents = scanner.nextInt();

        // Check for valid input
        if (numberOfStudents < 2) {
            System.out.println("At least two students are required to have a handshake.");
        } else {
            // Calculate handshakes
            int handshakes = calculateHandshakes(numberOfStudents);

            // Display result
            System.out.println("The maximum number of possible handshakes is: " + handshakes);
        }

        scanner.close();
    }
}

