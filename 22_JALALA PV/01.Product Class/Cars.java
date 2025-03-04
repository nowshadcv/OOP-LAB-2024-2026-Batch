package MODULE1;
import java.util.Scanner;

public class Cars {

	public static void main(String[] args) {
	 Product p1=new Product();
	 Scanner s=new Scanner(System.in);
	 System.out.println("enter first product pcode");
	 p1.pcode=s.next();
	 System.out.println("enter first product pname");
	 p1.pname=s.next();
	 System.out.println("enter first product pprice");
	 p1.price=s.nextInt();
	 System.out.println("Displaying p1:");
	 p1.display();
	 Product p2=new Product();
	 System.out.println("enter second product pcode");
	 p2.pcode=s.next();
	 System.out.println("enter second product pname");
	 p2.pname=s.next();
	 System.out.println("enter second product pprice");
	 p2.price=s.nextInt();
	 System.out.println("Displaying p2:");
	 p2.display();
	 Product p3=new Product();
	 System.out.println("enter third product pcode");
	 p3.pcode=s.next();
	 System.out.println("enter third product pname");
	 p3.pname=s.next();
	 System.out.println("enter third product pprice");
	 p3.price=s.nextInt();
	 System.out.println("Displaying p3:");
	 p3.display();
	 Product p=p3.getPrice()<(p1.price<p2.price?p1.price:p2.price)?p3:(p1.price<p2.price?p1:p2);
	 System.out.println("Displaying product with lowest price");
	 p.display();
	}

}
