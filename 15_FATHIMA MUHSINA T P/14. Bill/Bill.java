package MODULE3;

import java.util.*;

public class Bill 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter no. of orders: ");
        int n = sc.nextInt();

        ProductB[][] order = new ProductB[n][];

        for (int i = 0; i < n; i++) 
        {
            System.out.print("Enter number of products for Order " + (i + 1) + ": ");
            int m = sc.nextInt();

            order[i] = new ProductB[m];
            Set<Integer> productIds = new HashSet<>();
            for (int j = 0; j < m; j++) 
            {
                System.out.println("\nEnter details for Product " + (j + 1) + ":");

                System.out.print("Product Name: ");
                String name = sc.next();

                int id;
                while (true) 
                {
                    System.out.print("Product ID: ");
                    id = sc.nextInt();
                    sc.nextLine();
                    if (productIds.contains(id)) 
                    {
                        System.out.println(" Error: Product ID already used in this order. Please enter a unique Product ID.");
                    } 
                    else 
                    {
                        productIds.add(id);
                        break;
                    }
                }
                System.out.print("Quantity: ");
                int quantity = sc.nextInt();
                sc.nextLine();
                System.out.print("Unit Price: ");
                int unitPrice = sc.nextInt();
                sc.nextLine();
                ProductB pb = new ProductB(name, id, quantity, unitPrice);
                pb.calculate();
                order[i][j] = pb;
            }
        }

        for (int i = 0; i < n; i++) 
        {
            int sum = 0;

            System.out.println("\nOrder No: " + (i + 1));
            Date date = java.util.Calendar.getInstance().getTime();
            System.out.println("Date    : " + date);
            System.out.println("---------------------------------------------------------------");
            System.out.printf("%-10s %-15s %-10s %-12s %-10s\n", 
                              "Prod ID", "Name", "Quantity", "Unit Price", "Total");
            System.out.println("---------------------------------------------------------------");

            for (int j = 0; j < order[i].length; j++) 
            {
                ProductB p = order[i][j];
                System.out.printf("%-10d %-15s %-10d %-12d %-10d\n", 
                                  p.prod_id, p.name, p.quantity, p.unit_price, p.total);
                sum += p.total;
            }

            System.out.println("---------------------------------------------------------------");
            System.out.printf("Net Amount: %d\n", sum);
            System.out.println("---------------------------------------------------------------\n");
        }

        sc.close();
    }
}
