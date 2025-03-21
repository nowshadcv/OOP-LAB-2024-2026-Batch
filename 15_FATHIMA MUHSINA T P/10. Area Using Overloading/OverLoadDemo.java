package MODULE2;
import java.util.Scanner;
class OverLoadDemo 
{
	void area(float x)
	{
		System.out.println("The area of square is "+ Math.pow(x,2) +"sq.unit");
	}
	void area(float x,float y)
	{
		System.out.println("The area of rectangle is "+(x*y) +"sq.unit");
	}
	void area(double x)
	{
		double z=3.14*x*x;
		System.out.println("The area of circle is "+ z +"sq.unit");
	}
	
		public static void main(String[] args) 
		{
			Scanner sc=new Scanner(System.in);
			OverLoadDemo ob=new OverLoadDemo();
			System.out.println("Enter side of square :");
			float s=sc.nextFloat();
			ob.area(s);
			System.out.println("Enter length of rectangle :");
			float l=sc.nextFloat();
			System.out.println("Enter breadth of rectangle :");
			float b=sc.nextFloat();
			ob.area(l,b);
			System.out.println("Enter radius of circle :");
			double r=sc.nextDouble();
			ob.area(r);
			sc.close();
		}

}