package MODULE_3;

import java.util.Scanner;

interface AP
{
	
	void input();
	void area();
	void perimeter();
}

class Circle implements AP
{
	int r=0;
	double pi = 3.14,
	area = 0,
	perimeter = 0;

	public void input()
	{
		Scanner c = new Scanner(System.in);
		r=c.nextInt();
	}
	public void area()
	{
		area = pi * r* r;
		System.out.println("Area of Circle : " +area);
	}
	public void perimeter()
	{
		perimeter = 2 * pi * r;
		System.out.println("Perimeter of circle : " + perimeter);
		
	}
}

class Rectangle implements AP
{
	int l=0,b=0;
	double area,perimeter;
	public void input()
	{
		Scanner r = new Scanner (System.in);
		l = r.nextInt();
		b=r.nextInt();
	}
	public void area()
	{
		area = l*b;
		System.out.println("Areab of rectangle" + area);
	}
	public void perimeter()
	{
		perimeter =2 * (l+b);
		System.out.println("Perimeter of Rectangle : " + perimeter);
		
	}
}


public class InterfaceDemo
{
	public static void main(String [] args)
	{
		int ch;
		Circle c = new Circle();
		Rectangle r = new Rectangle();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1.Area of Circle");
		System.out.println("2.Area of Rectangle");
		System.out.println("3.Perimeter of Circle");
		System.out.println("4.perimeter of Rectangle");
		System.out.println("5.Program Termination");
		
		lp : while(true)
		{
			System.out.print("Make Your Choice");
			ch = sc.nextInt();
			switch (ch)
			{
			case 1:
				System.out.print("Enter the radius ofthe circle : \n");
				c.input();
				c.area();
				break;
				
			case 2:
				System.out.print("Enter the length and breadth of the rectangle : \n");
				c.input();
				c.area();
				break;
				
			case 3:
				System.out.print("Enter the radius of the circle : \n");
				c.input();
				c.perimeter();
				break;
				
			case 4:
				System.out.print("Enter the length and breadth of the rectangle: \n");
				c.input();
				c.area();
				break;
			case 5 :
				break lp;
			 default:
				 System.out.println("Invalid choice!!Please enter a valid choice");
				
			}
			
		}
	}
}