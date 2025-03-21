package MODULE3;
import java.util.Scanner;
public class OverLoadDemo {
	void area(int x) {
		System.out.println("The area of the square is "+Math.pow(x,2)+" sq units");
	}
	void area(float x,float y) {
		System.out.println("The area of rectangle is "+x*y+" sq units");
	}
	void area(double x) {
		double z=3.14*x*x;
		System.out.println("The area of circle is "+z+" sq units");
	}
	public static void main(String args[]) {
		OverLoadDemo ob=new OverLoadDemo();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a side:");
		int side=sc.nextInt();
		System.out.println("Enter the length:");
		float len=sc.nextFloat();
		System.out.println("Enter the width:");
		float wid=sc.nextFloat();
		System.out.println("Enter the radius:");
		double r=sc.nextDouble();
		ob.area(side);
		ob.area(len,wid);
		ob.area(r);
	}
}
