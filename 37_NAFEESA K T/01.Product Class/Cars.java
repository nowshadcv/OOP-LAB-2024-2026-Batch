package MODULE_1;

import java.util.Scanner;

public class Cars {

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of cars: ");
        int n = sc.nextInt();
        sc.nextLine();

        Product[] product = new Product[n];



        for (int i = 0; i < n; i++) 
        {
            System.out.println("Enter the Details of Car " + (i + 1) + ":");
            System.out.println("Enter the car ID: ");
            String pcode = sc.nextLine(); 
            System.out.println("Enter the Name: ");
            String pname = sc.nextLine(); 
            System.out.println("Enter the Price: ");
            int price = sc.nextInt();
            sc.nextLine(); 

            product[i] = new Product(pcode, pname, price);  
        }


        System.out.println("\nCar Details:");
        for (int i = 0; i < n; i++) 
        {
            product[i].display();
        }


        Product lowest = product[0];
        for (int i = 1; i < n; i++) 
        {
            if (product[i].price < lowest.price)
            {
                lowest = product[i];
            }
        }


        System.out.println("\nDetails of the Lowest Priced Car:");
        lowest.display();
    }
}
