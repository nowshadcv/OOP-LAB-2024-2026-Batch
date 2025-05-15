package Test;

import Arithmetic.*;
import java.util.Scanner;
public class TestArithmetic 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        double num1 = sc.nextDouble();
        System.out.print("Enter second number: ");
        double num2 = sc.nextDouble();

        Operation add = new Addition();
        Operation sub = new Substraction();
        Operation mul = new Multiplication();
        Operation div = new Division();

        System.out.println("Addition: " + add.calculate(num1, num2));
        System.out.println("Subtraction: " + sub.calculate(num1, num2));
        System.out.println("Multiplication: " + mul.calculate(num1, num2));
        System.out.println("Division: " + div.calculate(num1, num2));
        sc.close();
    }
}