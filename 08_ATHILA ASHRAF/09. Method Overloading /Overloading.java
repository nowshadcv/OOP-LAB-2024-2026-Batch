package mo2;

import java.util.Scanner;

class OverLoadDemo {
    void area(float x) {
        System.out.println("The area of the square is " + Math.pow(x, 2) + " sq units");
    }

    void area(float x, float y) {
        System.out.println("The area of the rectangle is " + (x * y) + " sq units");
    }

    void area(double x) {
        double z = 3.14 * x * x;
        System.out.println("The area of the circle is " + z + " sq units");
    }
}

class Overload {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        OverLoadDemo ob = new OverLoadDemo();

        System.out.print("Enter the side of the square: ");
        float squareSide = sc.nextFloat();
        ob.area(squareSide);

        System.out.print("Enter the length of the rectangle: ");
        float rectLength = sc.nextFloat();
        System.out.print("Enter the width of the rectangle: ");
        float rectWidth = sc.nextFloat();
        ob.area(rectLength, rectWidth);

        System.out.print("Enter the radius of the circle: ");
        double circleRadius = sc.nextDouble();
        ob.area(circleRadius);

        sc.close();
    }
}
