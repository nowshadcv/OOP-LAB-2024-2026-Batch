package Arithmetic;

public class Mul implements OprIF
{
	private int num1,num2;
	
	public Mul(int num1,int num2)
	{
		this.num1 = num1;
		this.num2 = num2;
	}
	public int opr()
	{
		return num1*num2;
	}
	

}
