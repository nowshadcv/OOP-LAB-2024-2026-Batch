package module_3.interface_1;

import java.util.Scanner;

public class IFaceDemo {

	public static void main(String[] args) {
		int choice = 0;
		Circle c = new Circle();
		Rectangle r = new Rectangle();
		Scanner sc = new Scanner(System.in);
		System.out.println("1.Area of Circle\n2.Area of Rectangle");
		System.out.println("3.Perimeter of Circle\n4.Perimeter of Rectangle");
		System.out.println("5.Exit");
		lp: while(true) {
			System.out.println("Make your choice");
			choice = sc.nextInt();
			switch (choice) {
			case 1:
				System.out.println("Enter Radius: ");
				c.input();
				c.area();
				
				break;
			case 2:
				System.out.println("Enter length and breadth: ");
				r.input();
				r.area();
				break;
			case 3:
				System.out.println("Enter Radius: ");
				c.input();
				c.area();
				break;
			case 4:
				System.out.println("Enter length and breadth: ");
				r.input();
				r.area();				
				break;
			case 5:
				System.out.println("Exiting...");
//				System.exit(1);
				break lp;
			default:
				System.out.println("Invalid Choice");
				break;
			}
		}
	}

}
