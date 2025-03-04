package MODULE_1;

public class Product {
    String pcode;
    String pname;
    double price;

    public Product() {
    }

    public Product(String pname, String pcode, double price) {
        this.pname = pname;
        this.pcode = pcode;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void display() {
        System.out.println("Product Code: " + pcode);
        System.out.println("Product Name: " + pname);
        System.out.println("Product Price: " + price);
    }
}
