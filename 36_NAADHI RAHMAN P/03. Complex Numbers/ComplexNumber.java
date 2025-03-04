package MODULE1;
import java.util.Scanner;
public class Complex{
	double real,img;
	Complex(double r,double i){
		real=r;img=i;
	}
	public static ComplexNumber sum(ComplexNumber c1,ComplexNumber c2)
	{
		ComplexNumber temp=new ComplexNumber(0,0);
		temp.real=c1.real+c2.real;
		temp.img=c1.img+c2.img;
		return temp;
		
	}
	public static void main(String args[]) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter real part of first complexno");
		double real1=scanner.nextDouble();
		System.out.println("enter img part of first complexno");
		double img1=scanner.nextDouble();
		ComplexNumber c1=new ComplexNumber(real1,img1);
		System.out.println("enter real part of sec complexno");
		double real2=scanner.nextDouble();
		System.out.println("enter img part of sec complexno");
		double img2=scanner.nextDouble();
		ComplexNumber c2=new ComplexNumber(real2,img2);
		ComplexNumber temp=sum(c1,c2);
		System.out.printf("Sum is:"+temp.real+"+"+temp.img+"i");
		
	}

}
