package MODULE1;

import java.util.Scanner;

class Cars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking user input for the first product
        System.out.print("Enter product name for p1: ");
        String pname1 = scanner.nextLine();
        System.out.print("Enter product code for p1: ");
        String pcode1 = scanner.nextLine();
        System.out.print("Enter product price for p1: ");
        int price1 = scanner.nextInt();

        Product p1 = new Product(pname1, pcode1, price1);
        System.out.println("Displaying p1:");
        p1.display();

        // Creating the second and third products
        Product p2 = new Product("Jaguar", "cars246", 250000);
        System.out.println("Displaying p2:");
        p2.display();
        Product p3 = new Product("BMW", "cars800", 50000);
        System.out.println("Displaying p3:");
        p3.display();

        // Finding the product with the lowest price
        Product p = p3.getprice() < (p1.getprice() < p2.getprice() ? p1.getprice() : p2.getprice()) ? p3 : (p1.getprice() < p2.getprice() ? p1 : p2);
        System.out.println("\nDisplaying product with the lowest price:");
        p.display();

        scanner.close();
    }
}

