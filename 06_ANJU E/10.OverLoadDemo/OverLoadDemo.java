


package MODULE2;
import java.util.Scanner;

public class OverLoadDemo {
   
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

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        OverLoadDemo ob = new OverLoadDemo();
        
       
        System.out.print("Enter the side length of the square: ");
        float squareSide = scanner.nextFloat();
        ob.area(squareSide);

      
        System.out.print("Enter the length of the rectangle: ");
        float rectangleLength = scanner.nextFloat();
        System.out.print("Enter the breadth of the rectangle: ");
        float rectangleBreadth = scanner.nextFloat();
        ob.area(rectangleLength, rectangleBreadth);

      
        System.out.print("Enter the radius of the circle: ");
        double circleRadius = scanner.nextDouble();
        ob.area(circleRadius);

        scanner.close(); // Close the scanner to prevent resource leak
    }}

	
