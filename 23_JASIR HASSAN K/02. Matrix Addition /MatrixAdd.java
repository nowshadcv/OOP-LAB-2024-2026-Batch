package Module_1;
import java.util.Scanner;
public class MatrixAdd {
	public static void main(String[] args) {
		int p,q,m,n;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter no of rows in the matrix A:");
		p = s.nextInt();
		System.out.println("Enter no of cols in the matrix a:");
		q = s.nextInt();
		System.out.println("Enter no of rows in the matrix B:");
		m = s.nextInt();
		System.out.println("Enter no of cols in the matrix B:");
		n = s.nextInt();
		if (p == m && q == n) {
			int a[][] = new int[p][q];
			int b[][] = new int[m][n];
			System.out.println("enter the element of matrix A:");
			for (int i = 0 ; i < p ; i++)
				for(int j = 0; j < q ; j++)
					a[i][j] = s.nextInt();
			System.out.println("enter the element of matrix B:");
			for (int i = 0 ; i < m ; i++)
				for(int j = 0; j < n ; j++)
					b[i][j] = s.nextInt();
			s.close();
			System.out.println("Matrix A :");
			for (int i = 0 ; i < p ; i++)
				for(int j = 0; j < q ; j++)
					System.out.println(a[i][j]+" ");
				System.out.println();
			System.out.println("Matrix A :");
			for (int i = 0 ; i < m ; i++)
				for(int j = 0; j < n ; j++)
					System.out.println(b[i][j]+" ");
				System.out.println();
			System.out.println("The sum matrix :");
			for (int i = 0 ; i < m ; i++)
				for(int j = 0; j < n ; j++)
					System.out.println(a[i][j] + b[i][j] +" ");
				System.out.println();
		}
		else {
			System.out.println("These Matrices cannot be Added.");
		}
	}
}
