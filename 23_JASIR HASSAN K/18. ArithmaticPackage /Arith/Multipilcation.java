package Arith;

public  class Multipilcation implements ArithmaticOperation {
	private int num1,num2;
	public Multipilcation(int n1,int n2) {
		num1 = n1;
		num2 = n2;
	}
	public int opr() {
		return num1*num2;
	}

}
