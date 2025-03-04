package MODULE1;
import java.util.Scanner;


public class ComplexNumbersuser {
	double real,img;
	ComplexNumbersuser(double r,double i){
		real=r; 
		img=i;
	}
	public static ComplexNumbersuser sum(ComplexNumbersuser c1,ComplexNumbersuser c2) {
		ComplexNumbersuser temp=new ComplexNumbersuser(0,0);
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
        
        ComplexNumbersuser c1 = new ComplexNumbersuser(real1, img1);
        ComplexNumbersuser c2 = new ComplexNumbersuser(real2, img2);

        
        ComplexNumbersuser temp = sum(c1, c2);

      
        System.out.printf("The sum of the complex numbers is: %.2f + %.2fi", temp.real, temp.img);

       scanner.close();

    }
}

