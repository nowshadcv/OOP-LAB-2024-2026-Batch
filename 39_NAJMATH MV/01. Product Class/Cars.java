package MODULE1;
import java.util.Scanner;
public class Cars {
	public static void main(String[]args) {
		Scanner scanner=new Scanner(System.in);
		PRODUCT p1=new PRODUCT();
		System.out.print("enter code for product1:");
		p1.pcode=scanner.nextLine();
		System.out.print("enter name for product1:");
		p1.pname=scanner.nextLine();
		System.out.print("enter price for product1:");
		p1.price=scanner.nextInt();
		PRODUCT p2=new PRODUCT();
		scanner.nextLine();
		System.out.print("enter code for product2:");
		p2.pcode=scanner.nextLine();
		System.out.print("enter name for product2:");
		p2.pname=scanner.nextLine();
		System.out.print("enter price for product2:");
		p2.price=scanner.nextInt();
		PRODUCT p3=new PRODUCT();
		scanner.nextLine();
		System.out.print("enter code for product3:");
		p3.pcode=scanner.nextLine();
		System.out.print("enter name for product3:");
		p3.pname=scanner.next();
		System.out.print("enter price for product3:");
		p3.price=scanner.nextInt();
		scanner.close();
		System.out.println("Displaying p1:");
		p1.display();
		System.out.println("Displaying p2:");
		p2.display();
		System.out.println("Displaying p3:");
		p3.display();
		PRODUCT P=p3.getprice()<(p1.price<p2.price?p1.price:p2.price)?p3:(p1.price<p2.price?p1:p2);
		System.out.println("displaying product with lowest price:");
		P.display();
			}
	}
			
	
			
	


