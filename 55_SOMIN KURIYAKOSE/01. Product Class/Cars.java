package MODULE1;
import java.util.Scanner;
public class Cars {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number of products:");
		int n=s.nextInt();
		s.nextLine();
		Product minProduct=null;
		for(int i=0;i<n;i++) {
			System.out.println("Enter details of product"+i+":");
			System.out.println("Enter Product Code:");
			String pcode=s.nextLine();
			System.out.println("Enter Product name:");
			String pname=s.nextLine();
			System.out.println("Enter Product price:");
			int price=s.nextInt();
			s.nextLine();
			Product p=new Product(pname,pcode,price);
			p.display();
			if(minProduct == null || p.getPrice()<minProduct.getPrice()) {
				minProduct=p;
			}
		}
		System.out.println("Displaying product with lowest price:");
		minProduct.display();
		s.close();
	}
}
		
		
		
	