
package MODULE3;
import java.util.*;

interface BillGen {
    int calculate();
}

class ProductB implements BillGen {
    String name;
    int prod_id, quantity, unit_price, total;

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
        System.out.println("Enter no of orders:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        order = new ProductB[n][];
        
        for (int i = 0; i < n; i++) {
            System.out.println("Enter no of products:");
            int m = sc.nextInt();
            order[i] = new ProductB[m];
            Set<Integer> productIds = new HashSet<>(); // Track used product IDs
            
            for (int j = 0; j < m; j++) {
                System.out.println("Enter Product " + j + " Name:");
                String a = sc.next();
                
                int b;
                do {
                    System.out.println("Enter product ID:");
                    b = sc.nextInt();
                    if (productIds.contains(b)) {
                        System.out.println("Product ID already exists! Enter a unique ID.");
                    }
                } while (productIds.contains(b));

                productIds.add(b);

                System.out.println("Enter product quantity:");
                int c = sc.nextInt();
                System.out.println("Enter product Unit_price:");
                int d = sc.nextInt();
                order[i][j] = new ProductB(a, b, c, d);
                order[i][j].total = order[i][j].calculate();
            }
        }

        for (int i = 0; i < n; i++) {
            int sum = 0;
            System.out.println("Order no: " + (i + 1));
            Date date = java.util.Calendar.getInstance().getTime();
            System.out.println(date);
            System.out.println(".............");
            System.out.printf("%-10s %-20s %-10s %-10s %-10s%n", "Prod_Id", "Name", "Quantity", "Unit_Price", "Total");
            System.out.println("..........................");

            for (int j = 0; j < order[i].length; j++) {
                System.out.printf("%-10d %-20s %-10d %-10d %-10d%n",
                    order[i][j].prod_id, order[i][j].name, order[i][j].quantity, order[i][j].unit_price, order[i][j].total);
            }

            System.out.println(".......................................");
            for (int k = 0; k < order[i].length; k++) {
                sum += order[i][k].total;
            }
            System.out.println("Net amount: " + sum);
            System.out.println(".......................................................");
        }
        sc.close();
    }
}
