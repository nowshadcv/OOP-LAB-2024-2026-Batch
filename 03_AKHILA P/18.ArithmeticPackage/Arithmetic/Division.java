package Arithmetic;

public class Division implements ArithmeticDiv{
	private int n1,n2;
	public Division(int num1, int num2) {
		this.n1=num1;
		this.n2=num2;
	}
	public int Div() {
		return(n1+n2);
		
	}

}
