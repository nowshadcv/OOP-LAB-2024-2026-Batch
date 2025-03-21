package MODULE2;
import java.util.Scanner;
public class OverLoadDemo {
	void area (float x) {
		System.out.println("The area of the square is "+Math.pow(x, 2)+ " sq units");
	}
	void area(float x,float y) {
		System.out.println("The area of the rectangle is "+x*y+"sq units");
	}
	void area(double x) {
		double z=3.14*x*x;
		System.out.println("The area of the circle is "+z+"sq units");
	}

public static class OverLoad{
	public static void main(String args[]) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter side of square: ");
		float a=sc.nextFloat();
		System.out.print("Enter length of rectangle: ");
		float l=sc.nextFloat();
		System.out.print("Enter breadth of rectangle: ");
		float b=sc.nextFloat();
		System.out.print("Enter radius of circle(double): ");
		double r=sc.nextDouble();
		sc.close();
		OverLoadDemo ob=new OverLoadDemo();
		ob.area(a);
		ob.area(l,b);
		ob.area(r);
		
	}
	}
}



