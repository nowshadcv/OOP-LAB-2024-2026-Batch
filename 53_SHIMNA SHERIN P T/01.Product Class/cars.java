
package MODULE1;

import java.util.Scanner;

public class cars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of products: ");
        int n = scanner.nextInt();
        scanner.nextLine(); 
        
        product[] products = new product[n];
        
        for (int i = 0; i < n; i++) {
            System.out.println("ENTER THE DETAILS OF PRODUCT " + (i + 1) );
            System.out.print("Enter product Code: ");
            String pcode = scanner.nextLine();
            System.out.print("Enter product Name: ");
            String pname = scanner.nextLine();
            System.out.print("Enter product Price: ");
            int price = scanner.nextInt();
            scanner.nextLine();  

           
            products[i] = new product(pname, pcode, price);

           
            System.out.println("Displaying product " + (i + 1) + ":");
            products[i].display();
        }

       
        product lowestPriceproduct = products[0]; 
        for (int i = 1; i < n; i++) {
            if (products[i].getPrice() < lowestPriceproduct.getPrice()) {
                lowestPriceproduct = products[i];
            }
        }

      
        System.out.println("\nDisplaying product with Lowest Price  :");
        lowestPriceproduct.display();

        
        scanner.close();
    }
}
