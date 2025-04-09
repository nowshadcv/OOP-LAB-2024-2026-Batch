package MODULE3;

import java.util.Scanner;

public class IFaceDemo 
{

	public static void main(String[] args) 
	{
		int ch;
		Circle c = new Circle();
		Rectangle r = new Rectangle();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Options\n1 : Area of the circle");
		System.out.println("2 : Area of the rectangle");
		System.out.println("3 : Perimeter of the circle");
		System.out.println("4 : Perimeter of the rectangle");
		System.out.println("5 : Program termination");
		
		lp : while(true)
		{
			System.out.println("Enter your option:");
			ch = sc.nextInt();
			
			switch(ch)
			{
			case 1:
				System.out.print("Enter the radius of the circle:");
				c.input();
				c.area();
				break;
				
			case 2:
				System.out.print("Enter the length and breadth of the rectangle:");
				r.input();
				r.area();
				break;
				
			case 3:
				System.out.print("Enter the radius of the circle:");
				c.input();
				c.perimeter();
				break;
				
			case 4:
				System.out.print("Enter the length and breadth of the rectangle:");
				r.input();
				r.perimeter();
				break;
				
			case 5:
				System.out.print("Terminating the program....");
				break lp;
			
			default:
				System.out.println("Invalid option!! Select a valid option..");
			}
		}
		
		sc.close();
		
	}

}
