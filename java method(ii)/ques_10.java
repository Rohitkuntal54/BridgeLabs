import java.util.Scanner;

public class ques_10 {

    // Method to calculate BMI for each person and populate the 3rd column
    public static void calculateBMI(double[][] data) {
        for (int i = 0; i < data.length; i++) {
            double weight = data[i][0];     // in kg
            double heightCm = data[i][1];   // in cm
            double heightM = heightCm / 100; // convert to meters
            
            double bmi = weight / (heightM * heightM);
            data[i][2] = bmi;  // store BMI in 3rd column
        }
    }

    // Method to determine BMI status for each person
    public static String[] determineBMIStatus(double[][] data) {
        String[] status = new String[data.length];
        
        for (int i = 0; i < data.length; i++) {
            double bmi = data[i][2];
            
            if (bmi < 18.5) {
                status[i] = "Underweight";
            } else if (bmi < 25) {
                status[i] = "Normal weight";
            } else if (bmi < 30) {
                status[i] = "Overweight";
            } else {
                status[i] = "Obesity";
            }
        }
        return status;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[][] data = new double[10][3]; // 10 rows, 3 cols: weight, height, BMI

        // Input weight and height for 10 persons
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter weight (kg) for person " + (i + 1) + ": ");
            data[i][0] = scanner.nextDouble();

            System.out.print("Enter height (cm) for person " + (i + 1) + ": ");
            data[i][1] = scanner.nextDouble();
        }

        // Calculate BMI and populate array
        calculateBMI(data);

        // Determine BMI status for all
        String[] statuses = determineBMIStatus(data);

        // Display results
        System.out.println("\nPerson\tWeight(kg)\tHeight(cm)\tBMI\t\tStatus");
        System.out.println("-------------------------------------------------------------");
        for (int i = 0; i < 10; i++) {
            System.out.printf("%d\t%.2f\t\t%.2f\t\t%.2f\t%s\n", 
                              (i + 1), data[i][0], data[i][1], data[i][2], statuses[i]);
        }

        scanner.close();
    }
}
