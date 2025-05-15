package Arithmetic;

public class Mul implements Multiplication{
	private double num1,num2;
	public Mul(double a,double b) {
		num1=a;
		num2=b;
	}
	public double Multiply() {
		return (num1*num2);
	}

}
