package MODULE1;
import java.util.Scanner;
public class Matrix {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Choose 1 or 2 in the given menu :\n1. Addition,Substraction and Division of matrix\n2. Check Symmetry of Matrix\n3. Transpose of matrix");
		int choice=sc.nextInt();
		sc.nextLine();
		switch(choice)

		{
			case 1: int p,q,m,n;
					System.out.print("Enter number of rows of Matrix A :");
					p=sc.nextInt();
					System.out.print("Enter number of columns of Matrix A :");
					q=sc.nextInt();
					System.out.print("Enter number of rows of Matrix B :");
					m=sc.nextInt();
					System.out.print("Enter number of columns of Matrix B :");
					n=sc.nextInt();
					if(p==m&&q==n)
					{
						int a[][]=new int [p][q];
						int b[][]=new int [m][n];
						System.out.println("Enter the elements of Matrix A :");
						for(int i=0;i<p;i++)
							for(int j=0;j<q;j++)
								a[i][j]=sc.nextInt();
						System.out.println("Enter the elements of Matrix  B :");
						for(int i=0;i<m;i++)
							for(int j=0;j<n;j++)
								b[i][j]=sc.nextInt();
						System.out.println("Matrix A :");
						for(int i=0;i<p;i++)
						{
							for(int j=0;j<q;j++)
								System.out.print(a[i][j]+" ");
							System.out.println();
						}
						System.out.println("Matrix B :");
						for(int i=0;i<m;i++)
						{
							for(int j=0;j<n;j++)
								System.out.print(b[i][j]+" ");
							System.out.println();
						}
						System.out.println("Sum of the Matrix :");
						for(int i=0;i<p;i++)
						{
							for(int j=0;j<q;j++)
								System.out.print((a[i][j]+b[i][j])+" ");
							System.out.println();
						}
						System.out.println("Difference of the Matrix :");
						for(int i=0;i<p;i++)
						{
							for(int j=0;j<q;j++)
								System.out.print((a[i][j]-b[i][j])+" ");
							System.out.println();
						}
						System.out.println("Division of the Matrix :");
						for(int i=0;i<p;i++)
						{
							for(int j=0;j<q;j++)
								System.out.print((a[i][j]/b[i][j])+" ");
							System.out.println();
						}
					}
					else
					{
						System.out.println("These matrices cannot be added,substracted,divided.");
					}
					break;
			case 2:System.out.print("Enter number of rows of Matrix :");
					int rows=sc.nextInt();
					System.out.print("Enter number of columns of Matrix :");
					int cols=sc.nextInt();
					
					int a[][]=new int [rows][cols];
					System.out.println("Enter the elements of Matrix :");
					for(int i=0;i<rows;i++)
						for(int j=0;j<cols;j++)
							a[i][j]=sc.nextInt();
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
					break;
			case 3:System.out.print("Enter number of rows of Matrix :");
					rows=sc.nextInt();
					System.out.print("Enter number of columns of Matrix :");
					cols=sc.nextInt();
					int m1[][]=new int [rows][cols];
					int t[][]=new int [cols][rows];
					System.out.println("Enter the elements of Matrix :");
					for(int i=0;i<rows;i++)
					{
						for(int j=0;j<cols;j++)
						{
							m1[i][j]=sc.nextInt();
							sc.nextLine();
						}
					}		
					System.out.println("Entered Matrix :");
					for(int i=0;i<rows;i++)
					{
						for(int j=0;j<cols;j++)
							System.out.print(m1[i][j] +" ");
						System.out.println();
					}
					for(int i=0;i<rows;i++)
					{
						for(int j=0;j<cols;j++)
						{
							t[j][i]=m1[i][j];
						}
					}
					System.out.println("Transpose Matrix :");
					for(int i=0;i<cols;i++)
					{
						for(int j=0;j<rows;j++)
							System.out.print(t[i][j] +" ");
						System.out.println();
					}
					break;
		}
		sc.close();

	}

}
