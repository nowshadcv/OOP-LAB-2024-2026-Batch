package MODULE3;
import java.util.Scanner;
public class OverLoadDemo {
	void area(float x) {
		System.out.println("the area of the square is "+Math.pow(x, 2)+" sq units");}
	void area (float x,float y) {
		System.out.println("the area of the rectangle is " +x*y+ " sq units");}
	void area(double x) {
		double z=3.14*x*x;
		System.out.println("the area of the circle is " +z+ " sq units");}
	public static class overload {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        OverLoadDemo ob = new OverLoadDemo();

        System.out.println("Enter the side of the square:");
        float squareSide = scanner.nextFloat();
        ob.area(squareSide);

        System.out.println("Enter the length and breadth of the rectangle:");
        float length = scanner.nextFloat();
        float breadth = scanner.nextFloat();
        ob.area(length, breadth);

        System.out.println("Enter the radius of the circle:");
        double radius = scanner.nextDouble();
        ob.area(radius);

        scanner.close();
	}
	}
}
    



