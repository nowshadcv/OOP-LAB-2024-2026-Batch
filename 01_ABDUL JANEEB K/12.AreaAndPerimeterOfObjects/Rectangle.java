package MODULE3;

import java.util.Scanner;

public class Rectangle implements AP
{
	int l = 0,b = 0;
	double area,perimeter;
	
	public void input()
	{
		Scanner c = new Scanner(System.in);
		l = c.nextInt();
		b = c.nextInt();
	}
	
	public void area()
	{
		area = l*b;
		System.out.println("Area of the rectangle:"+area);
	}
	public void perimeter()
	{
		perimeter = 2*(l+b);
		System.out.println("Perimeter of rectangle:"+perimeter);
	}
}
