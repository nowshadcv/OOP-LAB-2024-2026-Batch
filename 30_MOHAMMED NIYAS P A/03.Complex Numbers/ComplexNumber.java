package MODULE1;

import java.util.Scanner;

public class ComplexNumber {
    double real, img;

    ComplexNumber(double r, double i) {
        real = r;
        img = i;
    }

    public static ComplexNumber sum(ComplexNumber c1, ComplexNumber c2) {
        return new ComplexNumber(c1.real + c2.real, c1.img + c2.img);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the real part of first complex number:");
        double real1 = scanner.nextDouble();
        System.out.println("Enter the imaginary part of first complex number:");
        double img1 = scanner.nextDouble();
        
        System.out.println("Enter the real part of second complex number:");
        double real2 = scanner.nextDouble();
        System.out.println("Enter the imaginary part of second complex number:");
        double img2 = scanner.nextDouble();

        ComplexNumber c1 = new ComplexNumber(real1, img1);
        ComplexNumber c2 = new ComplexNumber(real2, img2);

        ComplexNumber temp = sum(c1, c2);

        System.out.println("Sum is " + temp.real + " + " + temp.img + "i");

        scanner.close();
    }
}
