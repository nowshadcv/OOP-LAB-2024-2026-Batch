package Arithmetic;

import Arithmetic.*;
import java.util.Scanner;

public class TestArithmetic {
 public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);

     double num1 = 0, num2 = 0;

   
     System.out.print("Enter first number: ");
     if (scanner.hasNextDouble()) {
         num1 = scanner.nextDouble();
     } else {
         System.out.println("Invalid input. Please enter a number.");
         scanner.close();
         return;
     }

     System.out.print("Enter second number: ");
     if (scanner.hasNextDouble()) {
         num2 = scanner.nextDouble();
     } else {
         System.out.println("Invalid input. Please enter a number.");
         scanner.close();
         return;
     }


     Operation add = new Addition();
     Operation subtract = new Subtraction();
     Operation multiply = new Multiplication();
     Operation divide = new Division();

     System.out.println("Addition: " + add.operate(num1, num2));
     System.out.println("Subtraction: " + subtract.operate(num1, num2));
     System.out.println("Multiplication: " + multiply.operate(num1, num2));

 
     if (num2 == 0) {
         System.out.println("Division: Error - Division by zero is not allowed.");
     } else {
         System.out.println("Division: " + divide.operate(num1, num2));
     }

     scanner.close();
 }
}
