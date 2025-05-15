package Arithmetic;

public class Add implements Addition{
	private double num1,num2;
	public Add(double a,double b) {
		num1=a;
		num2=b;
	}
	public double add() {
		return (num1+num2);
	}
}
