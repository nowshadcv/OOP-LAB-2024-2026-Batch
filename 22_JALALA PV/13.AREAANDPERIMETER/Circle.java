package MODULE3;
import java.util.Scanner;
interface AP{
	
	void input();
	void area();
	void perimeter();
	
}

public class Circle implements AP{
	int r=0;
	double pi=3.14,area=0,perimeter=0;
	public void input()
	{
		Scanner c=new Scanner(System.in);
		r=c.nextInt();
	}
	@Override
	public void area() {
		area=pi*r*r;
		System.out.println("Area of circle"+area);
		
	}
	@Override
	public void perimeter() {
		perimeter=2*pi*r;
		System.out.println("perimeter of circle "+perimeter);
		
	}

static class Rectangle implements AP{
	int l=0,b=0;
	double area,perimeter;
	@Override
	public void input() {
		// TODO Auto-generated method stub
		Scanner r=new Scanner(System.in);
		l=r.nextInt();
		b=r.nextInt();
		
		
	}

	@Override
	public void area() {
		// TODO Auto-generated method stub
		area=l*b;
	System.out.println("Area of rectangle"+area);
		
		
	}

	@Override
	public void perimeter() {
	perimeter=2*(l+b);
	System.out.println("perimeter of rectangle "+perimeter);
		
	}
	

public static class IFaceDemo{
	public static void main(String args[])
	{
		int ch;
		Circle c=new Circle();
		Rectangle r=new Rectangle();
		Scanner sc=new Scanner(System.in);
		System.out.println("1.Area of circle");
		System.out.println("2.Area of Rectangle");
		System.out.println("3.Perimeter of circle");
		System.out.println("4.Perimeter of circle");
		System.out.println("5.Program terminaton");
		Ip:while(true)
		{
			System.out.print("Make your choice");
			ch=sc.nextInt();
			switch(ch)
			{
			case 1:System.out.print("enter the radius of the circle");
			c.input();
			c.area();
			break;
			case 2:System.out.print("enetr the length and breadth of rectangle\n");
			r.input();
			r.area();
			break;
			case 3:
				System.out.print("enter the radius of the circle");
				c.input();
				c.perimeter();
				break;
			case 4:System.out.print("enetr the length and breadth of rectangle\n");
			r.input();
			r.perimeter();
			break;
			case 5:break Ip;
			default:System.out.print("invalid choice!please make a valid choice...");
			}
			
		}
	}
	
}}}
