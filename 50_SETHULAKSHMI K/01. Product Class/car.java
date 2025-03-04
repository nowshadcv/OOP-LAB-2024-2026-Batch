
package MODULE;

import java.util.Scanner;

public class car {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("enter the no of products ");
        int numProducts = scanner.nextInt();
        scanner.nextLine(); 
        product[] products = new product[numProducts];
        for (int i = 0; i < numProducts; i++) {
            System.out.println("\nEnter details for Product " + (i + 1) + ":");
            System.out.print("Enter Product Code: ");
            String pcode = scanner.nextLine();
            System.out.print("Enter Product Name: ");
            String pname = scanner.nextLine();
            System.out.print("Enter Product Price: ");
            int price = scanner.nextInt();
            scanner.nextLine();
            products[i] = new product(pname, pcode, price);
        }

        for (int i = 0; i < numProducts; i++) {
            System.out.println("\nDisplaying Product " + (i + 1) + ":");
            products[i].display();
        }

        product cheapestProduct = products[0];
        for (int i = 1; i < numProducts; i++) {
            if (products[i].getPrice() < cheapestProduct.getPrice()) {
                cheapestProduct = products[i];
            }
        }
        System.out.println("\nDisplaying the product with the lowest price:");
        cheapestProduct.display();

        scanner.close();
    }
}


