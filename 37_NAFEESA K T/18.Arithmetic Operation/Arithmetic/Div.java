
package Arithmetic;

interface DivIF
{
	float opr();
}


public class Div implements DivIF
{
	private int n1,n2;
	public Div(int n1,int n2)
	{
		this.n1 = n1;
		this.n2 = n2;
	}
	public float opr()
	{
		return n1/n2;
	}
	
}
