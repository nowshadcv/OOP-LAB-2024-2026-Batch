/*package MODULE2;

import java.util.Scanner;

public class IFaceDemo {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ch;
		circle c=new circle();
		rectangle r=new rectangle();
		Scanner sc=new Scanner(System.in);
		System.out.println("1.area of circle"); 
		System.out.println("2.area of rectangle");
		System.out.println("3.perimeter of circle");
		System.out.println("4.perimeter of rectangle");
		System.out.println("5.program termination");
		lp:while(true)
		{System.out.print("make your choice:");
		ch=sc.nextInt();
		switch(ch){
			case 1:
				System.out.print("enter the radius if circle\n");
				c.input();
				c.area();
				break;
			case 2:
				System.out.print("enter the length and breadth of the rectangle\n");
				r.input();
				r.area();
				break;
			case 3:
				System.out.print("enter the radius  circle\n");
				c.input();
				c.perimeter();
				break;
			case 4:
				System.out.print("enter the length and breath of rectangle:");
				r.input();
				r.perimeter();
				break;
			case 5:
				break lp;
				default:
					System.out.println("invalid choice");
		}
		}}}*/
package MODULE2;

import java.util.Scanner;

public class IFaceDemo {

    public static void main(String[] args) {
        int ch;
        Circle c = new Circle();  // Ensure class name is capitalized for consistency
        Rectangle r = new Rectangle();
        Scanner sc = new Scanner(System.in);
        
        System.out.println("1. Area of Circle");
        System.out.println("2. Area of Rectangle");
        System.out.println("3. Perimeter of Circle");
        System.out.println("4. Perimeter of Rectangle");
        System.out.println("5. Program Termination");

        lp: while (true) {
            System.out.print("Make your choice: ");
            ch = sc.nextInt();

            switch (ch) {
                case 1:
                 
                    c.input();
                    c.area();
                    break;
                case 2:
                    System.out.print("Enter the length and breadth of the rectangle: ");
                    r.input();
                    r.area();
                    break;
                case 3:
                    System.out.print("Enter the radius of the circle: ");
                    c.input();
                    c.perimeter();
                    break;
                case 4:
                    System.out.print("Enter the length and breadth of the rectangle: ");
                    r.input();
                    r.perimeter();
                    break;
                case 5:
                    break lp;
                default:
                    System.out.println("Invalid choice, please try again.");
            }
        }
    }}
				
				
	