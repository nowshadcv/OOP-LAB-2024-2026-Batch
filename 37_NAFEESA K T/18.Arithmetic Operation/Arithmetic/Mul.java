
package Arithmetic;



interface opIF
{
	int opr();
}



public class Mul implements OprIF
{
	private int n1,n2;
	
	public Mul(int n1,int n2)
	{
		this.n1 = n1;
		this.n2 = n2;
	}
	public int opr()
	{
		return n1*n2;
	}
	

}
