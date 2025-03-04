package MODULE1;

import java.util.Scanner;

public class cars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of products: ");
        int n = scanner.nextInt();
        scanner.nextLine();
        Product[] products = new Product[n];
        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for Product " + (i + 1) + ":");
            System.out.print("Enter Product Code: ");
            String code = scanner.nextLine();
            System.out.print("Enter Product Name: ");
            String name = scanner.nextLine();
            System.out.print("Enter Product Price: ");
            int price = scanner.nextInt();
            scanner.nextLine(); 

            products[i] = new Product(name, code, price);
        }
        System.out.println("\nDisplaying all products:");
        for (Product p : products) {
            p.display();
            System.out.println();
        }        
        Product lowestPriceProduct = products[0];
        for (int i = 1; i < n; i++) {
            if (products[i].getPrice() < lowestPriceProduct.getPrice()) {
                lowestPriceProduct = products[i];
            }
        }
        System.out.println("\nDisplaying product with the lowest price:");
        lowestPriceProduct.display();
        scanner.close();
    }
}
