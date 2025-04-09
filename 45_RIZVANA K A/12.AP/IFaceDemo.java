package Module2;

import java.util.Scanner;

public class IFaceDemo {

	public static void main(String [] args) {
		int ch;
		Circle c=new Circle ();
		Rectangle r=new Rectangle();
		Scanner sc=new Scanner (System.in);
		System.out.println("1: Area of circle");
		System.out.println("2: Area of rectangle");
		System.out.println("3: Perimeter of circle");
		System.out.println("4: Perimeter of rectangle");
		System.out.println("5: program termination");
		lp:while(true) {
			System.out.print("make your choice:");
			ch=sc.nextInt();
			switch(ch) {
			case 1:
				System.out.print("enter the radius of the circle \n");
				c.input();
				c.area();
				break;
			case 2:
				System.out.print("enter the length and breadth of the rectangle \n");
				r.input();
				r.area();
				break;
			case 3:
				System.out.print("enter the radius of the circle \n");
				c.input();
				c.perimeter();
				break;
			case 4:
				System.out.print("enter the length and breadth of the rectangle \n");
				r.input();
				r.perimeter();
				break;
			case 5:
				break lp;
			default:
				System.out.println("invalid choice ! please make a valid choice..");
				
			}
		}


		
	}

}
