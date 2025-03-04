package MODULE1;

public class Cars 
{
	
		public static void main(String [] args)
		{
			Product p1=new Product ();
			p1.pcode="car123";
			p1.pname="Benz";
			p1.price=10000;
			System.out.println("displaying p1:");
			p1.display();
			Product p2=new Product("jaguar","car426",25000);
			System.out.println("displaying p2:");
			p2.display();
			Product p3=new Product("maruthi","car800",50000);
			System.out.println("displaying p3:");
			p3.display();
			Product p=p3.getprice()<(p1.price<p2.price?p1.price:p2.price)?p3:(p1.price<p2.price?p1:p2);
			System.out.println("\n displaying product with lowest price:");
			p.display();
		}
	


}
