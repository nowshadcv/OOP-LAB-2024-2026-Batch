

package Arithmetic;



interface OrIF
{
	int opr();
}




public class Sub implements OprIF
{
	private int n1,n2;
	
	public Sub(int n1,int n2)
	{
		this.n1 = n1;
		this.n2 = n2;
	}
	public int opr()
	{
		return n1-n2;
	}
	

}