package MODULE1;
import java.util.Scanner;
public class MatrixAdd 
{
	public static void main(String [] args) 
	{
		int p,q,m,n;
		Scanner S=new Scanner(System.in);
		System.out.print("Enter number of rows in Matrix A:");
		p=S.nextInt();
		System.out.print("Enter number of columns in Matrix A:");
		q=S.nextInt();
		System.out.print("Enter number of rows in Matrix B:");
		m=S.nextInt();
		System.out.print("Enter number of columns in Matrix B:");
		n=S.nextInt();
		if(p==m&&q==n) {
			int a[][]=new int [p][q];
			int b[][]=new int [m][n];
			System.out.print("Enter the elements of Matrix A:");
			for(int i=0;i<p;i++) {
				for(int j=0;j<q;j++) {
					a[i][j]=S.nextInt();
					
				}
			}
			System.out.print("Enter the elements of Matrix B:");
			for(int i=0;i<m;i++) {
				for(int j=0;j<n;j++) {
					b[i][j]=S.nextInt();
				}
			}
			System.out.println("Matrix A: ");
			for(int i=0;i<p;i++) 
			{
				for(int j=0;j<q;j++) 
				{ 
					System.out.print(a[i][j]+" ");
				System.out.println();
				}
			}
			System.out.println("Matrix B: ");
			for(int i=0;i<m;i++) 
			{
				for(int j=0;j<n;j++) 
				{
					System.out.print(b[i][j]+" ");
				System.out.println();
				}
			}
			System.out.println("The Sum Matrix: ");
			for(int i=0;i<m;i++) 
			{
				for(int j=0;j<n;j++) 
				{
					System.out.print(a[i][j]+b[i][j]+" ");
				}
				System.out.println();
				
			
			}
		}
		else {
			System.out.println("These Matrices cannot be added...");
			
		}
	}
}
