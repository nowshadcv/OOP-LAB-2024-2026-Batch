package Arithmetic;

public class Addition implements ArithmeticAdd {
	private int n1,n2;
	public Addition(int num1, int num2) {
		this.n1=num1;
		this.n2=num2;
	}
	public int add() {
		return(n1+n2);
		
	}

}
