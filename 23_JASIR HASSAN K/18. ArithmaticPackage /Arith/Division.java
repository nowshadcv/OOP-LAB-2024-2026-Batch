package Arith;

public class Division implements ArithmaticOperation {
	private int num1,num2;
	public Division(int n1,int n2) {
		num1 = n1;
		num2 = n2;
	}
	public int opr() {
		return num1/num2;
	}

}