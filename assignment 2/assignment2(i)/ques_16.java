import java.util.Scanner;

public class ques_16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Get number of students
        System.out.print("Enter the number of students: ");
        int numberOfStudents = input.nextInt();

        // Calculate maximum handshakes
        int maxHandshakes = (numberOfStudents * (numberOfStudents - 1)) / 2;

        // Display result
        System.out.println("The maximum number of possible handshakes is " + maxHandshakes);

        input.close();
    }
}

