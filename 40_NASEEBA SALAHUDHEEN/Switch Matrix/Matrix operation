package MODULE_2;

import java.util.Scanner;

public class MatrixOpr 
{

	public static void main(String[] args) 
	{
		int choice=0;
		

		int p,q,m,n;
		Scanner s = new Scanner(System.in);
		System.out.print("Enter number of rows in Matrix A:");
		p = s.nextInt();
		System.out.print("Enter number of columns in Matrix A:");
		q = s.nextInt();
		System.out.print("Enter number of rows in Matrix B:");
		m = s.nextInt();
		System.out.print("Enter number of columns in Matrix B:");
		n = s.nextInt();
		
		if (p == m && q == n)
		{
			int a[][] = new int[p][q];
			int b[][] = new int[m][n];
			
			System.out.println("Enter the elements of Matrix A:");
			for(int i = 0; i < p; i++)
				for(int j = 0; j < q; j++)
					a[i][j] = s.nextInt();
			
			System.out.println("Enter the elements of Matrix B:");
			for(int i = 0; i < m; i++)
				for(int j = 0; j < n; j++)
					b[i][j] = s.nextInt();
			
			System.out.println("Matrix A:");
			for(int i = 0; i < p; i++)
			{
				for(int j = 0; j < q; j++)
					System.out.print(a[i][j]+" ");
			System.out.println();
			}
			
			System.out.println("Matrix B:");
			for(int i = 0; i < m; i++)
			{
				for(int j = 0; j < n; j++)
					System.out.print(b[i][j]+" ");
			System.out.println();
			}
			
			
		
		

		
		
		System.out.println("Options\n-------");
		System.out.println("1 : Matrix addition");
		System.out.println("2 : Matrix subtraction");
		System.out.println("3 : Matrix multiplication");
		System.out.println("4 : Matrix division");
		System.out.println("5 : Matrix transpose");
		System.out.println("6 : Exit");
		
		while(choice!=5)
		{
			System.out.println("Choose any option(1,2,3,4,5,6):");
			choice = s.nextInt();
			switch(choice)
			{
			case 1:
					System.out.println("Sum of matrix A and B:");
					for(int i = 0; i < p; i++)
					{
						for(int j = 0; j < q; j++)
							System.out.print(a[i][j]+b[i][j]+" ");
					System.out.println();

					
					}
				break;
				
			case 2:
					
					System.out.println("Difference of matrix A and B:");
					for(int i = 0; i < p; i++)
					{
						for(int j = 0; j < q; j++)
							System.out.print(a[i][j]-b[i][j]+" ");
					System.out.println();
					}

				break;
				
			case 3:
					System.out.println("Product of matrix A and B:");
					for(int i = 0; i < p; i++)
					{
						for(int j = 0; j < q; j++)
							System.out.print(a[i][j]*b[i][j]+" ");
					System.out.println();
					}
				break;
				
			case 4:
					System.out.println("Qutient of matrix A and B:");
					for(int i = 0; i < p; i++)
					{
						for(int j = 0; j < q; j++)
							System.out.print(a[i][j]/b[i][j]+" ");
					System.out.println();
					}
				break;
				
			case 5:

					System.out.println("Transpose of Matrix A:");
					for(int i = 0; i < p; i++)
					{
						for(int j = 0; j < q; j++)
							System.out.print(a[j][i]+" ");
					System.out.println();
					}
					
					System.out.println("Transpose of Matrix B:");
					for(int i = 0; i < p; i++)
					{
						for(int j = 0; j < q; j++)
							System.out.print(b[j][i]+" ");
					System.out.println();
					}

				break;
				
			case 6:
				System.out.println("Exiting....");
				break;
			}
		}
		}
	}

}
