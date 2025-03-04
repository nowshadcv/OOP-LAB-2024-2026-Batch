package MODULE1;
import java.util.Scanner;

public class cars {
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the number of products: ");
        int n = s.nextInt();
        s.nextLine();
        Product minProduct = null;
        for (int i = 1; i <= n; i++) 
        {
            System.out.println("Enter details for product " + i + ":");
			System.out.print("Enter product code :");
			String code=s.nextLine();
			System.out.print("Enter product name :");
			String name=s.nextLine();
			System.out.print("Enter price of product:");
			int price=s.nextInt();
			s.nextLine();
			Product product = new Product(name, code, price);
			System.out.println("Details for product " + i + ":");
			product.display();
			if (minProduct == null || product.getPrice() < minProduct.getPrice()) 
			{
                minProduct = product;
			}
        }
		
		System.out.println("Displaying product with lowest price :");
		minProduct.display();
		s.close();
	}
}
