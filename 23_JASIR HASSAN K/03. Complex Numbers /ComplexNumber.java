package Module_1;
import java.util.Scanner;
public class ComplexNumber {
	double real, img ;
	ComplexNumber (double r, double i){
		real = r;
		img = i;	
	}
	public static ComplexNumber sum(ComplexNumber c1,ComplexNumber c2) {
		ComplexNumber temp = new ComplexNumber(0,0);
		temp.real = c1.real + c2.real;
		temp.img = c1.img + c2.img;
		return temp;
	}
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the  Real part of First Number:");
		double n1 = sc.nextDouble();
		System.out.println("Enter the img  part of the First Number:");
		double n2 = sc.nextDouble();
		System.out.println("Enter the Real part of the Second Number:");
		double n3 = sc.nextDouble();
		System.out.println("Enter the img part of the Second Number:");
		double n4 = sc.nextDouble();
		sc.close();
		ComplexNumber c1 = new ComplexNumber(n1,n2);
		ComplexNumber c2 = new ComplexNumber(n3,n4);
		ComplexNumber temp = sum(c1,c2);
		System.out.println("sum is: "+temp.real+" + "+temp.img+"i ");
	}
}
