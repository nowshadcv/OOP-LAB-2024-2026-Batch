package MODULE1;

public class Product {
	String Pname,pcode;
	int price;
	public Product() {}
	public Product(String Pname,String pcode,int price) {
		this.Pname=	Pname;
		this.pcode=pcode;
		this.price=price;}
	public void setPname(String pname) {
		this.Pname=pname;
		}
	public String getpcode() {
		return pcode;}
	public String getPname() {
		return Pname;}
	public void setpcode(String pcode) {
		this.pcode=pcode;
		}
	public int getprice() {
		return price;
	}
		public void setPrice(int price) {
			this.price=price;}
		public void display() {
			System.out.println("pcode:"+this.pcode);
			System.out.println("Pname:"+this.Pname);
			System.out.println("price:"+this.price);
					 }}
		
