package MODULE2;
import java.util.Scanner;
public class OverLoadDemo {
	void area(int x) {
		System.out.println("The area of the square is"+Math.pow(x, 2)+"sq units");}
	void area(float x,float y) {
		System.out.println("The area of rectangle is "+x*y+"sq units");}
	void area (double x) {
		double z=3.14*x*x;
		System.out.println("The area of the circle is" +z+"sq units");}
	

	public static void main(String args[]) {
		OverLoadDemo ob=new OverLoadDemo();
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter side of square");
		int side = scan.nextInt();
		System.out.println("Enter length");
		float len = scan.nextFloat();
		System.out.println("Enter y");
		float wid = scan.nextFloat();
		System.out.println("Enter the radius");
		float r=scan.nextFloat();		
		ob.area(side);
		ob.area(len,wid);
    	ob.area(r);
	}

}
