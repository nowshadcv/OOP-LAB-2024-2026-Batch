package MODULE_1;

public class Product {

    String pname, pcode;
    int price;

    public Product() {}

    public Product(String pname, String pcode, int price) {
        this.pname = pname;
        this.pcode = pcode;
        this.price = price;
    }

  
    public void setPname(String pname) {
        this.pname = pname;
    }

    public String getPname() {
        return pname;
    }

    public void setPcode(String pcode) {
        this.pcode = pcode;
    }

    public String getPcode() {
        return pcode;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void display() {
        System.out.println("Product Code: " + this.pcode);
        System.out.println("Product Name: " + this.pname);
        System.out.println("Product Price: " + this.price + "\n");
    }
}



