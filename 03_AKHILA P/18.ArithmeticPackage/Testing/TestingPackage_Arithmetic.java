package Testing;
import Arithmetic.*;
import java.util.*;

public class TestingPackage_Arithmetic {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number 1: ");
		int n1 =sc.nextInt();
		System.out.println("enter the number 2: ");
		int n2 =sc.nextInt();
		Addition A1=new Addition(n1,n2);
		System.out.println("Addition : " + A1.add());
		substraction s1=new substraction(n1,n2);
		System.out.println("Substration: "+ s1.sub());
		Division d1=new Division(n1,n2); 
		System.out.println("Divition: "+ d1.Div());
		Multiplication m1=new Multiplication(n1,n2);
		System.out.println("multiplication :"+ m1.mul());
		
		
	}

}
