package Test;

import arith.*;

import java.util.Scanner;

public class cal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       
        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();

      
        add addOp = new addim();
        sub subOp = new subim();
        mul mulOp = new mulim();
        div divOp = new divim();


        System.out.println("Addition: " + addOp.add(num1, num2));
        System.out.println("Subtraction: " + subOp.subtract(num1, num2));
        System.out.println("Multiplication: " + mulOp.multiply(num1, num2));
        
        try {
            System.out.println("Division: " + divOp.divide(num1, num2));
        } catch (ArithmeticException e) {
            System.out.println("Division Error: " + e.getMessage());
        }

        scanner.close();
    }
}
