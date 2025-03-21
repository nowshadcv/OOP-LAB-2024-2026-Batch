package MODULE_2;

import java.util.Scanner;

class OverLoadDemo {
    void area(int side) {
        System.out.println("Area of square: " + (side * side));
    }

    void area(int length, int breadth) {
        System.out.println("Area of rectangle: " + (length * breadth));
    }

    void area(double radius) {
        System.out.println("Area of circle: " + (Math.PI * radius * radius));
    }

    public static void main(String[] args) {
        OverLoadDemo ob = new OverLoadDemo();
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter side of the square: ");
        int side = scanner.nextInt();
        ob.area(side);

       
        System.out.print("Enter length and breadth of the rectangle: ");
        int length = scanner.nextInt();
        int breadth = scanner.nextInt();
        ob.area(length, breadth);

        
        System.out.print("Enter radius of the circle: ");
        double radius = scanner.nextDouble();
        ob.area(radius);

        scanner.close();
    }
}
