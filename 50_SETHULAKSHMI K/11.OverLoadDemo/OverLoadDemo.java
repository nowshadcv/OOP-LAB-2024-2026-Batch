package MODULE2;

import java.util.Scanner;

public class OverLoadDemo {
	void area(float x) {
		System.out.println("The area of the square is " + Math.pow(x , 2) + "sq units");
	}
	void area(float x, float y) {
		System.out.println("The area of the Rectangle is " + x*y + "sq units");
	}
	void area(double x) {
		double z=3.14 *x*x;
		System.out.println("The area of the circle is " + z + " sq units"); 
	}

	public static void main(String args[]) {
		OverLoadDemo ob = new OverLoadDemo();
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the side :");
		int side = scan.nextInt();
		System.out.println("Enter length of rectangle :");
		float len = scan.nextFloat();
		System.out.println("Enter Width of rectangle :");
		float wid = scan.nextFloat();
		System.out.println("Enter radius of circle :");
		float rad = scan.nextFloat();
		
		    ob.area(side);
			ob.area(len,wid);
			ob.area(rad);}
		}