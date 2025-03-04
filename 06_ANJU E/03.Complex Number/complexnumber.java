package MODULE1;

import java.util.Scanner;

public class complexnumber {
    double real, img;

    complexnumber(double r, double i) {
        real = r;
        img = i;
    }

    public static complexnumber sum(complexnumber c1, complexnumber c2) {
        complexnumber temp = new complexnumber(0, 0);
        temp.real = c1.real + c2.real;
        temp.img = c1.img + c2.img;
        return temp;
    }

    public static void main(String args[]) {
       
        Scanner sc = new Scanner(System.in);
        
       
        System.out.print("Enter real part of first complex number: ");
        double real1 = sc.nextDouble();
        System.out.print("Enter imaginary part of first complex number: ");
        double img1 = sc.nextDouble();
          
       
        System.out.print("Enter real part of second complex number: ");
        double real2 = sc.nextDouble();
        System.out.print("Enter imaginary part of second complex number: ");
        double img2 = sc.nextDouble();
        
        
        complexnumber c1 = new complexnumber(real1, img1);
        complexnumber c2 = new complexnumber(real2, img2);

       
        complexnumber temp = sum(c1, c2);

      
        System.out.printf("sum is :"+temp.real+"+"+temp.img+"i")
        ;
        
      
       
    }
}
