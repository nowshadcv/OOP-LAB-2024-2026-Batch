package Module_1;
import java.util.Scanner;
public class Cars {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("How many car you need to entered?");
		int size = sc.nextInt();
		sc.nextLine();
		Product product[] = new Product[size];
		for (int i = 0 ; i < size ; i++) {
			System.out.println("Enter the Car Code:");
			String code = sc.nextLine();
			System.out.println("Enter the Car Name:");
			String name = sc.nextLine();
			System.out.println("Enter the price:");
			int price = sc.nextInt();
			sc.nextLine();
			product[i] = new Product(name,code,price);
			
		}
		for (int i = 0 ; i < size ; i++) {
			product[i].display();
			System.out.println();
		}
		Product lowest = product[0];
		for (int i = 0 ;i < size ; i++) {
			if (product[i].price < lowest.price) {
				lowest = product[i];
			}
		}
		System.out.println("lowest price car:");
		lowest.display();
		sc.close();
	}
	
}
