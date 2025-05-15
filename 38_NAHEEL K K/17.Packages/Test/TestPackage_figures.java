package Test;
import figures.*;
import java.util.Scanner;

public class TestPackage_figures {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the side of Square : ");
		int s = sc.nextInt();
		Square sq = new Square(s);
		System.out.println("Perimeter : "+sq.perimeter());
		System.out.println("Area      : "+sq.area());
		
		System.out.println("Enter the radius of Circle : ");
		double r = sc.nextInt();
		Circle cr = new Circle(r);
		System.out.println("Perimeter : "+cr.perimeter());
		System.out.println("Area      : "+cr.area());
		
		System.out.println("Enter the side1 of Triangle : ");
		int s1 = sc.nextInt();
		System.out.println("Enter the side2 of Triangle : ");
		int s2 = sc.nextInt();
		System.out.println("Enter the side3 of Triangle : ");
		int s3 = sc.nextInt();
		
		Triangle tr = new Triangle(s1,s2,s3);
		System.out.println("Perimeter : "+sq.perimeter());
		System.out.println("Area      : "+sq.area());

		System.out.println("Enter the length of Rectangle : ");
		int len = sc.nextInt();
		System.out.println("Enter the breadth of Rectangle : ");
		int bre = sc.nextInt();

		Rectangle rect = new Rectangle(len,bre);
		System.out.println("Perimeter : "+rect.perimeter());
		System.out.println("Area      : "+rect.area());

	}
}


