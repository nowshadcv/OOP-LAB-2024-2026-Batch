package Arithmetic;

public class Div implements Division{
	private double num1,num2;
	public Div(double a,double b) {
		num1=a;
		num2=b;
	}
	public double Divide() {
		return (num1/num2);
	}

}
