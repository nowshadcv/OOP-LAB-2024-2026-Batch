package MODULE1;
import java.util.Scanner;
public class SymmetricMatrix
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.print("Enter number of rows of Matrix :");
		int rows=s.nextInt();
		System.out.print("Enter number of columns of Matrix :");
		int cols=s.nextInt();
		
		int a[][]=new int [rows][cols];
		System.out.println("Enter the elements of Matrix :");
		for(int i=0;i<rows;i++)
			for(int j=0;j<cols;j++)
				a[i][j]=s.nextInt();
		s.close();
		
		System.out.println("Entered Matrix :");
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<cols;j++)
				System.out.print(a[i][j] +" ");
			System.out.println();
		}
		if(rows!=cols)
			System.out.println("The given matris ios not square matrix");
		else
		{
			boolean symmetric=true;
			for(int i=0;i<rows;i++)
			{
				for(int j=0;j<cols;j++)
				{
					if(a[i][j]!=a[j][i])
					{
						symmetric=false;
						break;
					}
				}
			}
			if(symmetric)
				System.out.println("The given matrix is symmetric");
			else
				System.out.println("The given matrix is not symmetric");
		}
	}
}
