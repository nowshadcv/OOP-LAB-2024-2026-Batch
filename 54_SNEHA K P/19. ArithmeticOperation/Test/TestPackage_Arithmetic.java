package Test;

import Arithmetic.*;
import java.util.Scanner;

public class TestPackage_Arithmetic {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double a = scanner.nextDouble();

        System.out.print("Enter second number: ");
        double b = scanner.nextDouble();

        ArithmeticAdd add = new Add();
        ArithmeticSub sub = new Substraction();
        ArithmeticMul mul = new Multiplication();
        ArithmeticDiv div = new Division();

        System.out.println("\nResults:");
        System.out.println("Addition: " + add.operation(a, b));
        System.out.println("Subtraction: " + sub.operation(a, b));
        System.out.println("Multiplication: " + mul.operation(a, b));
        if (b != 0) {
            System.out.println("Division: " + div.operation(a, b));
        } else {
            System.out.println("Division: Error - Cannot divide by zero.");
        }
        scanner.close();
    }
}
