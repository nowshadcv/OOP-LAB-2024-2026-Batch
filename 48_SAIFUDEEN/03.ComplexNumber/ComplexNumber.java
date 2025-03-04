package MODULE1;
import java.util.Scanner;

public class ComplexNumber {
	double real,img;
	ComplexNumber(double r,double i){
		real=r; 
		img=i;
	}
	public static ComplexNumbers sum(ComplexNumbers c1,ComplexNumbers c2) {
		ComplexNumbers temp=new ComplexNumbers(0,0);
		temp.real=c1.real+c2.real;
		temp.img=c1.img+c2.img;
		return temp;
		
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        
        System.out.println("Enter the real part of the first complex number:");
        double real1 = scanner.nextDouble();
        System.out.println("Enter the imaginary part of the first complex number:");
        double img1 = scanner.nextDouble();

        
        System.out.println("Enter the real part of the second complex number:");
        double real2 = scanner.nextDouble();
        System.out.println("Enter the imaginary part of the second complex number:");
        double img2 = scanner.nextDouble();
        
        ComplexNumbers c1 = new ComplexNumbers(real1, img1);
        ComplexNumbers c2 = new ComplexNumbers(real2, img2);

        
        ComplexNumbers temp = sum(c1, c2);

      
        System.out.printf("The sum of the complex numbers is: %.2f + %.2fi", temp.real, temp.img);

       scanner.close();
    }

	}


