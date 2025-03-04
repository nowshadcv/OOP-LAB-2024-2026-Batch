package MODULE1;
import java.util.Scanner;

public class Cars {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter details for Product 1:");
        System.out.print("Enter Product Code: ");
        String pcode1 = scanner.nextLine();
        System.out.print("Enter Product Name: ");
        String pname1 = scanner.nextLine();
        System.out.print("Enter Product Price: ");
        int price1 = scanner.nextInt();
        scanner.nextLine();
		
        Product p1 = new Product(pname1, pcode1, price1);
		
		
		
		
		
		System.out.println("Enter details for Product 2:");
        System.out.print("Enter Product Code: ");
        String pcode2 = scanner.nextLine();
        System.out.print("Enter Product Name: ");
        String pname2 = scanner.nextLine();
        System.out.print("Enter Product Price: ");
        int price2 = scanner.nextInt();
        scanner.nextLine();
		
		Product p2=new Product(pname2,pcode2,price2);
		
		
		System.out.println("Enter details for Product 3:");
        System.out.print("Enter Product Code: ");
        String pcode3 = scanner.nextLine();
        System.out.print("Enter Product Name: ");
        String pname3 = scanner.nextLine();
        System.out.print("Enter Product Price: ");
        int price3 = scanner.nextInt();
        scanner.nextLine();
		
		Product p3 = new Product (pname3,pcode3,price3);
		
		System.out.println("Displaying p1:");
		p1.display();
		
		
		
	
		System.out.println("Dislaying p2: ");
		p2.display();
		
		System.out.println("Dislaying p3: ");
		p2.display();
	
		
		
		Product p=p3.getprice()<(p1.price<p2.price?p1.price:p2.price)?p3:(p1.price<p2.price?p1:p2);
		System.out.println("\nDisplaying produt with lowest price:");
		p.display();
		

	}

}
