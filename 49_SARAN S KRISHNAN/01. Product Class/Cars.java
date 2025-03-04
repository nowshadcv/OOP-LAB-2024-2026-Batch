package MODULE_1;
import java.util.Scanner;

public class Cars {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of cars: ");
        int numCars = sc.nextInt();
        sc.nextLine();
        Product[] products = new Product[numCars];
        for (int i = 0; i < numCars; i++) {
            System.out.println("Enter details for product " + (i + 1) + ":");
            System.out.print("Enter product code: ");
            String pcode = sc.nextLine();
            System.out.print("Enter product name: ");
            String pname = sc.nextLine();
            System.out.print("Enter product price: ");
            double price = sc.nextDouble();
            sc.nextLine();
            products[i] = new Product(pname, pcode, price);
            System.out.println("Displaying product " + (i + 1) + ":");
            products[i].display();
        }
        Product lowestPriceProduct = products[0];
        for (int i = 1; i < numCars; i++) {
            if (products[i].getPrice() < lowestPriceProduct.getPrice()) {
                lowestPriceProduct = products[i];
            }
        }
        System.out.println("\nDisplaying product with the lowest price:");
        lowestPriceProduct.display();
        sc.close();
    }
}

