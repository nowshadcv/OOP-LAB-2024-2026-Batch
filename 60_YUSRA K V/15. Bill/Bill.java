package MODULE3;
import java.util.*;

interface BillGen {
    int calculate();
}

class ProductB implements BillGen {
    String name;
    int prod_id, quantity, unit_price, total;

    ProductB() {}

    ProductB(String n, int p, int q, int u) {
        name = n;
        prod_id = p;
        quantity = q;
        unit_price = u;
    }

    public int calculate() {
        total = quantity * unit_price;
        return total;
    }
}

public class Bill {
    public static void main(String[] args) {
        ProductB[][] order;
        Set<Integer> usedIds = new HashSet<>();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of orders:");
        int n = sc.nextInt();
        order = new ProductB[n][];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter number of products in order " + (i + 1) + ":");
            int m = sc.nextInt();
            order[i] = new ProductB[m];

            for (int j = 0; j < m; j++) {
                sc.nextLine();
                System.out.println("Enter product " + (j + 1) + " name:");
                String name = sc.nextLine();

                int prodId;
                while (true) {
                    System.out.println("Enter product ID:");
                    prodId = sc.nextInt();
                    if (usedIds.contains(prodId)) {
                        System.out.println("❌ Product ID already used. Please enter a unique ID.");
                    } else {
                        usedIds.add(prodId);
                        break;
                    }
                }

                System.out.println("Enter product quantity:");
                int quantity = sc.nextInt();
                System.out.println("Enter product unit price:");
                int unitPrice = sc.nextInt();

                ProductB pb = new ProductB(name, prodId, quantity, unitPrice);
                pb.calculate();
                order[i][j] = pb;
            }
        }

       
        for (int i = 0; i < n; i++) {
            int sum = 0;
            System.out.println("\nOrder No: " + (i + 1));
            Date date = java.util.Calendar.getInstance().getTime();
            System.out.println("Date: " + date);
            System.out.println("------------------------------------------------------------");
            System.out.printf("%-10s %-20s %-10s %-12s %-10s\n", "Prod_ID", "Name", "Quantity", "Unit_Price", "Total");
            System.out.println("------------------------------------------------------------");

            for (int j = 0; j < order[i].length; j++) {
                ProductB p = order[i][j];
                System.out.printf("%-10d %-20s %-10d %-12d %-10d\n", p.prod_id, p.name, p.quantity, p.unit_price, p.total);
                sum += p.total;
            }

            System.out.println("------------------------------------------------------------");
            System.out.println("Net Amount: " + sum);
            System.out.println("-------------------------------------------------------------");
        }

        sc.close();
    }
}
