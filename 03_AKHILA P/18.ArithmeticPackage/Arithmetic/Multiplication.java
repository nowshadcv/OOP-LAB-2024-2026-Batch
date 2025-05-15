package Arithmetic;

public class Multiplication implements ArithmeticMul{
	private int n1, n2;
	public Multiplication(int num1, int num2) {
		this.n1=num1;
		this.n2=num2;
	}
	public int  mul() {
		return(n1*n2);
	}
	

}
