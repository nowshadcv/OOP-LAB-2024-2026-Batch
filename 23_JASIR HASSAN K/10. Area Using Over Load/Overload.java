package Module_2;

import java.util.Scanner;

public class Overload {
	public static void main (String[] args) {
		Scanner s = new Scanner(System.in);
		OverLoadDemo sc = new OverLoadDemo();
		System.out.println("Enter the square side :");
		float a = s.nextFloat();
		sc.area(a);
		System.out.println("Enter the rectangle lenght :");
		float l = s.nextFloat();	
		System.out.println("Enter the rectangle breath :");
		float b = s.nextFloat();
		sc.area(l, b);
		System.out.println("Enter the Circle radius :");
		double r = s.nextDouble();
		sc.area(r);
		
	}

}
