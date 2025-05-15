package test;
import Arith.*;
import java.util.Scanner;
public class TestOperation {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("1.Addition\n2.Division\n3.Multipilcation\n4.Division\n5.Exit");
		System.out.println("enter a choice : ");
		int choice = sc.nextInt();
		Scanner s= new Scanner(System.in);
		System.out.println("Enter the first number :");
		int num1 = sc.nextInt();
		System.out.println("Enter the second number : ");
		int num2 = sc.nextInt();
		switch(choice) {
	    case 1:
	        Addition ad = new Addition(num1, num2);
	        System.out.println("Addition : " + ad.opr());
	        break;
	    case 2:
	    	Subraction su = new Subraction(num1, num2);
	        System.out.println("Subtraction : " + su.opr());
	        break;
	    case 3:
	    	Multipilcation mu = new Multipilcation(num1, num2);
	        System.out.println("Multiplication : " + mu.opr());
	        break;
	    case 4:
	        Division dv = new Division(num1, num2);
	        System.out.println("Division : " + dv.opr());
	        break;
	    case 5:
	        System.out.println("Exiting...");
	        return;
	    default:
	        System.out.println("Invalid choice! Try again.");
				
		}
	}
}
