package MODULE3;
import java.util.*;

interface Billgen {
    int cal();
}

class ProductB implements Billgen {
    String name;
    int proid, quantity, unitprice, total;

    ProductB() {}

    ProductB(String n, int p, int q, int u) {
        name = n;
        proid = p;
        quantity = q;
        unitprice = u;
    }

    public int cal() {
        total = quantity * unitprice;
        return total;
    }
}

public class Bill {

    public static void main(String[] args) {
        ProductB[][] order;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter number of orders: ");
        int n = sc.nextInt();
        order = new ProductB[n][];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter number of products for order " + (i + 1) + ": ");
            int m = sc.nextInt();
            order[i] = new ProductB[m];

            for (int j = 0; j < m; j++) {
                System.out.println("Enter product " + (j + 1) + " name:");
                String a = sc.next();
                
                int b;
                while (true) {
                    System.out.println("Enter product ID:");
                    b = sc.nextInt();
                    boolean duplicate = false;

                    for (int k = 0; k < j; k++) {
                        if (order[i][k].proid == b) {
                            duplicate = true;
                            break;
                        }
                    }

                    if (duplicate) {
                        System.out.println("Duplicate product ID! Please enter a unique product ID.");
                    } else {
                        break;
                    }
                }

                System.out.println("Enter product quantity:");
                int c = sc.nextInt();
                System.out.println("Enter product unit price:");
                int d = sc.nextInt();

                ProductB pb = new ProductB(a, b, c, d);
                order[i][j] = pb;
                order[i][j].total = order[i][j].cal();
            }
        }

        for (int i = 0; i < n; i++) {
            int sum = 0;
            System.out.println("\nOrder No: " + (i + 1));
            Date date = java.util.Calendar.getInstance().getTime();
            System.out.println(date);
            System.out.println("---------------------------------------------------------------");
            System.out.printf("%5s %20s %15s %15s %10s\n", "ProID", "Name", "Quantity", "UnitPrice", "Total");
            System.out.println("---------------------------------------------------------------");

            for (int j = 0; j < order[i].length; j++) {
                System.out.printf("%5d %20s %15d %15d %10d\n", 
                    order[i][j].proid, order[i][j].name, order[i][j].quantity, 
                    order[i][j].unitprice, order[i][j].total);
                sum += order[i][j].total;
            }

            System.out.println("---------------------------------------------------------------");
            System.out.println("Net Amount: " + sum);
            System.out.println("===============================================================\n");
        }
    }
}

