package MODULE1;

import java.util.Scanner;

public class ComplexNumbers {
	double real,img;
	ComplexNumber(double r,double i) {
		real = r ;
		img = i ;
	}
	public static ComplexNumber sum(ComplexNumber c1,ComplexNumber c2) {
		ComplexNumber temp = new ComplexNumber(0,0);
		temp.real = c1.real + c2.real;
		temp.img = c1.img + c2.img;
		return temp;
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the first real number:");
		double real1 = scanner.nextDouble();
		System.out.println("Enter the first imaginary number:");
		double img1 = scanner.nextDouble();
			
		System.out.println("Enter the second real number:");
		double real2 = scanner.nextDouble();
		System.out.println("Enter the second imaginary number:");
		double img2 = scanner.nextDouble();
			
			
			
			
		ComplexNumber c1 = new ComplexNumber(real1,img1);
		ComplexNumber c2 = new ComplexNumber(real2,img2);
		ComplexNumber temp =sum(c1,c2);
		System.out.printf("Sum is :"+temp.real+"+"+temp.img +"i");// TODO Auto-generated method stub

		scanner.close();
	}

}
