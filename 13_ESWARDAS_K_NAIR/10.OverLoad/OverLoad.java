package MODULE_2;
import java.util.Scanner;


public class OverLoad 
{

	public static void main(String[] args) 
	{
		OverLoadDemo ob = new OverLoadDemo();
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter the length of a side of the square:");
		float side = s.nextFloat();
		ob.area(side);
		
		System.out.println("Enter the length of the rectangle:");
		float length = s.nextFloat();
		System.out.println("Enter the width of the rectangle:");
		float width = s.nextFloat();
		ob.area(length,width);
		
		System.out.println("Enter the radius of the circle:");
		double radius = s.nextDouble();
		ob.area(radius);
	}

}
