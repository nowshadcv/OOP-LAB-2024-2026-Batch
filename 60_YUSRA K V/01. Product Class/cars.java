package MODULE1;
import java.util.Scanner;
public class cars {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		Product p1=new Product();
		System.out.println("Enter code for product1:");
		p1.pcode=s.nextLine();
		System.out.println("Enter name for product1:");
		p1.pname=s.nextLine();
		System.out.println("Enter price for product1:");
		p1.price=s.nextInt();
		Product p2=new Product();
		s.nextLine();
		System.out.println("Enter code for product2:");
		p2.pcode=s.nextLine();
		System.out.println("Enter name for product2:");
		p2.pname=s.nextLine();
		System.out.println("Enter price for product2:");
		p2.price=s.nextInt();
		Product p3=new Product();
		s.nextLine();
		System.out.println("Enter code for product3:");
		p3.pcode=s.nextLine();
		System.out.println("Enter name for product3:");
		p3.pname=s.nextLine();
		System.out.println("Enter price for product3:");
		p3.price=s.nextInt();
		s.close();
		System.out.println("Displaying P1:");
		p1.display();
		System.out.println("Displaying P2:");
		p2.display();
		System.out.println("Displaying P3:");
		p3.display();
		Product p=(p3.price<(p1.price<p2.price?p1.price:p2.price))?p3:(p1.price<p2.price?p1:p2);
		System.out.println("Displaying Product with the lowest price:");
		p.display();
	}
}
		
		