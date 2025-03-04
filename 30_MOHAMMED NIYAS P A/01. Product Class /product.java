package MODULE1;

public class product {
	String pcode, pname;
	int price;
	public product(){} // Default Constructor
	public product(String pname, String pcode, int price) {
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
