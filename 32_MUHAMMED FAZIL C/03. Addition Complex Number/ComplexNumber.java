package MODULE1;

import java.util.Scanner;

public class ComplexNumber {
	
	double real, img;
	ComplexNumber(double r,double i){
		real = r; img=i;
	}
	
	public static ComplexNumber sum(ComplexNumber c1,ComplexNumber c2) {
		ComplexNumber temp = new ComplexNumber(0,0);
		temp.real = c1.real + c2.real ;
		temp.img =c1.img +c2.img;
		return temp;
	}
	public static void main(String[] args) {
		Scanner s = new Scanner (System.in);
		System.out.print("Enter real part of Complex Number");
		double real1 = s.nextDouble();
		System.out.print("Enter imaginary part of Complex Number");
		double img1 = s.nextDouble();
		System.out.print("Enter real part of Complex Number");
		double real2 = s.nextDouble();
		System.out.print("Enter imaginary part of Complex Number");
		double img2 = s.nextDouble();
		
		ComplexNumber complex1 = new ComplexNumber(real1, img1);
        ComplexNumber complex2 = new ComplexNumber(real2, img2);
        
		ComplexNumber temp = sum(complex1,complex2);
		System.out.printf("Sum is :"+ temp.real + "+" + temp.img + "i");
	}
}
