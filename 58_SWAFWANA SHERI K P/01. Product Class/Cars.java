package MODULE1;
import java.util.Scanner;
class Cars {

	public static void main(String[] args) {
		int price;
		String pname,pcode;
		Scanner S=new Scanner(System.in);
		Product p1=new Product();
		System.out.print("Enter the pcode of first object: ");
		p1.pcode=S.next();
		System.out.print("Enter the pname of first object: ");
		p1.pname=S.next();
		System.out.print("Enter the price of first object: ");
		p1.price=S.nextInt();
		Product p2=new Product();
		System.out.print("Enter the pcode of Second object: ");
		p2.pcode=S.next();
		System.out.print("Enter the pname of Second object: ");
		p2.pname=S.next();
		System.out.print("Enter the price of Second object: ");
		p2.price=S.nextInt();
		Product p3=new Product();
		System.out.print("Enter the pcode of Third object: ");
		p3.pcode=S.next();
		System.out.print("Enter the pname of Third object: ");
		p3.pname=S.next();
		System.out.print("Enter the price of Third object: ");
		p3.price=S.nextInt();
		System.out.println("Displaying p1:");
		p1.display();
		System.out.println("Displaying p2: ");
		p2.display();
		System.out.println("Displaying p3:");
		p3.display();
		Product p=p3.getPrice()<(p1.price<p2.price?p1.price:p2.price)?p3:(p1.price<p2.price?p1:p2);
		System.out.println("Displaying product with lowest price");
		p.display();
		

	}

}
