package Test;
import java.util.Scanner;
import Arithmetic.*;
public class Calc 
{

	public static void main(String[] args) 
	{
		System.out.println("Calculator");
		System.out.println("-----------");
		int num1,num2;
		Scanner s = new Scanner(System.in);
		
		int option=0;
		System.out.println("Operations:\n1.Addition\n2.Subtraction\n3.Multiplication\n4.Division\n5.Exit");
		while(option!=5)
		{
			System.out.println("Enter your option:");
			option = s.nextInt();
			
			switch(option)
			{
			case 1:
				System.out.println("Enter number 1:");
				num1 = s.nextInt();
				System.out.println("Enter number 2:");
				num2 = s.nextInt();
				Add add = new Add(num1,num2);
				System.out.println("Sum of "+num1+" & "+num2+" is:"+add.opr());
				break;
			case 2:
				System.out.println("Enter number 1:");
				num1 = s.nextInt();
				System.out.println("Enter number 2:");
				num2 = s.nextInt();
				Sub sub = new Sub(num1,num2);
				System.out.println("Difference of "+num1+" & "+num2+" is:"+sub.opr());
				break;
				
			case 3:
				System.out.println("Enter number 1:");
				num1 = s.nextInt();
				System.out.println("Enter number 2:");
				num2 = s.nextInt();
				Mul mul = new Mul(num1,num2);
				System.out.println("Product of "+num1+" & "+num2+" is:"+mul.opr());
				break;
				
			case 4:
				System.out.println("Enter number 1:");
				num1 = s.nextInt();
				System.out.println("Enter number 2:");
				num2 = s.nextInt();
				Div div = new Div(num1,num2);
				System.out.println("Division of "+num1+" & "+num2+" is:"+div.opr());
				break;
				
			case 5:
				System.out.println("Exiting....");
				break;
				
			default:
				System.out.println("Enter a valid option!!!!!!!!");
			}
		}
		s.close();
	}

}
