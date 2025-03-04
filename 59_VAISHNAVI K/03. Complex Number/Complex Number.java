package MODULE1;
import java.util.Scanner;
public class Complexnumber {
	double real,img;
	Complexnumber(double r, double i){
		real=r;
		img=i;
	}
	public static Complexnumber sum(Complexnumber c1,Complexnumber c2) {
		Complexnumber temp=new Complexnumber(0,0);
		temp.real=c1.real + c2.real;
		temp.img=c1.img + c2.img;
		return temp;
		
	}
	public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		System.out.print("enter real part of first complex number:");
		double c1r=s.nextDouble();
		System.out.print("enter imaginary part of first complex number:");
		double c1i=s.nextDouble();
		System.out.print("enter real part of second complex number:");
		double c2r=s.nextDouble();
		System.out.print("enter imaginary part of second complex number:");
		double c2i=s.nextDouble();
		Complexnumber c1=new Complexnumber(c1r,c1i);
		Complexnumber c2=new Complexnumber(c2r,c2i);
		Complexnumber temp=sum(c1,c2);
		System.out.printf("sum is:"+temp.real+"+"+temp.img+"i");
		
	}

}
