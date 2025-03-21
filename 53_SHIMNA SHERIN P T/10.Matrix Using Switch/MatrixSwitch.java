package MODULE1;

import java.util.Scanner;

public class MatrixSwitch {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter number of columns: ");
        int cols = sc.nextInt();
        int[][] matrix1 = new int[rows][cols];
        int[][] matrix2 = new int[rows][cols];
        int[][] result = new int[rows][cols];

        System.out.println("Enter the elements of matrix1:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix1[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter elements of matrix2:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix2[i][j] = sc.nextInt();
            }
        }

        System.out.println("Choose an operation:\n1. Addition\n2. Subtraction\n3. Division\n4. Transpose");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:  // Addition
                for (int i = 0; i < rows; i++) {
                    for (int j = 0; j < cols; j++) {
                        result[i][j] = matrix1[i][j] + matrix2[i][j];
                    }
                }
                System.out.println("Matrix addition result:");
                displayMatrix(result);
                break;

            case 2:  // Subtraction
                for (int i = 0; i < rows; i++) {
                    for (int j = 0; j < cols; j++) {
                        result[i][j] = matrix1[i][j] - matrix2[i][j];
                    }
                }
                System.out.println("Matrix subtraction result:");
                displayMatrix(result);
                break;

            case 3:  // Division
                boolean divisionByZero = false;
                for (int i = 0; i < rows; i++) {
                    for (int j = 0; j < cols; j++) {
                        if (matrix2[i][j] == 0) {
                            divisionByZero = true;
                            System.out.println("Error: Division by zero at position (" + i + "," + j + ")");
                        } else {
                            result[i][j] = matrix1[i][j] / matrix2[i][j];
                        }
                    }
                }
                if (!divisionByZero) {
                    System.out.println("Matrix division result:");
                    displayMatrix(result);
                }
                break;

            case 4:  // Transpose
                System.out.println("Transpose of matrix1:");
                for (int i = 0; i < cols; i++) {
                    for (int j = 0; j < rows; j++) {
                        System.out.print(matrix1[j][i] + " ");
                    }
                    System.out.println();
                }
                break;

            default:
                System.out.println("Invalid choice");
                break;
        }

        sc.close();
    }

    public static void displayMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int elem : row) {
                System.out.print(elem + " ");
            }
            System.out.println();
        }
    }
}
