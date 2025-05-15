package Arithmetic_op;
import java.util.Scanner;
import Arithmetic.*;
public class Arithmetic_opPackage_Arithmetic {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the first number:");
	double num1=sc.nextDouble();
	System.out.println("Enter the second number:");
	double num2=sc.nextDouble();
	
	Add a=new Add(num1,num2);
	System.out.println("Addition of two numbers:"+a.add());
	Sub s=new Sub(num1,num2);
	System.out.println("Subtraction of two numbers:"+s.Subtract());
	Mul m=new Mul(num1,num2);
	System.out.println("Multiplication of two numbers:"+m.Multiply());
	Div d=new Div(num1,num2);
	System.out.println("Division of two numbers:"+d.Divide());
	}

}
