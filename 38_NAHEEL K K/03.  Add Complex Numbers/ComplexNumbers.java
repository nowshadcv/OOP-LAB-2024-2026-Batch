package module_1;

import java.util.Scanner;

public class ComplexNumbers {
	double real, img;
	public ComplexNumbers(double r, double i) {
		// TODO Auto-generated constructor stub
		real = r;
		img = i;
	}
	public static ComplexNumbers sum(ComplexNumbers c1, ComplexNumbers c2) {
		ComplexNumbers temp = new ComplexNumbers(0, 0);
		temp.real = c1.real + c2.real;
		temp.img = c1.img + c2.img;
		return temp;
	}
	public static void main(String[] args) {
//		 TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Real Part of Number 1");
		double n1 = sc.nextDouble();
		System.out.println("Enter i of number 1"); 
		double i1 = sc.nextDouble();
		System.out.println("Enter Real Part of Number 2");
		double n2 = sc.nextDouble();
		System.out.println("Enter i of number 2"); 
		double i2 = sc.nextDouble();
		ComplexNumbers c1 = new ComplexNumbers(n1,i1);
		ComplexNumbers c2 = new ComplexNumbers(n2,i2);
		ComplexNumbers temp = sum(c1,c2);
		System.out.println("Sum is: " + temp.real + " + " + temp.img + "i");
	}

}
