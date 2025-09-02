import java.util.Scanner;

public class ques_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

    
        System.out.print("Enter weight in kilograms: ");
        double weight = scanner.nextDouble();

    
        System.out.print("Enter height in centimeters: ");
        double heightCm = scanner.nextDouble();

        
        double heightMeters = heightCm / 100;

        
        double bmi = weight / (heightMeters * heightMeters);

        
        String status;
        if (bmi < 18.5) {
            status = "Underweight";
        } else if (bmi < 25.0) {
            status = "Normal weight";
        } else if (bmi < 30.0) {
            status = "Overweight";
        } else {
            status = "Obese";
        }
        System.out.printf("\nYour BMI is: %.2f\n", bmi);
        System.out.println("Weight Status: " + status);

        scanner.close();
    }
}

