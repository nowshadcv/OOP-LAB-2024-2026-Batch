package MODULE1;
import java.util.Scanner;

public class ComplexNumber {
	double real,img;
	ComplexNumber(double r,double i){
		real=r; img=i;}
		public static ComplexNumber sum(ComplexNumber c1,ComplexNumber c2) {
			ComplexNumber temp=new ComplexNumber(0,0);
			temp.real=c1.real+c2.real;
			temp.img=c1.img+c2.img;
			return temp;}
		public static void main(String args[]) {
			Scanner s=new Scanner(System.in);
			System.out.print("enter real part of first complex number:");
			double c1r=s.nextDouble();
			System.out.print("enter imaginary part of first complex number:");
			double c1i=s.nextDouble();
			System.out.print("enter real part of second complex number:");
			double c2r=s.nextDouble();
			System.out.print("enter imaginary part of second complex number:");
			double c2i=s.nextDouble();

			
			ComplexNumber c1=new ComplexNumber(c1r,c1i);
			ComplexNumber c2=new ComplexNumber(c2r,c2i);
			ComplexNumber temp=sum(c1,c2);
			System.out.printf("sum is:" +temp.real+"+"+temp.img+"i");}
		
			
		
	}

