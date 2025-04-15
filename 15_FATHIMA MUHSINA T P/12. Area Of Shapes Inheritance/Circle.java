package MODULE3;

import java.util.Scanner;

class Circle implements AP { 
    int r = 0; 
    double pi = 3.14, area = 0, perimeter = 0; 
    
    @Override
    public void input(Scanner sc) { 
        r = sc.nextInt();
    } 
    
    @Override
    public void area() { 
        area = pi * r * r;
        System.out.println("Area of circle: " + area);
    } 
    
    @Override
    public void perimeter() { 
        perimeter = 2 * pi * r; 
        System.out.println("Perimeter of circle: " + perimeter); 
    }
}
