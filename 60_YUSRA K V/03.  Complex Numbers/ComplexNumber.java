package MODULE1;
import java.util.Scanner;
public class ComplexNumber 
{
	double real,img;
	ComplexNumber(double r,double i) 
	{
		real=r;img=i;}
	public static ComplexNumber sum(ComplexNumber c1,ComplexNumber c2)
	{
		ComplexNumber temp=new ComplexNumber(0,0);
		temp.real=c1.real+c2.real;
		temp.img=c1.img+c2.img;
		return temp;
		}
	
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter real part of first complexnumber:");
		double real1=s.nextDouble();
		System.out.println("Enter image part of first complexnumber:");
		double img1=s.nextDouble();
		ComplexNumber c1=new ComplexNumber(real1,img1);
		System.out.println("Enter real part of second complexnumber:");
		double real2=s.nextDouble();
		System.out.println("Enter image part of second complexnumber:");
		double img2=s.nextDouble();
		ComplexNumber c2=new ComplexNumber(real2,img2);
		ComplexNumber temp=sum(c1,c2);
		System.out.printf("sum is:"+temp.real+"+"+temp.img+"i");
	}
}