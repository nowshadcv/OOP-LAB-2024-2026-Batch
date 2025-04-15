package MODULE3;

import java.util.Scanner;

class Rectangle implements AP { 
    int l = 0, b = 0; 
    double area, perimeter; 
    
    @Override
    public void input(Scanner sc) { 
        l = sc.nextInt(); 
        b = sc.nextInt();
    } 
    
    @Override
    public void area() { 
        area = l * b; 
        System.out.println("Area of rectangle: " + area);
    } 
    
    @Override
    public void perimeter() { 
        perimeter = 2 * (l + b); // Corrected the typo here
        System.out.println("Perimeter of Rectangle: " + perimeter);
    }
}
