package MODULE1;

//import Product;
import java.util.Scanner;

public class cars {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("How many Cars you want to enter? ");
		int size = sc.nextInt();
		sc.nextLine();
		product[] product = new product[size];
		for(int i = 0; i < size; i++){
			System.out.println("Enter Details of Car "+(i+1));
			System.out.println();
			System.out.println("Enter ID of Car ");
			String id = sc.nextLine();
			System.out.println("Enter Name");
			String name = sc.nextLine();
			System.out.println("Enter Price");
			int price = sc.nextInt();
			sc.nextLine();
			product[i] = new product(id,name,price);


		}
		for(int i = 0; i < size; i++)
		{
			product[i].display();
		}
		product lowest = product[0];
        for (int i = 1; i < size; i++) {
            if (product[i].price < lowest.price) {
                lowest = product[i];
            }
        }
		// Product p = p3.price<(p1.price < p2.price ? p1.price:p2.price)?p3:(p1.price<p2.price?p1:p2);
		System.out.println("\nDetails of Lowest Priced Car");
		lowest.display();

	}
}
