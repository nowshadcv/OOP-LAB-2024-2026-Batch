package Arithmetic;

public class Sub implements Subtraction{
	private double num1,num2;
	public Sub(double a,double b) {
		num1=a;
		num2=b;
	}
	public double Subtract() {
		return (num1-num2);
	}
}
