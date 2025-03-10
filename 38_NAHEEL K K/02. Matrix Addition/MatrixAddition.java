package module_1;

import java.util.Scanner;

public class MatrixAddition {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		int p,q,m,n;
		Scanner s = new Scanner(System.in);
		System.out.print("Enter rows of Matrix A ");
		p = s.nextInt();
		System.out.print("Enter columns of Matrix A ");
		q = s.nextInt();
		System.out.print("Enter rows of Matrix B ");
		m = s.nextInt();
		System.out.print("Enter columns of Matrix B ");
		n = s.nextInt();
		if(p == m && q == n)
		{
			int a[][] = new int[p][q];
			int b[][] = new int[m][n];
			System.out.println("Enter elements of Matrix A");
			for(int i = 0; i < p; i++)
				for(int j = 0; j < q; j++)
					a[i][j] = s.nextInt();
			System.out.println("Enter elements of Matrix B");
			for(int i = 0; i < m; i++)
				for(int j = 0; j < n; j++)
					b[i][j] = s.nextInt();
			
			System.out.println("Matrix A");
			for(int i = 0; i < p; i++) {
				for(int j = 0; j < q; j++)
					System.out.print(a[i][j] + "  ");
				System.out.println();
			}
			System.out.println("Matrix B");
			for(int i = 0; i < m; i++) {
				for(int j = 0; j < n; j++)
					System.out.print(b[i][j] + "  ");
				System.out.println();
			}
			int choice = 0;
			while(choice != 6) {
				System.out.println("Choose one from the MENU below:");
				System.out.println("-------------------Menu------------------\n1. Addition\n2. Subtraction\n3. Division\n4. Multiplication\n5. Transpose\n6. Exit");
				
				choice = s.nextInt();
			switch(choice) {
				case 1:
					for(int i = 0; i < m; i++)
					{
						for(int j = 0; j < n; j++)
							System.out.print((a[i][j] + b[i][j]) + "  ");
						System.out.println();
					}
					break;
				case 2:
					for(int i = 0; i < m; i++)
					{
						for(int j = 0; j < n; j++)
							System.out.print((a[i][j] - b[i][j]) + "  ");
						System.out.println();
					}
					break;
				case 3:
					for(int i = 0; i < m; i++)
					{
						for(int j = 0; j < n; j++)
							System.out.print((a[i][j] / b[i][j]) + "   ");
						System.out.println();
						System.out.println();
					}
					break;
				case 4:
					for(int i = 0; i < m; i++)
					{
						for(int j = 0; j < n; j++)
							System.out.print((a[i][j] * b[i][j]) + "  ");
						System.out.println();
					}
					break;
				case 5:
					for(int i = 0; i < m; i++)
					{
						for(int j = 0; j < n; j++)
							System.out.print(a[j][i] + "  ");						
						System.out.println();
					}
					break;
				case 6:
					System.exit(1);
					
			}
			
		}
		}
		else {
			System.out.println("Matrices should be square.");
		}
	}
}
