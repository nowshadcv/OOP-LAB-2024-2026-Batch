package module_2;

import java.util.Scanner;

public class Overload {
	public static void main(String[] args) {
		
		OverloadDemo obj = new OverloadDemo();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Size of Square: ");
		int size = scanner.nextInt();
		System.out.println("Enter Length of Rectangle");
		int l = scanner.nextInt();
		System.out.println("Enter width of Rectangle");
		int w = scanner.nextInt();
		System.out.println("Enter Side of Triangle");
		double side = scanner.nextDouble();
		obj.area(size);
		obj.area(w, l);
		obj.area(side);
	}

}
