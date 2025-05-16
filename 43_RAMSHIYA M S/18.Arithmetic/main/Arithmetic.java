package Test;
import java.util.Scanner;

import Arithmetic.*;

public class Arithmetic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number 1");
		float num1=sc.nextFloat();
		float num2=sc.nextFloat();
		Divi d=new Divi(num1,num2);
		System.out.println("the division of "+d.DivAns());
		Multi  m=new Multi(num1,num2);
		System.out.println("the Multiplication of "+m.multi());
		add a=new Addition(num1,num2);
		System.out.println("the Addition of "+a.Ans());
		sub s=new sub(num1,num2);
		System.out.println("the subtration of "+s.subAns());
		

	}

}
