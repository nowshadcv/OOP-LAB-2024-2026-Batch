package module_3;

import java.util.*;

interface BillGen {
    int calculate();
}

class Product implements BillGen {
    String name;
    int prod_id, quantity, unit_price, total;

    Product(String n, int id, int q, int u) {
        this.name = n;
        this.prod_id = id;
        this.quantity = q;
        this.unit_price = u;
    }

    public int calculate() {
        total = quantity * unit_price;
        return total;
    }
}

public class Main {
    public static void main(String[] naheel) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no. of orders: ");
        int n = sc.nextInt();
        sc.nextLine(); 

        Product[][] order = new Product[n][];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter no. of products in order " + (i + 1) + ": ");
            int m = sc.nextInt();
            sc.nextLine();

            order[i] = new Product[m];

            for (int j = 0; j < m; j++) {
                System.out.print("Enter Product " + (j + 1) + " Name: ");
                String name = sc.nextLine();
                System.out.print("Enter product id: ");
                int id = sc.nextInt();
                boolean isDuplicate = false;
                for(int k = 0; k < j; k++) {
                	if(order[i][k].prod_id == id) {
                		System.out.println("Duplicate id found!! ");
                		isDuplicate = true;
                		break;
                	}
                }
                if(isDuplicate) {
                	j--;
                	sc.nextLine();
                	continue;
                }
                System.out.print("Enter product quantity: ");
                int qty = sc.nextInt();

                System.out.print("Enter product unit price: ");
                int price = sc.nextInt();
                sc.nextLine(); // consume newline

                Product p = new Product(name, id, qty, price);
                p.calculate();
                order[i][j] = p;
            }
        }

        for (int i = 0; i < n; i++) {
            int sum = 0;
            System.out.println("\nOrder no.: " + (i + 1));
            Date date = java.util.Calendar.getInstance().getTime();
            System.out.println(date);
            System.out.println("-------------------------------------------------------------------------------------");
            System.out.printf("%-10s %-20s %-15s %-15s %-10s\n", "Prod_id", "Name", "Quantity", "Unit Price", "Total");
            System.out.println("-------------------------------------------------------------------------------------");

            for (int j = 0; j < order[i].length; j++) {
                Product p = order[i][j];
                System.out.printf("%-10d %-20s %-15d %-15s %-10s\n", p.prod_id, p.name, p.quantity, p.unit_price, p.total);
                sum += p.total;
            }

            System.out.println("-------------------------------------------------------------------------------------");
            System.out.println("Net Total: " + sum);
            System.out.println("=====================================================================================");
        }

        sc.close();
    }
}