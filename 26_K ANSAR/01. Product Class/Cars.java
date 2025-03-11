package MODULE1;

import java.util.Scanner;

class Product {
    String pname;
    String pcode;
    int price;

    public Product(String pname, String pcode, int price) {
        this.pname = pname;
        this.pcode = pcode;
        this.price = price;
    }

    public Product() {}
    public void display() {
        System.out.println("Product Code: " + pcode);
        System.out.println("Product Name: " + pname);
        System.out.println("Product Price: " + price);
    }

    public int getPrice() {
        return price;
    }
}

public class Cars {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("How many products would you like to enter? ");
        int numProducts = scanner.nextInt();
        scanner.nextLine(); 
        Product[] products = new Product[numProducts];
        for (int i = 0; i < numProducts; i++) {
            System.out.println("\nEnter details for Product " + (i + 1) + ":");
            System.out.print("Enter Product Code: ");
            String pcode = scanner.nextLine();
            System.out.print("Enter Product Name: ");
            String pname = scanner.nextLine();
            System.out.print("Enter Product Price: ");
            int price = scanner.nextInt();
            scanner.nextLine();
            products[i] = new Product(pname, pcode, price);
        }

        for (int i = 0; i < numProducts; i++) {
            System.out.println("\nDisplaying Product " + (i + 1) + ":");
            products[i].display();
        }

        Product cheapestProduct = products[0];
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
