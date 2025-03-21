package Module1;

import java.util.Scanner;

public class MatrixCalculations {

    public static void main(String[] args) {
        int p, q, m, n;
        Scanner s = new Scanner(System.in);

        System.out.print("Enter number of rows in matrix A: ");
        p = s.nextInt();
        System.out.print("Enter number of columns in matrix A: ");
        q = s.nextInt();
        System.out.print("Enter number of rows in matrix B: ");
        m = s.nextInt();
        System.out.print("Enter number of columns in matrix B: ");
        n = s.nextInt();

        if (p == m && q == n) {
            int a[][] = new int[p][q];
            int b[][] = new int[m][n];


            System.out.println("Enter the elements of matrix A: ");
            for (int i = 0; i < p; i++)
                for (int j = 0; j < q; j++)
                    a[i][j] = s.nextInt();


            System.out.println("Enter the elements of matrix B: ");
            for (int i = 0; i < m; i++)
                for (int j = 0; j < n; j++)
                    b[i][j] = s.nextInt();

            System.out.println("Matrix A:");
            displayMatrix(a, p, q);
            System.out.println("Matrix B:");
            displayMatrix(b, m, n);


            while (true) {
                System.out.println("\nChoose an option: ");
                System.out.println("1. Addition");
                System.out.println("2. Subtraction");
                System.out.println("3. Division");
                System.out.println("4. Transpose");
                System.out.println("5. Exit");

                int choice = s.nextInt();

                switch (choice) {
                    case 1:
                        System.out.println("Sum matrix:");
                        displayMatrix(addMatrices(a, b, p, q), p, q);
                        break;
                    case 2:
                        System.out.println("Subtraction matrix:");
                        displayMatrix(subtractMatrices(a, b, p, q), p, q);
                        break;
                    case 3:
                        System.out.println("Division matrix:");
                        displayMatrix(divideMatrices(a, b, p, q), p, q);
                        break;
                    case 4:
                        System.out.println("Transpose of Matrix A:");
                        displayMatrix(transposeMatrix(a, p, q), q, p);
                        System.out.println("Transpose of Matrix B:");
                        displayMatrix(transposeMatrix(b, m, n), n, m);
                        break;
                    case 5:
                        System.out.println("Exiting program. Goodbye!");
                        s.close();
                        return;
                    default:
                        System.out.println("Invalid choice! Please enter a valid option.");
                }
            }
        } else {
            System.out.println("Matrix operations require matrices of the same dimensions.");
        }
        s.close();
    }


    public static int[][] addMatrices(int[][] a, int[][] b, int rows, int cols) {
        int[][] result = new int[rows][cols];
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                result[i][j] = a[i][j] + b[i][j];
        return result;
    }

    public static int[][] subtractMatrices(int[][] a, int[][] b, int rows, int cols) {
        int[][] result = new int[rows][cols];
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                result[i][j] = a[i][j] - b[i][j];
        return result;
    }

    public static double[][] divideMatrices(int[][] a, int[][] b, int rows, int cols) {
        double[][] result = new double[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (b[i][j] == 0) {
                    result[i][j] = Double.NaN;  // Handle division by zero
                } else {
                    result[i][j] = (double) a[i][j] / b[i][j];
                }
            }
        }
        return result;
    }



    public static int[][] transposeMatrix(int[][] matrix, int rows, int cols) {
        int[][] transpose = new int[cols][rows]; 
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                transpose[j][i] = matrix[i][j];
        return transpose;
    }

    public static void displayMatrix(int[][] matrix, int rows, int cols) {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++)
                System.out.print(matrix[i][j] + " ");
            System.out.println();
        }
    }

    public static void displayMatrix(double[][] matrix, int rows, int cols) {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++)
                System.out.print(String.format("%.2f ", matrix[i][j]));
            System.out.println();
        }
    }
}
