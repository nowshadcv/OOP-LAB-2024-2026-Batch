package module_3.interface_1;

import java.util.Scanner;

public class Rectangle implements AP {
	int l=0,b=0;
	double area,perimeter;
	public void input() {
		Scanner sc = new Scanner(System.in);
		l=sc.nextInt();
		b=sc.nextInt();
	}
	public void area() {
		area = l * b;
		System.out.println("Area of Rectangle is "+area);
	}
	public void perimeter() {
		perimeter = 2 * ( l + b );
		System.out.println("Perimeter of Rectangle is: "+perimeter);
	}
}
