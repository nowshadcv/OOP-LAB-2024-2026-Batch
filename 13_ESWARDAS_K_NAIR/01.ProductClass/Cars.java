package Module_1;
import java.util.Scanner;

public class Cars {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int objs, price;
        String name, code;
        int lowpr = Integer.MAX_VALUE;
        Product lowestPricedProduct = null;
        
        System.out.println("Enter the number of objects:");
        objs = s.nextInt();

        for (int i = 0; i < objs; i++) {
            s.nextLine();
            System.out.println("Enter the car product code:");
            code = s.nextLine();
            System.out.println("Enter the car name:");
            name = s.nextLine();
            System.out.println("Enter the car price:");
            price = s.nextInt();
            Product p = new Product(code, name, price);
            p.display();

            if (price < lowpr) {
                lowpr = price;
                lowestPricedProduct = p;
            }
        }
        
        if (lowestPricedProduct != null) {
            System.out.println("\nDisplaying product with lowest value:");
            lowestPricedProduct.display();
        }
    }
}
