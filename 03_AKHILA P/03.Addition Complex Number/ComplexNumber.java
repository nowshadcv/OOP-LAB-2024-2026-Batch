package MODULE1;

import java.util.Scanner;

public class ComplexNumber {
	double real, img;
	ComplexNumber(double r, double i){
		real =r; img=i;}
	public static ComplexNumber Sum(ComplexNumber c1, ComplexNumber c2 ) {
		ComplexNumber temp = new ComplexNumber(0,0);
		temp.real = c1.real + c2.real;
		temp.img =c1.img +c2.img;
		return temp;
	}
	public static void main (String args[]) {
		double a, b, c, d;
		Scanner s = new Scanner(System.in);
		System.out.print("enter the value real");
		a=s.nextDouble();
		System.out.print("enter the value to imag");
		b=s.nextDouble();
		ComplexNumber c1 =new ComplexNumber(a,b);
		
		System.out.print("enter the value real");
		c=s.nextDouble();
		System.out.print("enter the value to imag");
		d=s.nextDouble();
		ComplexNumber c2 =new ComplexNumber(c,d);
		
		ComplexNumber temp = Sum(c1,c2);
		System.out.printf("sum is: " + temp.real+"+"+temp.img+ "+" +"i");
		 
		
	}
	
	

}
