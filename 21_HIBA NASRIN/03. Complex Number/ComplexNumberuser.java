package MODULE_1;
import java.util.Scanner;


public class ComplexNumberuser {
	double real,img;
	ComplexNumberuser(double r,double i){
		real=r; 
		img=i;
	}
	public static ComplexNumberuser sum(ComplexNumberuser c1,ComplexNumberuser c2) {
		ComplexNumberuser temp=new ComplexNumberuser(0,0);
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
        
        ComplexNumberuser c1 = new ComplexNumberuser(real1, img1);
        ComplexNumberuser c2 = new ComplexNumberuser(real2, img2);

        
        ComplexNumberuser temp = sum(c1, c2);

      
        System.out.printf("The sum of the complex numbers is: %.2f + %.2fi", temp.real, temp.img);

       scanner.close();

    }
}
