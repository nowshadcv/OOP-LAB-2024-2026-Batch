package Test;	
import arithmetic.ArithmeticOperations;
import java.util.Scanner;

public class TestArithmetic {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArithmeticOperations ops = new ArithmeticOperations();

        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();

        System.out.println("\n--- Results ---");
        System.out.println("Addition: " + ops.add(num1, num2));
        System.out.println("Subtraction: " + ops.subtract(num1, num2));
        System.out.println("Multiplication: " + ops.multiply(num1, num2));

        try {
            System.out.println("Division: " + ops.divide(num1, num2));
        } catch (ArithmeticException e) {
            System.out.println("Division: Error - " + e.getMessage());
        }

        scanner.close();
    }
}
