package MODULE1;
import java.util.Scanner;

public class ComplexNumber {
	double real, img;
	
	 ComplexNumber(double r,double i) {
		 real =r ; img =i;}
	 
	 public static ComplexNumber sum(ComplexNumber c1, ComplexNumber c2) {
		 ComplexNumber temp= new ComplexNumber(0,0);
		 temp.real=c1.real+c2.real;
		 temp.img =c1.img +c2.img;
		 return temp;}
	

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.print("Enter the real part of the first complex number: ");
		double r1=sc.nextDouble();
		System.out.print("Enter the imaginary part of first complex number: ");
		double i1=sc.nextDouble();
		
		System.out.print("Enter the Real part  of the second complex number: ");
		double r2=sc.nextDouble();
		System.out.print("Enter the imaginary part of second complex number: ");
		double i2=sc.nextDouble();
		ComplexNumber c1=new ComplexNumber(r1,i1);
		ComplexNumber c2=new ComplexNumber(r2,i2);
		ComplexNumber temp =sum (c1,c2);
		System.out.printf("Sum is : " + temp .real + "+" + temp.img + "i");}

	

}
