package MODULE3;

import java.util.Scanner;

public class IFaceDemo {
    public static void main(String[] args) { 
        int ch; 
        Circle c = new Circle(); 
        Rectangle r = new Rectangle(); 
        Scanner sc = new Scanner(System.in); 
        
        System.out.println("1: Area of Circle \n2: Area of Rectangle  \n3: Perimeter of Circle \n4: Perimeter of Rectangle \n5: Exit"); 
        
        lp: while(true) { 
            System.out.print("Make your choice: "); 
            ch = sc.nextInt();
            sc.nextLine(); // Consume the newline left-over
            
            switch (ch) { 
                case 1: 
                    System.out.print("Enter the radius of the Circle: "); 
                    c.input(sc); 
                    c.area(); 
                    break; 
                case 2: 
                    System.out.print("Enter the length and breadth of the Rectangle: "); 
                    r.input(sc); 
                    r.area(); 
                    break; 
                case 3: 
                    System.out.print("Enter the radius of the Circle: "); 
                    c.input(sc); 
                    c.perimeter(); 
                    break; 
                case 4: 
                    System.out.print("Enter the length and breadth of the Rectangle: "); 
                    r.input(sc); 
                    r.perimeter(); 
                    break; 
                case 5: 
                    break lp; // Exit the loop
                default: 
                    System.out.println("Invalid choice! Please make a valid choice.");
            }
        }
        sc.close(); // Close the scanner after use
    }
}
