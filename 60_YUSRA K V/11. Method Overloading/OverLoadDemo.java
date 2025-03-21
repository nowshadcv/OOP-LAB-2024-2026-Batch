package MODULE3;
import java.util.Scanner; 
public class OverLoadDemo {
	void area(float x) {
		System.out.println("The area of the square is "+Math.pow(x, 2)+"sq units");}
	void area(float x,float y) {
		System.out.println("The area of the rectangle is "+x*y+"sq units");}
	void area(double x) {
		double z=3.14*x*x;
		System.out.println("The area of the circle is "+z+" sq units");}
	public static class OverLoad {
		public static void main(String args[]) {
			Scanner sc = new Scanner(System.in); 
			OverLoadDemo ob=new OverLoadDemo();
			System.out.print("Enter the side  of the square: ");
			float squareSide = sc.nextFloat();
			ob.area(squareSide);
			
			System.out.print("Enter the length of the rectangle: ");
			float rectLength = sc.nextFloat();
			System.out.print("Enter the breadth of the rectangle: ");
			float rectbreadth = sc.nextFloat();
			ob.area(rectLength, rectbreadth);
			System.out.print("Enter the radius of the circle: ");
			double circleRadius = sc.nextDouble();
			ob.area(circleRadius);

			sc.close();
		}
	}
}

