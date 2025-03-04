package MODULE1;
import java.util.Scanner;

public class Car {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Product p1 = new Product();
        System.out.print("Enter code for Product 1: ");
        p1.pcode = scanner.nextLine();
        System.out.print("Enter name for Product 1: ");
        p1.Pname = scanner.nextLine();
        System.out.print("Enter price for Product 1: ");
        p1.price =(int)scanner.nextDouble();

        Product p2 = new Product();
        scanner.nextLine(); // Consume leftover newline
        System.out.print("Enter code for Product 2: ");
        p2.pcode = scanner.nextLine();
        System.out.print("Enter name for Product 2: ");
        p2.Pname = scanner.nextLine();
        System.out.print("Enter price for Product 2: ");
        p2.price =(int)scanner.nextDouble();
        Product p3 = new Product();
        scanner.nextLine(); // Consume leftover newline
        System.out.print("Enter code for Product 3: ");
        p3.pcode = scanner.nextLine();
        System.out.print("Enter name for Product 3: ");
        p3.Pname = scanner.nextLine();
        System.out.print("Enter price for Product 3: ");
        p3.price = (int)scanner.nextDouble();

        scanner.close();
        System.out.println("Displaying p1:");
        p1.display();
        System.out.println("Displaying p2:");
        p2.display();
        System.out.println("Displaying p3:");
        p3.display();

        Product p = (p3.price < (p1.price < p2.price ? p1.price : p2.price)) ? p3 : (p1.price < p2.price ? p1 : p2);
        System.out.println("Displaying product with the lowest price:");
        p.display();
    }
}
