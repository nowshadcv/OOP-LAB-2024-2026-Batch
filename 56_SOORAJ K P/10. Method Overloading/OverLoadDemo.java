package MODULE2;
import java.util.Scanner;
public class OverLoadDemo {
	void area(float x) {
		System.out.println("The area of the square is "+Math.pow(x, 2)+"sq units");}
	void area(float x,float y) {
		System.out.println("The area of The reactangle is "+x*y+"sq units");}
	void area(double x) {
		double z=3.14 * x* x;
		System.out.println("The area of the circle is "+z+" sq units");}}
class Overload {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		OverLoadDemo ob =new OverLoadDemo();
		System.out.print("Enter the side of the Square");
		float squareside = sc.nextFloat();
		ob.area(squareside);
		
		System.out.print("Enter the length of the rectangle :");
		float rectlength = sc.nextFloat();
		System.out.println("Enter the width of the rectangle : ");
		float rectwidth = sc.nextFloat();
		ob.area(rectlength,rectwidth);

		System.out.print("Enter the radius of the circle : ");
		double circleRadius=sc.nextDouble();
		ob.area(circleRadius);
		sc.close();
		 }
	}
		

	


