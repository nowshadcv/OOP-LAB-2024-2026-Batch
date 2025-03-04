package MODULE1;
import java.util.Scanner; 

public class Cars {

	public static void main(String[] args) {
		Scanner Scanner= new  Scanner(System.in);
		System.out.println("Enter the Details of Product: ");
		System.out.print("Enter the product code");
		String pcode1=Scanner.nextLine();
		System.out.println("Enter the Product name: ");
		String pname1=Scanner.nextLine();
		System.out.println("Enter the Product price: ");
		int price1= Scanner.nextInt();
		Scanner.nextLine();
		
		Product p1=new Product(pname1, pcode1,price1);
		
		
		
		System.out.println("Enter the Details of Product ");
		System.out.print("Enter the product code");
		String pcode2=Scanner.nextLine();
		System.out.println("Enter the Product name: ");
		String pname2=Scanner.nextLine();
		System.out.println("Enter the Product price: ");
		int price2= Scanner.nextInt();
		Scanner.nextLine();
		
		Product p2=new Product(pname2, pcode2,price2);
		
		
		
		System.out.println("Enter the Details of Product ");
		System.out.print("Enter the product code");
		String pcode3=Scanner.nextLine();
		System.out.println("Enter the Product name: ");
		String pname3=Scanner.nextLine();
		System.out.println("Enter the Product price: ");
		int price3= Scanner.nextInt();
		Scanner.nextLine();
		
		Product p3=new Product(pname3, pcode3,price3);
		
		
		
		System.out.println("Displaying p1:");
		p1.display();
		
		
		System.out.println("Displaying p2: ");
		p2.display();
		
		
		System.out.println("Displaying p3: ");
		p3.display() ;
		
		
		Product p  =p3.getPrice()<(p1.price<p2.price?p1.price:p2.price)?p3:(p1.price<p2.price?p1:p2);
		System.out.println("\nDisplaying product with lowest price:" );	
		p.display();
		
				
				

	}

}
