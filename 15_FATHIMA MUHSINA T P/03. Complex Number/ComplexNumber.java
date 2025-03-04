package MODULE1;
import java.util.Scanner;
public class ComplexNumber {
	double real,img;
	ComplexNumber(double r,double i)
	{
		real=r;
		img=i;
	}
	public void display()
	{
		System.out.println(real+"+"+img+"i");
	}
	public static ComplexNumber sum(ComplexNumber c1,ComplexNumber c2)
	{
		ComplexNumber temp=new ComplexNumber (0,0);
		temp.real=c1.real+c2.real;
		temp.img=c1.img+c2.img;
		return temp;
	}
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter real part of first complex number :");
		double c1r=sc.nextDouble();
		System.out.println("Enter imaginary part of first complex number :");
		double c1i=sc.nextDouble();
		System.out.println("Enter real part of second complex number :");
		double c2r=sc.nextDouble();
		System.out.println("Enter imaginary part of second complex number :");
		double c2i=sc.nextDouble();
		sc.close();
		ComplexNumber c1=new ComplexNumber(c1r,c1i);
		System.out.println("First complex number :");
		c1.display();
		ComplexNumber c2=new ComplexNumber(c2r,c2i);
		System.out.println("Second complex number :");
		c2.display();		
		System.out.println("Sum of complex numbers :");
		ComplexNumber temp=sum(c1,c2);
		temp.display();
	}
}
