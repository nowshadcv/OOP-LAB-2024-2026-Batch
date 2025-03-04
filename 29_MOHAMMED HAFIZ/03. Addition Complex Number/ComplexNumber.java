package MODULE1;

import java.util.Scanner;

public class ComplexNumber {
	double real ,img ;
	ComplexNumber(double r, double i)
	{
		real=r; img =i;
	}	
	public static ComplexNumber sum(ComplexNumber c1,ComplexNumber c2) 
	{
		ComplexNumber temp = new ComplexNumber(0,0) ;
		temp.real =c1.real + c2.real;
		temp.img = c1.img+c2.img;
		return temp;
	}
	public static void main(String[] args)
	{
		double p,q,m,n;

		Scanner s = new Scanner(System.in);
		System.out.print ("Enter the first real part :");
		p=s.nextInt();
		System.out.print ("Enter the first img part :");
		q=s.nextInt(); 
		System.out.print ("Enter the second real part :");
		m=s.nextInt();
		System.out.print ("Enter the second img part :");
		n=s.nextInt(); 
		ComplexNumber c1 = new ComplexNumber(p,q);
		ComplexNumber c2 = new ComplexNumber(m,n);
		ComplexNumber temp = sum(c1,c2);
		System.out.printf("sum is: "+ temp.real+ "+" +temp.img + "i");
	}

}

