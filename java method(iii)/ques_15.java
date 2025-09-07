import java.util.Random;

public class ques_15 {

    // Method to generate a random square matrix
    public static double[][] generateRandomMatrix(int size) {
        Random rand = new Random();
        double[][] matrix = new double[size][size];
        for (int i = 0; i < size; i++)
            for (int j = 0; j < size; j++)
                matrix[i][j] = rand.nextInt(10); // values 0–9
        return matrix;
    }

    // Method to display a matrix
    public static void printMatrix(double[][] matrix, String label) {
        System.out.println(label + ":");
        for (double[] row : matrix) {
            for (double value : row) {
                System.out.printf("%8.2f", value);
            }
            System.out.println();
        }
        System.out.println();
    }

    // Method to find transpose of a matrix
    public static double[][] transpose(double[][] matrix) {
        int n = matrix.length;
        double[][] transposed = new double[n][n];
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                transposed[j][i] = matrix[i][j];
        return transposed;
    }

    // Method to calculate determinant of 2x2 matrix
    public static double determinant2x2(double[][] matrix) {
        return matrix[0][0] * matrix[1][1] - matrix[0][1] * matrix[1][0];
    }

    // Method to calculate determinant of 3x3 matrix
    public static double determinant3x3(double[][] m) {
        return m[0][0]*(m[1][1]*m[2][2] - m[1][2]*m[2][1])
             - m[0][1]*(m[1][0]*m[2][2] - m[1][2]*m[2][0])
             + m[0][2]*(m[1][0]*m[2][1] - m[1][1]*m[2][0]);
    }

    // Method to calculate inverse of a 2x2 matrix
    public static double[][] inverse2x2(double[][] m) {
        double det = determinant2x2(m);
        if (det == 0) return null;

        double[][] inverse = new double[2][2];
        inverse[0][0] =  m[1][1] / det;
        inverse[0][1] = -m[0][1] / det;
        inverse[1][0] = -m[1][0] / det;
        inverse[1][1] =  m[0][0] / det;
        return inverse;
    }

    // Method to calculate inverse of a 3x3 matrix
    public static double[][] inverse3x3(double[][] m) {
        double det = determinant3x3(m);
        if (det == 0) return null;

        double[][] cofactor = new double[3][3];
        cofactor[0][0] =  (m[1][1]*m[2][2] - m[1][2]*m[2][1]);
        cofactor[0][1] = -(m[1][0]*m[2][2] - m[1][2]*m[2][0]);
        cofactor[0][2] =  (m[1][0]*m[2][1] - m[1][1]*m[2][0]);

        cofactor[1][0] = -(m[0][1]*m[2][2] - m[0][2]*m[2][1]);
        cofactor[1][1] =  (m[0][0]*m[2][2] - m[0][2]*m[2][0]);
        cofactor[1][2] = -(m[0][0]*m[2][1] - m[0][1]*m[2][0]);

        cofactor[2][0] =  (m[0][1]*m[1][2] - m[0][2]*m[1][1]);
        cofactor[2][1] = -(m[0][0]*m[1][2] - m[0][2]*m[1][0]);
        cofactor[2][2] =  (m[0][0]*m[1][1] - m[0][1]*m[1][0]);

        // Transpose cofactor to get adjoint
        double[][] adjoint = transpose(cofactor);

        // Divide by determinant
        double[][] inverse = new double[3][3];
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++)
                inverse[i][j] = adjoint[i][j] / det;

        return inverse;
    }

    public static void main(String[] args) {
        int size = 3; // Change to 2 for 2x2 matrix
        double[][] matrix = generateRandomMatrix(size);
        printMatrix(matrix, "Original Matrix");

        // Transpose
        double[][] transpose = transpose(matrix);
        printMatrix(transpose, "Transpose");

        // Determinant
        double det = (size == 2) ? determinant2x2(matrix) : determinant3x3(matrix);
        System.out.printf("Determinant: %.2f%n%n", det);

        // Inverse
        double[][] inverse = (size == 2) ? inverse2x2(matrix) : inverse3x3(matrix);
        if (inverse != null) {
            printMatrix(inverse, "Inverse Matrix");
        } else {
            System.out.println("Matrix is not invertible (determinant is zero).");
        }
    }
}

