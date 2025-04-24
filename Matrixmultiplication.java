package pack;

public class Matrixmultiplication {

	public static void main(String[] args) {
		// Define the two matrices
        int[][] matrix1 = {
                {1, 2, 3},
                {4, 5, 6}
        };
        int[][] matrix2 = {
                {7, 8},
                {9, 10},
                {11, 12}
        };

        // Call the method to multiply the matrices and store the result
        int[][] resultMatrix = multiplyMatrices(matrix1, matrix2);

        // Print the matrices
        System.out.println("Matrix 1:");
        printMatrix(matrix1);
        System.out.println("Matrix 2:");
        printMatrix(matrix2);

        // Print the result matrix
        if (resultMatrix != null) {
            System.out.println("Resultant Matrix:");
            printMatrix(resultMatrix);
        }
    }

    // Method to multiply two matrices
    public static int[][] multiplyMatrices(int[][] matrix1, int[][] matrix2) {
        // Get the dimensions of the matrices
        int rows1 = matrix1.length;
        int cols1 = matrix1[0].length;
        int rows2 = matrix2.length;
        int cols2 = matrix2[0].length;

        // Check if the matrices can be multiplied
        if (cols1 != rows2) {
            System.out.println("Error: The number of columns in the first matrix must equal the number of rows in the second matrix.");
            return null; // Return null to indicate an error
        }

        // Create the result matrix
        int[][] resultMatrix = new int[rows1][cols2];

        // Perform matrix multiplication
        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < cols2; j++) {
                for (int k = 0; k < cols1; k++) {
                    resultMatrix[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }

        return resultMatrix;
    }

    // Method to print a matrix
    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
		// TODO Auto-generated method stub
        }

	}

}
