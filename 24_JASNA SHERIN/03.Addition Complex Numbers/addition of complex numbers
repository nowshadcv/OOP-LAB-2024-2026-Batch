package MODULE2;

import java.util.Scanner;

public class ComplexNumber {
	double real,img;
	ComplexNumber(double r,double i){
		real=r;
		img=i;
	}
	public static ComplexNumber sum(ComplexNumber c1,ComplexNumber c2) {
		ComplexNumber temp=new ComplexNumber(0,0);
		temp.real=c1.real+c2.real;
		temp.img=c1.img+c2.img;
		return temp;
	}
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 1st complex number:");
		double r1=sc.nextDouble();
		System.out.println("Enter imaginary partr:");
		double i1=sc.nextDouble();
		System.out.println("Enter 2nd complex number:");
		double r2=sc.nextDouble();
		System.out.println("Enter imaginary part:");
		double i2=sc.nextDouble();
		sc.close();
		ComplexNumber c1= new ComplexNumber(r1,i1);
		ComplexNumber c2= new ComplexNumber(r2,i2);
		ComplexNumber temp=sum(c1,c2);
		System.out.printf("Sum is:" + temp.real + "+" + temp.img + "i");
	} 

}
