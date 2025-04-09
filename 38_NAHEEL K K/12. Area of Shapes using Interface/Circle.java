package module_3.interface_1;

import java.util.Scanner;

public class Circle implements AP{
	int r = 0;
	double area,perimeter,pi = 3.145;
	public void input() {
		Scanner sc = new Scanner(System.in);
		r = sc.nextInt();
	}
	public void area() {
		area = pi * r * r;
		System.out.println("Area of Cricle is: "+area);
	}
	public void perimeter() {
		perimeter =  2 * pi * r;
		System.out.println("Perimeter of Circle is: "+perimeter);
	}
}
