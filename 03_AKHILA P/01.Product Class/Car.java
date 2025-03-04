package MODULE1;

import java.util.Scanner;

public class Cars {
	public static void main (String[] args) {
		System.out.println("enter the no of products");
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		s.nextLine();
		System.out.print("enter the product details");
		Product product [ ] = new Product [ n ] ;
		
		String pname, pcode ;
		int price ;
		for (int i =1; i<n; i++) {
			System.out.println(" Enter " + i + "product details");
			System.out.println(" Enter product name :");
			String name = s.nextLine( );
			pname = new String (name);
			System.out.println(" Enter product product code :");
			String code = s.nextLine( );
			pcode = new String (code);
			System.out.println(" Enter product product price :");
			price = s.nextInt();
			s.nextLine();
			Product prd = new Product (pname,pcode, price);
			prd.display();
			
			
			
			
			
		}
		
	}
}
