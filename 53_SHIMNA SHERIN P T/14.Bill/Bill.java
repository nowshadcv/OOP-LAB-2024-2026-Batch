package MODULE3;

import java.util.Date;
import java.util.Scanner;

public class Bill {

    public static void main(String[] args) {
        ProductB[][] order;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter no. of orders:");
        int n = sc.nextInt();
        order = new ProductB[n][];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter no. of Products:");
            int m = sc.nextInt();
            order[i] = new ProductB[m];

            for (int j = 0; j < m; j++) {
                String a;
                int b, c, d;

                System.out.println("Enter Product " + j + " Name: ");
                a = sc.next();

                // Check for duplicate product ID
                while (true) {
                    System.out.println("Enter Product ID:");
                    b = sc.nextInt();
                    boolean duplicate = false;

                    for (int k = 0; k < j; k++) {
                        if (order[i][k].pro_id == b) {
                            duplicate = true;
                            break;
                        }
                    }

                    if (duplicate) {
                        System.out.println("Product ID already exists in this order. Please enter a unique Product ID.");
                    } else {
                        break;
                    }
                }

                System.out.println("Enter Product Quantity:");
                c = sc.nextInt();
                System.out.println("Enter Product Unit_Price:");
                d = sc.nextInt();

                ProductB pb = new ProductB(a, b, c, d);
                order[i][j] = pb;
                order[i][j].total = order[i][j].calculate();
            }
        }

        // Display bills
        for (int i = 0; i < n; i++) {
            int sum = 0;
            System.out.println("Order No: " + (i + 1));
            Date date = java.util.Calendar.getInstance().getTime();
            System.out.println(date);
            System.out.println("---------------------------------------------------------------------------------------------------");
            System.out.printf("%10s %20s %15s %15s %10s", "Prod_Id", "Name", "Quantity", "Unit_Price", "Total");
            System.out.println();
            System.out.println("---------------------------------------------------------------------------------------------------");

            for (int j = 0; j < order[i].length; j++) {
                System.out.printf("%10d %20s %15d %15d %10d",
                        order[i][j].pro_id,
                        order[i][j].name,
                        order[i][j].quantity,
                        order[i][j].unit_price,
                        order[i][j].total);
                System.out.println();
            }

            System.out.println("---------------------------------------------------------------------------------------------------");

            for (int k = 0; k < order[i].length; k++)
                sum += order[i][k].total;

            System.out.println("Net Amount: " + sum);
            System.out.println("---------------------------------------------------------------------------------------------------");
        }

        sc.close();
    }
}
