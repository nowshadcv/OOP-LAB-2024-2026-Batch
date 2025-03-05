package MODULE_1;
import java.util.Scanner;
public class ComplexNumber {

	double real, img;
	ComplexNumber(double r, double i) 
	{
		real = r; img = i;
	}
	
	public static ComplexNumber sum(ComplexNumber c1, ComplexNumber c2)
	{
		ComplexNumber temp = new ComplexNumber(0,0);
		temp.real = c1.real + c2.real;
		temp.img = c1.img + c2.img;
		return temp;
	}

	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		double num1,num2;
		System.out.println("Enter First number of C1:");
		num1 = s.nextDouble();
		System.out.println("Enter Second number of C1:");
		num2 = s.nextDouble();
		ComplexNumber c1 = new ComplexNumber(num1,num2);
		
		System.out.println("Enter First number of C2:");
		num1 = s.nextDouble();
		System.out.println("Enter Second number of C2:");
		num2 = s.nextDouble();
		ComplexNumber c2 = new ComplexNumber(num1,num2);
		
		ComplexNumber temp = sum(c1,c2);
		System.out.printf("Sum is:"+temp.real+"+"+temp.img+"i");
	}

}
