package Module_1;

public class Product {
	String pname , pcode;
	int price;
	public Product () {}
	public Product (String pname, String pcode , int price) {
		this.pname = pname;
		this.pcode = pcode;
		this.price = price;
	}
	public void  setPname(String pname) {
		this.pname = pname;
	}
	public String getPname() {
		return pname;
	}
	public void  setPcode(String pcode) {
		this.pcode = pcode;
	}
	public String getPcode() {
		return pcode;
	}
	public void setPrice (int price) {
		this.price = price;
	}
	public int getPrice( ) {
		return price;
	}
	public void display() {
		System.out.println("Pcode :" +this.pcode);
		System.out.println("Pname :" +this.pname);
		System.out.println("Price :" +this.price);
	}
}
