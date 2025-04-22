package MODULE3;
import java.util.*;

public class Bill {
    public static void main(String[] args) {
        ProductB[][] order;
        Scanner sc = new Scanner(System.in);
        Set<Integer> usedProductIds = new HashSet<>(); // Ensure unique product IDs

        System.out.print("Enter number of orders: ");
        int n = sc.nextInt();
        sc.nextLine(); // consume newline
        order = new ProductB[n][];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter number of products in order " + (i + 1) + ": ");
            int m = sc.nextInt();
            sc.nextLine(); // consume newline
            order[i] = new ProductB[m];

            for (int j = 0; j < m; j++) {
                String name;
                while (true) {
                    System.out.print("Enter product " + (j + 1) + " Name: ");
                    name = sc.nextLine().trim();
                    if (name.isEmpty() || name.matches("\\d+")) {
                        System.out.println("Invalid name. Please enter a valid string (not just numbers).");
                    } else {
                        break;
                    }
                }

                int id;
                while (true) {
                    System.out.print("Enter product ID: ");
                    id = sc.nextInt();
                    sc.nextLine(); // consume newline
                    if (usedProductIds.contains(id)) {
                        System.out.println("This product ID is already used. Please enter a unique product ID.");
                    } else {
                        usedProductIds.add(id);
                        break;
                    }
                }

                System.out.print("Enter product quantity: ");
                int quantity = sc.nextInt();

                System.out.print("Enter product Unit Price: ");
                int unitPrice = sc.nextInt();
                sc.nextLine(); // consume newline

                ProductB pb = new ProductB(name, id, quantity, unitPrice);
                pb.total = pb.calculate();
                order[i][j] = pb;
            }
        }

        // Print all orders
        for (int i = 0; i < n; i++) {
            int sum = 0;
            System.out.println("\nOrder No: " + (i + 1));
            Date date = java.util.Calendar.getInstance().getTime();
            System.out.println(date);
            System.out.println("---------------------------------------------------------------");
            System.out.printf("%8s %20s %10s %12s %10s%n", "Prod_ID", "Name", "Quantity", "Unit Price", "Total");
            System.out.println("---------------------------------------------------------------");

            for (ProductB pb : order[i]) {
                System.out.printf("%8d %20s %10d %12d %10d%n",
                        pb.prod_id, pb.name, pb.quantity, pb.unit_price, pb.total);
                sum += pb.total;
            }

            System.out.println("---------------------------------------------------------------");
            System.out.println("Net Amount: " + sum);
            System.out.println("---------------------------------------------------------------");
        }

        sc.close();
    }
}
