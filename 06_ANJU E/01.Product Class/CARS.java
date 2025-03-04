
package MODULE1;

public class CARS
{
	
		 public static void main(String[] args)
		 {
			 PRODUCT p1=new PRODUCT();
			 p1.pcode="car123";
			 p1.pname="benz";
			 p1.price=1000;
			 System.out.println("display p1:");
			 p1.display();
			 PRODUCT p2=new PRODUCT("JAGUR","CAR456",25000);
			 System.out.println("display p2:");
			 p2.display();
			 PRODUCT p3=new PRODUCT("maruthi","car800",50000);
			 PRODUCT p=p3.getprice()<(p1.price<p2.price?p1.price:p2.price)?p3:(p1.price<p2.price?p1:p2);
			 System.out.println("\n   displaying product with lowest price:");
			 p.display();
		 
					 
			 
		 }
	}



