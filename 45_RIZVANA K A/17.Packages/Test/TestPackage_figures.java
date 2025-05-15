package Test;
import figures.*;
import java.util.Scanner;
public class TestPackage_figures {
	public static void main (String args[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the side of Square:");
		int s = sc.nextInt();
		square sq = new square(s);
		System.out.println("perimeter:"+sq.perimeter());
		System.out.println("Area:"+sq.area());
		System.out.println("Enter the radius of Circle:");
		int r = sc.nextInt();
		circle ci =new circle(r);
		System.out.println("perimeter:"+ci.perimeter());
		System.out.println("Area:"+ci.area());
		
		System.out.println("Enter the side1 of Triangle:");
		int s1 = sc.nextInt();
		System.out.println("Enter the side2 of Triangle:");
		int s2 = sc.nextInt();
        System.out.println("Enter the side3 of Triangle:");
		int s3 = sc.nextInt();
		triangle tr=new triangle(s1,s2,s3);
		System.out.println("perimeter:"+tr.perimeter());
		System.out.println("Area:"+tr.area());



		


		

		
		
	}
}