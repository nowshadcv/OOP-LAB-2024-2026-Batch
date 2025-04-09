package MODULE2;

import java.util.Scanner;

public class IFaceDemo {
	public static void main(String[] args) {
		int ch;
		Circle c=new Circle();
		Rectangle r=new Rectangle();
		Scanner sc=new Scanner(System.in);
		System.out.println("1:Area of circle");
		System.out.println("2:Area of Rectangle");
		System.out.println("3:Perimeter of circle");
		System.out.println("4:Perimeter of Rectangle");
		System.out.println("5:Program trmination");
		
		lP:while(true) {
			System.out.println("Make your choice:");
			ch=sc.nextInt();
			switch(ch) {
			case 1:
				System.out.print("Enter the radius of circle \n");
				c.input();
				c.area();
				break;
			case 2:
				System.out.print("Enter the length and breadth of rectangle\n");
				r.input();
				r.area();
				break;
			case 3:
				System.out.print("Enter the radius of circle \n");
				c.input();
				c.perimeter();
				break;
			case 4:
				System.out.print("Enter the length and breadth of rectangle\n");
				r.input();
				r.perimeter();
				break;
			case 5:
				break lP;
				default:
					System.out.println("Invalid choice!Please make a valid choice");
				
			}
		}
	}

	

}
