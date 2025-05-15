package Test;
import figure.*;
import java.util.Scanner;

public class TestPackage_figre 
{
	public static void main(String args[]) 
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the side of squer");
	int s =sc.nextInt();
	Square sq=new Square(s);
	System.out.println("perimeter "+sq.perimeter());
	System.out.println("Area"+sq.area());
	System.out.println("enter the radius of circle");
	int r=sc.nextInt();
	Circle ci=new Circle(r);
	System.out.println("perimeter:"+ci.perimeter());
	System.out.println("enter the side 1 of triangle");
	int s1=sc.nextInt();
	System.out.println("enter the side 2 of triangle");
	int s2=sc.nextInt();
	System.out.println("enter the side 3 of triangle");
	int s3=sc.nextInt();
	System.out.println("enter the side 4 of triangle");
	int s4=sc.nextInt();
	Triangle t=new Triangle(s1,s2,s3);
	System.out.println("perimeter"+t.perimeter());
	System.out.println("area"+t.area());
	
	}
}