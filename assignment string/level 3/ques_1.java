import java.util.Scanner;

public class ques_1{

    // Method to calculate BMI and Status for each person
    // Takes weight (kg) and height (cm) arrays, returns a 2D String array with BMI and Status
    public static String[][] calculateBMIAndStatus(double[][] weightHeight) {
        int n = weightHeight.length;
        String[][] result = new String[n][4]; // Height, Weight, BMI, Status
        
        for (int i = 0; i < n; i++) {
            double weight = weightHeight[i][0];
            double heightCm = weightHeight[i][1];
            double heightM = heightCm / 100.0; // convert cm to meters
            
            double bmi = weight / (heightM * heightM);
            bmi = Math.round(bmi * 100.0) / 100.0; // Round to 2 decimal places
            
            // Determine BMI Status
            String status;
            if (bmi < 18.5) {
                status = "Underweight";
            } else if (bmi >= 18.5 && bmi < 24.9) {
                status = "Normal weight";
            } else if (bmi >= 25 && bmi < 29.9) {
                status = "Overweight";
            } else {
                status = "Obesity";
            }
            
            // Store as Strings
            result[i][0] = String.valueOf(heightCm);
            result[i][1] = String.valueOf(weight);
            result[i][2] = String.valueOf(bmi);
            result[i][3] = status;
        }
        return result;
    }

    // Method to display the BMI results in a tabular format
    public static void displayResults(String[][] data) {
        System.out.printf("%-8s | %-10s | %-10s | %-12s | %-15s\n", "Person", "Height(cm)", "Weight(kg)", "BMI", "Status");
        System.out.println("--------------------------------------------------------------------------");
        for (int i = 0; i < data.length; i++) {
            System.out.printf("%-8d | %-10s | %-10s | %-12s | %-15s\n",
                              (i + 1), data[i][0], data[i][1], data[i][2], data[i][3]);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = 10;
        double[][] weightHeight = new double[n][2]; // column 0: weight, column 1: height
        
        System.out.println("Enter weight (kg) and height (cm) for 10 persons:");
        for (int i = 0; i < n; i++) {
            System.out.printf("Person %d - Weight (kg): ", (i + 1));
            weightHeight[i][0] = scanner.nextDouble();
            System.out.printf("Person %d - Height (cm): ", (i + 1));
            weightHeight[i][1] = scanner.nextDouble();
        }

        // Calculate BMI and Status
        String[][] bmiData = calculateBMIAndStatus(weightHeight);

        // Display results
        System.out.println("\nBMI Results:");
        displayResults(bmiData);

        scanner.close();
    }
}
