package module1;

import java.util.Scanner;


public class car{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of products: ");
        int numProducts = sc.nextInt();
        sc.nextLine(); 
        product[] products = new product[numProducts];
        for (int i = 0; i < numProducts; i++) {
            System.out.println("\nEnter details for product " + (i + 1) + ":");

            System.out.print("Enter product code: ");
            String code = sc.nextLine();

            System.out.print("Enter product name: ");
            String name = sc.nextLine();

            System.out.print("Enter product price: ");
            int price = sc.nextInt();
            sc.nextLine(); 
            products[i] = new product(name, code, price);
        }
        System.out.println("\nDisplaying details of all products:");
        for (product p : products) {
            p.display();
        }
        product lowestPriceProduct = products[0];
        for (int i = 1; i < numProducts; i++) {
            if (products[i].getprice() < lowestPriceProduct.getprice()) {
                lowestPriceProduct = products[i];
            }
        }
        System.out.println("\nDisplaying product with the lowest price:");
        lowestPriceProduct.display();

        sc.close();
    }
}