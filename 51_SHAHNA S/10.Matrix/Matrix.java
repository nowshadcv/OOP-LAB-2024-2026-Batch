package MODULE1;

import java.util.Scanner;

public class Matrix {
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

            System.out.println("Enter the elements of matrix A:");
            for (int i = 0; i < p; i++) {
                for (int j = 0; j < q; j++) {
                    a[i][j] = s.nextInt();
                }
            }

            System.out.println("Enter the elements of matrix B:");
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    b[i][j] = s.nextInt();
                }
            }

            System.out.println("Matrix A:");
            for (int i = 0; i < p; i++) {
                for (int j = 0; j < q; j++) {
                    System.out.print(a[i][j] + " ");
                }
                System.out.println();
            }

            System.out.println("Matrix B:");
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    System.out.print(b[i][j] + " ");
                }
                System.out.println();
            }

            System.out.println("Choose 1, 2, 3, or 4 from the menu below:");
            System.out.println("1: Addition");
            System.out.println("2: Subtraction");
            System.out.println("3: Division");
            System.out.println("4: Transpose");
            int choice = s.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Matrix Addition:");
                    for (int i = 0; i < m; i++) {
                        for (int j = 0; j < n; j++) {
                            System.out.print((a[i][j] + b[i][j]) + " ");
                        }
                        System.out.println();
                    }
                    break;
                case 2:
                    System.out.println("Matrix Subtraction:");
                    for (int i = 0; i < m; i++) {
                        for (int j = 0; j < n; j++) {
                            System.out.print((a[i][j] - b[i][j]) + " ");
                        }
                        System.out.println();
                    }
                    break;
                case 3:
                    System.out.println("Matrix Division:");
                    for (int i = 0; i < m; i++) {
                        for (int j = 0; j < n; j++) {
                            if (b[i][j] != 0) {
                                System.out.print((a[i][j] / (double) b[i][j]) + " ");
                            } else {
                                System.out.print("undefined ");
                            }
                        }
                        System.out.println();
                    }
                    break;
                case 4:
                    System.out.println("Transpose of Matrix A:");
                    for (int i = 0; i < q; i++) {
                        for (int j = 0; j < p; j++) {
                            System.out.print(a[j][i] + " ");
                        }
                        System.out.println();
                    }                                                                                             

                    System.out.println("Transpose of Matrix B:");
                    for (int i = 0; i < n; i++) {
                        for (int j = 0; j < m; j++) {
                            System.out.print(b[j][i] + " ");
                        }
                        System.out.println();
                    }
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        } else {
            System.out.println("These matrices cannot be added or subtracted (they must have the same dimensions).");
        }

        s.close();
    }
}
