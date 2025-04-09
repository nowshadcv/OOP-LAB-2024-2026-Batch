package MODULE_2;

import java.util.Scanner;

public class OverLoadDemo {
    void area(float x) {
        System.out.println("The area of the Square is " + Math.pow(x, 2) + " sq.units");
    }

    void area(float x, float y) {
        System.out.println("The area of the rectangle is " + (x * y) + " sq.units");
    }

    void area(double x) {
        double z = 3.14 * x * x;
        System.out.println("The area of the Circle is " + z + " sq.units");
    }

    public static void main(String[] args) {
        OverLoadDemo ob = new OverLoadDemo();
        Scanner s = new Scanner(System.in);

        System.out.println("Enter the side length of the square: ");
        float squareSide = s.nextFloat();
        ob.area(squareSide);

        System.out.println("Enter the length and breadth of the rectangle: ");
        float length = s.nextFloat();
        float breadth = s.nextFloat();
        ob.area(length, breadth);

        System.out.println("Enter the radius of the circle: ");
        double radius = s.nextDouble();
        ob.area(radius);
    }
}
