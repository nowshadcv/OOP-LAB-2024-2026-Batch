package MODULE1;

public class Cars {
	public static void main(String[] args) {
		PRODUCT p1=new PRODUCT();
		p1.pcode="Car123";
		p1.pname="Benz";
		p1.price=10000;
		System.out.println("Displaying p1:");
		p1.display();

		PRODUCT p2=new PRODUCT("Jaguar","Car426",25000);
		System.out.println("Displaying p2:");
		p2.display();
		
		PRODUCT p3=new PRODUCT("Maruthi","Car800",50000);
		System.out.println("Displaying p3:");
		p3.display();
		
		PRODUCT p=p3.getPrice()<(p1.price<p2.price?p1.price:p2.price)?p3:(p1.price<p2.price?p1:p2);
		p.display();
	}}
		
		
	



	
		