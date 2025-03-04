package MODULE_1;

class Product {
    String pcode;   
    String pname;   
    int price;     


    public Product(String pcode, String pname, int price) {
        this.pcode = pcode;
        this.pname = pname;
        this.price = price;
    }


    public void display() {
        System.out.println("Car ID: " + pcode);
        System.out.println("Name: " + pname);
        System.out.println("Price: " + price);
        System.out.println("-------------------------------");
    }
}