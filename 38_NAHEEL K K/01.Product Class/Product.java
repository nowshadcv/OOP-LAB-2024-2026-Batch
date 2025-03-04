package module_1;

public class Product {
	String pcode, pname;
	int price;
	public Product(){} // Default Constructor
	public Product(String pname, String pcode, int price) {
		this.pcode = pcode;
		this.pname = pname;
		this.price = price;
	}
	public void display() {
		System.out.println("Pcode: "+this.pcode);
		System.out.println("Pname: "+this.pname);
		System.out.println("Price: "+this.price);
	}
}
