import java.util.Random;

public class ques_11 {

    // Method to generate salary and years of service for 10 employees
    // Returns a 2D array: [10][2] => [salary, yearsOfService]
    public static int[][] generateSalaryAndService() {
        Random rand = new Random();
        int[][] data = new int[10][2];
        
        for (int i = 0; i < 10; i++) {
            // Generate a random 5-digit salary (10000 to 99999)
            data[i][0] = rand.nextInt(90000) + 10000;
            // Generate random years of service (1 to 10)
            data[i][1] = rand.nextInt(10) + 1;
        }
        return data;
    }

    // Method to calculate new salary and bonus
    // Input: oldData with salary and years of service
    // Returns a 2D array [10][2] => [newSalary, bonusAmount]
    public static double[][] calculateNewSalaryAndBonus(int[][] oldData) {
        double[][] newData = new double[10][2];
        
        for (int i = 0; i < oldData.length; i++) {
            int salary = oldData[i][0];
            int years = oldData[i][1];
            double bonusPercentage = (years > 5) ? 0.05 : 0.02;
            double bonus = salary * bonusPercentage;
            double newSalary = salary + bonus;
            
            newData[i][0] = newSalary;
            newData[i][1] = bonus;
        }
        return newData;
    }

    // Method to calculate sums of old salary, new salary, and bonus and print results
    public static void printSummary(int[][] oldData, double[][] newData) {
        double sumOldSalary = 0;
        double sumNewSalary = 0;
        double sumBonus = 0;
        
        System.out.printf("%-10s %-10s %-15s %-15s %-10s\n", "Emp ID", "Old Sal", "Years of Service", "Bonus", "New Sal");
        System.out.println("------------------------------------------------------------------");
        
        for (int i = 0; i < oldData.length; i++) {
            int empId = i + 1;
            int oldSalary = oldData[i][0];
            int years = oldData[i][1];
            double bonus = newData[i][1];
            double newSalary = newData[i][0];
            
            sumOldSalary += oldSalary;
            sumNewSalary += newSalary;
            sumBonus += bonus;
            
            System.out.printf("%-10d %-10d %-15d %-15.2f %-10.2f\n", empId, oldSalary, years, bonus, newSalary);
        }
        
        System.out.println("------------------------------------------------------------------");
        System.out.printf("%-10s %-10.2f %-15s %-15.2f %-10.2f\n", "Total", sumOldSalary, "", sumBonus, sumNewSalary);
    }

    public static void main(String[] args) {
        // Generate salaries and years of service
        int[][] employeeData = generateSalaryAndService();
        
        // Calculate new salary and bonus
        double[][] salaryBonusData = calculateNewSalaryAndBonus(employeeData);
        
        // Display summary in tabular format
        printSummary(employeeData, salaryBonusData);
    }
}
