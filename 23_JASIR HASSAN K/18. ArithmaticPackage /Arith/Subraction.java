package Arith;

public class Subraction implements ArithmaticOperation {
	private int num1,num2;
	public Subraction(int n1,int n2) {
		num1 = n1;
		num2 = n2;
	}
	public int opr() {
		return num1-num2;
	}

}
