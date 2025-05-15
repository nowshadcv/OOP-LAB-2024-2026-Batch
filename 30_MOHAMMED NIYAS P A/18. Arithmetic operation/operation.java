
package test;
import java.util.Scanner;
import Arithmetic.*;
public class operation 
{

	public static void main(String[] args) 
	{
		System.out.println("Calculator");
		System.out.println("-----------");
		int n1,n2;
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
				n1 = s.nextInt();
				System.out.println("Enter number 2:");
				n2 = s.nextInt();
				Add add = new Add(n1,n2);
				System.out.println("Sum of "+n1+"  + "+n2+" is:"+add.opr());
				break;
			case 2:
				System.out.println("Enter number 1:");
				n1 = s.nextInt();
				System.out.println("Enter number 2:");
				n2 = s.nextInt();
				Sub sub = new Sub(n1,n2);
				System.out.println("Difference of "+n1+" - "+n2+" is:"+sub.opr());
				break;
				
			case 3:
				System.out.println("Enter number 1:");
				n1 = s.nextInt();
				System.out.println("Enter number 2:");
				n2 = s.nextInt();
				Mul mul = new Mul(n1,n2);
				System.out.println("Product of "+n1+" * "+n2+" is:"+mul.opr());
				break;
				
			case 4:
				System.out.println("Enter number 1:");
				n1 = s.nextInt();
				System.out.println("Enter number 2:");
				n2 = s.nextInt();
				Div div = new Div(n1,n2);
				System.out.println("Division of "+n1+" / "+n2+" is:"+div.opr());
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
