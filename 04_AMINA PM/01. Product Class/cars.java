package MODULE1;

import java.util.Scanner;

public class cars {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter details for Product 1:");
        System.out.print("Enter Product Code: ");
        String pcode1 = scanner.nextLine();
        System.out.print("Enter Product Name: ");
        String pname1 = scanner.nextLine();
        System.out.print("Enter Product Price: ");
        int price1 = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        Product p1 = new Product(pname1, pcode1, price1);

        System.out.println("\nEnter details for Product 2:");
        System.out.print("Enter Product Code: ");
        String pcode2 = scanner.nextLine();
        System.out.print("Enter Product Name: ");
        String pname2 = scanner.nextLine();
        System.out.print("Enter Product Price: ");
        int price2 = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        Product p2 = new Product(pname2, pcode2, price2);

        System.out.println("\nEnter details for Product 3:");
        System.out.print("Enter Product Code: ");
        String pcode3 = scanner.nextLine();
        System.out.print("Enter Product Name: ");
        String pname3 = scanner.nextLine();
        System.out.print("Enter Product Price: ");
        int price3 = scanner.nextInt();

        Product p3 = new Product(pname3, pcode3, price3);

        System.out.println("\nDisplaying Product 1:");
        p1.display();
        System.out.println("\nDisplaying Product 2:");
        p2.display();
        System.out.println("\nDisplaying Product 3:");
        p3.display();

        Product p = p3.getPrice() < (p1.getPrice() < p2.getPrice() ? p1.getPrice() : p2.getPrice()) ? p3 : (p1.getPrice() < p2.getPrice() ? p1 : p2);
        System.out.println("\nDisplaying product with the lowest price:");
        p.display();

        scanner.close();
    }
}

