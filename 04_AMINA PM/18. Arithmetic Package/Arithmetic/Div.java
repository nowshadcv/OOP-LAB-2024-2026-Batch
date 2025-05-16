package Arithmetic;

public class Div implements DivIF
{
	private int num1,num2;
	public Div(int num1,int num2)
	{
		this.num1 = num1;
		this.num2 = num2;
	}
	public float opr()
	{
		return num1/num2;
	}
	
}
