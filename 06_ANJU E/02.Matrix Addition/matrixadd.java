package MODULE1;
import java.util.Scanner;
public class Matrixadd {

	//public matrixadd() {
		

	public static void main(String[] args) 
	{
	int p,q,m,n;
	Scanner s=new Scanner(System.in);
	System.out.print("Enter no of rows in matrix A:");
	p=s.nextInt();
	System.out.print("enter no of columns in matrix A:");
	q=s.nextInt();
	System.out.print("enter no of rows in matrix B:");
	m=s.nextInt();
	System.out.print("enter no of columns in matrix B:");
	n=s.nextInt();
	if(p==m && q==m)
	{
		int a[][]=new int[p][q];
		int b[][]=new int[m][n];
		System.out.println("enter the elements of matrx A:");
		for(int i=0;i<p;i++)
			for(int j=0;j<q;j++)
				a[i][j]=s.nextInt();
		System.out.println("enter the elements of matrx b:");
		for(int i=0;i<m;i++)
			for (int j=0;j<n;j++)
				b[i][j]=s.nextInt();
		System.out.println("matrix a:");
		for(int i=0;i<p;i++)
		{
			for (int j=0;j<q;j++)
				System.out.print(a[i][j]+" ");;
				System.out.println();
		}
		System.out.println("matrix b:");
		for(int i=0;i<m;i++)
		{
			for (int j=0;j<n;j++)
				System.out.print(b[i][j]+" ");
			System.out.println();
		}
		System.out.println("the sum:");
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
				System.out.println(a[i][j]+b[i][j]+" ");
			System.out.println();}
		}
		else
		{
		
			System.out.println("these matrices cannot be added");
		}
	
		
	}
	
}
	


