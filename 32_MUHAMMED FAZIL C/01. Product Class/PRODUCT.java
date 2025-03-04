
package MODULE1;

public class PRODUCT {

	String pname,pcode;
	int price;
	public PRODUCT() {}
	public PRODUCT(String pname, String pcode, int price) {
		this.pname=pname;
		this.pcode=pcode;
		this.price=price;
	}
	public void setPname(String pname) {
		this.pname=pname;
	}
	public String getPcode() {
		return pcode;
	}
	public String getPname() {
		return pname;
	}
	public void setpcode(String pcode) {
		this.pcode=pcode;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price=price;
	}
	public void display() {
		System.out.println("pcode: "+ this.pcode);
		System.out.println("pname: "+ this.pname);
		System.out.println("price: "+ this.price);
	}
}