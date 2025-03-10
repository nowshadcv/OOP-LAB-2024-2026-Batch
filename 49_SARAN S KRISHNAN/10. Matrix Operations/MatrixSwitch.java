package MODULE_1;
import java.util.Scanner;
public class MatrixSwitch {
	public static void main(String[] args) {
	int p,q,m,n;
	try (Scanner s = new Scanner (System.in)) {
		System.out.print("Enter no. of rows in matrix A: ");
		p = s.nextInt();
		System.out.print("Enter no. of columns in matrix A: ");
		q = s.nextInt();
		System.out.print("Enter no. of rows in matrix B: ");
		m = s.nextInt();
		System.out.print("Enter no. of columns in matrix B: ");
		n = s.nextInt();
		if(p == m && q == n) {
			int a[][] = new int[p][q];
			int b[][] = new int[m][n];
			System.out.println("Enter the elements of matrix A:");
			for(int i=0; i<p; i++)
				for(int j=0; j<q; j++)
					a[i][j] = s.nextInt();
			System.out.println("Enter the elements of matrix B:");
			for(int i=0; i<m; i++)
				for(int j=0; j<n; j++)
					b[i][j] = s.nextInt();
			System.out.println("Matrix A:");
			for(int i=0; i<p; i++) {
				for(int j=0; j<q; j++)
					System.out.print(a[i][j]+" ");
				System.out.println();}
			System.out.println("Matrix B:");
			for(int i=0; i<m; i++) {
				for(int j=0; j<n; j++)
					System.out.print(b[i][j]+" ");
				System.out.println();}
			
			int choice = 1;
			while(choice != 5) {
			System.out.println("Choose an option from the menu");
			System.out.println("1: Addition\n2: Subtraction\n3: Division\n4: Transpose\n5: Exit");
			choice = s.nextInt();
			switch(choice) {
			case 1:
				for(int i=0; i<m; i++) {
					for(int j=0; j<n; j++)
						System.out.print((a[i][j] + b[i][j])+" ");
					System.out.println();}
				break;
			case 2:
				for(int i=0; i<m; i++) {
					for(int j=0; j<n; j++)
						System.out.print((a[i][j] - b[i][j])+" ");
					System.out.println();}
				break;
			case 3:
				for(int i=0; i<m; i++) {
					for(int j=0; j<n; j++)
						System.out.print((a[i][j] / b[i][j])+" ");
					System.out.println();}
					break;
			case 4:
				System.out.println("Transpose of matrix A is :");
				for(int i=0; i<m; i++) {
					for(int j=0; j<n; j++)
						System.out.print(a[j][i] +" ");
					System.out.println();}
				System.out.println("Transpose of matrix B is :");
				for(int i=0; i<m; i++) {
					for(int j=0; j<n; j++)
						System.out.print(b[j][i] +" ");
					System.out.println();}
					break;
			case 5:
				System.out.println("Exited");
				break;
			}
			}
		}
		}
	}	
}
