import java.util.Scanner;

public class ques_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter marks for Physics: ");
        double physics = scanner.nextDouble();

        System.out.print("Enter marks for Chemistry: ");
        double chemistry = scanner.nextDouble();

        System.out.print("Enter marks for Maths: ");
        double maths = scanner.nextDouble();


        double total = physics + chemistry + maths;
        double percentage = total / 3;

    
        String grade;
        String remarks;

        if (percentage >= 90) {
            grade = "A+";
            remarks = "Excellent";
        } else if (percentage >= 80) {
            grade = "A";
            remarks = "Very Good";
        } else if (percentage >= 70) {
            grade = "B";
            remarks = "Good";
        } else if (percentage >= 60) {
            grade = "C";
            remarks = "Satisfactory";
        } else if (percentage >= 50) {
            grade = "D";
            remarks = "Needs Improvement";
        } else {
            grade = "F";
            remarks = "Fail";
        }

        
        System.out.printf("\nAverage Percentage: %.2f%%\n", percentage);
        System.out.println("Grade: " + grade);
        System.out.println("Remarks: " + remarks);

        scanner.close();
    }
}

