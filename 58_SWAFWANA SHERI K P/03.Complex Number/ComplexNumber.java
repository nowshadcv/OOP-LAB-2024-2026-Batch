package MODULE1;
import java.util.Scanner;
public class ComplexNumber
{
	double real,img;
	ComplexNumber(double r,double i)
	{
	real=r;img=i;
	}
	public static ComplexNumber sum(ComplexNumber c1,ComplexNumber c2)
	{
		ComplexNumber temp=new ComplexNumber(0,0);
		temp.real=c1.real+c2.real;
		temp.img=c1.img+c2.img;
		return temp;
	}

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter real part of first number: ");
		double real1=sc.nextDouble();
		System.out.print("Enter imaginary part of first number: ");
		double img1=sc.nextDouble();
		ComplexNumber c1=new ComplexNumber(real1,img1);
		System.out.print("Enter real part of second number: ");
		double real2=sc.nextDouble();
		System.out.print("Enter imaginary part of second number: ");
		double img2=sc.nextDouble();
		ComplexNumber c2=new ComplexNumber(real2,img2);
		ComplexNumber temp=sum(c1,c2);
		System.out.printf("Sum is: "+temp.real+"+"+temp.img+"i");
	}

}
