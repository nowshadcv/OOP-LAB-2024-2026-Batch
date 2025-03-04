package MODULE1;
import java.util.Scanner;
public class Cars {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number of products:");
		int n=s.nextInt();
		s.nextLine();
		Product minProduct=null;
		for(int i=1;i<=n;i++) {
			System.out.println("Enter the details of the product"+i+":");
			System.out.print("Enter the product code:");
			String pcode=s.nextLine();
			System.out.print("Enter the product name:");
			String pname=s.nextLine();
			System.out.print("Enter the product price:");
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
