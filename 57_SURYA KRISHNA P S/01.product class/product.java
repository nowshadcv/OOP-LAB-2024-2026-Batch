package MODULE1;

public class Product {
	String Pname,Pcode;
	int price;
	public Product() {}
	public Product(String Pname,String Pcode,int price)
	{
		this.Pname=Pname;
		this.Pcode=Pcode;
		this.price=price;
	}
	public void setPname(String Pname) {
		this.Pname=Pname;
		
	}
	public String getPcode() {
		return Pcode;
		
	}
	public String getPname() {
		return Pname;
	}
	public void setPcode(String Pcode) {
		this.Pcode=Pcode;
		
	}
	public int getprice() {
		return price;
	}
	public void setprice(int price) {
		this.price=price;
	
	}
	public void display() {
		System.out.println("Pcode:"+this.Pcode);
		System.out.println("Pname:"+this.Pname);
		System.out.println("price:"+this.price);
	}
	

}



