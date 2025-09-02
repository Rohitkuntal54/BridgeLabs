import java.util.Scanner;

public class ques_9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Step 1: Get user input for rows and columns
        System.out.print("Enter number of rows: ");
        int rows = scanner.nextInt();

        System.out.print("Enter number of columns: ");
        int cols = scanner.nextInt();

        // Step 2: Create the 2D array
        int[][] matrix = new int[rows][cols];

        // Step 3: Take user input to fill the 2D array
        System.out.println("\nEnter elements of the matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("Element [" + i + "][" + j + "]: ");
                matrix[i][j] = scanner.nextInt();
            }
        }

        // Step 4: Create a 1D array to hold all elements
        int[] array = new int[rows * cols];
        int index = 0;

        // Step 5: Copy elements from 2D to 1D array
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                array[index] = matrix[i][j];
                index++;
            }
        }

        // Step 6: Display the 2D matrix
        System.out.println("\n2D Matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }

        // Step 7: Display the 1D array
        System.out.println("\n1D Array:");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

        scanner.close();
    }
}
