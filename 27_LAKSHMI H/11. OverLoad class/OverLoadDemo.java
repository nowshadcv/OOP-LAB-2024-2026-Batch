package MODULE2;
import java.util.Scanner;
public class OverLoadDemo {
	void area(float x) {
		System.out.println("The area of square is:"+Math.pow(x, 2)+" sq units");
	}
	void area(float x,float y) {
		System.out.println("The area of the rectangle is:"+x*y+" sq units");
	}
	void area(double x) {
		double z=3.14*x*x;
		System.out.println("The area of the circle is:"+z+" sq units");
	}
}

class OverLoad{
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		OverLoadDemo ob=new OverLoadDemo();
		
		System.out.println("Enter the side of the square:");
		float squareSide=sc.nextFloat();
		ob.area(squareSide);
		
		System.out.println("Enter the length of rectangle:");
		float length=sc.nextFloat();
		System.out.println("Enter the breadth of rectangle:");
		float breadth=sc.nextFloat();
		ob.area(length,breadth);
		
		System.out.println("Enter the radius:");
		double radius=sc.nextDouble();
		ob.area(radius);
		sc.close();
	}
}
