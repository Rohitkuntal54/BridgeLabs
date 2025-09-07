import java.util.Random;
import java.util.Scanner;

public class ques_14 {

    // Method to create a random matrix
    public static int[][] createRandomMatrix(int rows, int cols) {
        Random rand = new Random();
        int[][] matrix = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = rand.nextInt(10); // Random value between 0-9
            }
        }
        return matrix;
    }

    // Method to add two matrices
    public static int[][] addMatrices(int[][] a, int[][] b) {
        int rows = a.length, cols = a[0].length;
        int[][] result = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = a[i][j] + b[i][j];
            }
        }
        return result;
    }

    // Method to subtract two matrices
    public static int[][] subtractMatrices(int[][] a, int[][] b) {
        int rows = a.length, cols = a[0].length;
        int[][] result = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = a[i][j] - b[i][j];
            }
        }
        return result;
    }

    // Method to multiply two matrices
    public static int[][] multiplyMatrices(int[][] a, int[][] b) {
        int rowsA = a.length;
        int colsA = a[0].length;
        int colsB = b[0].length;

        int[][] result = new int[rowsA][colsB];

        for (int i = 0; i < rowsA; i++) {
            for (int j = 0; j < colsB; j++) {
                for (int k = 0; k < colsA; k++) {
                    result[i][j] += a[i][k] * b[k][j];
                }
            }
        }
        return result;
    }

    // Method to display a matrix
    public static void printMatrix(int[][] matrix, String label) {
        System.out.println(label + ":");
        for (int[] row : matrix) {
            for (int value : row) {
                System.out.printf("%4d", value);
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input dimensions
        System.out.print("Enter number of rows for matrices A and B: ");
        int rows = sc.nextInt();
        System.out.print("Enter number of columns for matrices A and B: ");
        int cols = sc.nextInt();

        // Generate matrices A and B
        int[][] matrixA = createRandomMatrix(rows, cols);
        int[][] matrixB = createRandomMatrix(rows, cols);

        // Display original matrices
        printMatrix(matrixA, "Matrix A");
        printMatrix(matrixB, "Matrix B");

        // Perform and display addition
        int[][] sum = addMatrices(matrixA, matrixB);
        printMatrix(sum, "Addition (A + B)");

        // Perform and display subtraction
        int[][] difference = subtractMatrices(matrixA, matrixB);
        printMatrix(difference, "Subtraction (A - B)");

        // For multiplication, ensure A's columns = B's rows
        System.out.print("Enter number of columns for Matrix C to multiply with Matrix A: ");
        int colsC = sc.nextInt();

        int[][] matrixC = createRandomMatrix(cols, colsC); // C has cols rows
        printMatrix(matrixC, "Matrix C (for multiplication)");

        // Perform and display multiplication
        int[][] product = multiplyMatrices(matrixA, matrixC);
        printMatrix(product, "Multiplication (A x C)");

        sc.close();
    }
}

