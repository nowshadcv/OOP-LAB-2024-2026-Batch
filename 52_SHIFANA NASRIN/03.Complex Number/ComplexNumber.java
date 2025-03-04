package MODULE_1;

import  java.util.Scanner;

public class ComplexNumber {
	double real,img;
	
	ComplexNumber(double r, double i){
		real=r; img=i;}
	
	public static ComplexNumber sum(ComplexNumber c1, ComplexNumber c2) {
		ComplexNumber temp=new ComplexNumber(0,0);
		temp.real=c1.real+c2.real;
		temp.img=c1.img+c2.img;
		return temp;
		
	}
	
	

	public static void main(String[] args) {
		 Scanner s= new Scanner(System.in);
		 
		 System.out.println("enter the real part of first complex number");
		 double real1 = s.nextDouble();
		 
		 System.out.println("enter the imaginary part of first complex number");
		 double img1 = s.nextDouble();
		 
		 System.out.println("enter the real part of second complex number");
		 double real2=s.nextDouble();
		 
		 System.out.println("enter the imaginary part of second complex number");
		 double img2 = s.nextDouble();
		 
		ComplexNumber c1= new ComplexNumber(real1 ,img1);
		ComplexNumber c2= new ComplexNumber(real2 ,img2);
		ComplexNumber temp=sum(c1,c2);
		System.out.printf("sume is"+temp.real+"+"+temp.img+"i");
	}

}
