package MODULE2;

import java.util.Scanner;

public class Matrix {
	public static void main(String[] args) {
		int p,q,m,n;
		Scanner s=new Scanner(System.in);
		System.out.print("Enter no of rows in matrix A:");
		p=s.nextInt();
		System.out.print("Enter no of columns in matrix A:");
		q=s.nextInt();
		System.out.print("Enter no of rows in matrix B:");
		m=s.nextInt();
		System.out.print("Enter no of columns in matrix B:");
		n=s.nextInt();
		if(p==m && q==n) {
			int a[][]=new int[p][q];
			int b[][]=new int[m][n];
			System.out.println("Enter the elements of A:");
			for(int i=0;i<p;i++)
				for(int j=0;j<q;j++)
					a[i][j]=s.nextInt();
			System.out.println("Enter the elements of B:");
			for(int i=0;i<m;i++)
				for(int j=0;j<n;j++)
					b[i][j]=s.nextInt();
			System.out.println("Matrix A:");
			for(int i=0;i<p;i++) {
				for(int j=0;j<q;j++)
					System.out.print(a[i][j]+" ");
				System.out.println();
			}
			System.out.println("Matrix B:");
			for(int i=0;i<m;i++) {
				for(int j=0;j<n;j++)
					System.out.print(b[i][j]+" ");
				System.out.println();
			}
			System.out.println("Choose the option from the menu below:");
			System.out.println("1:Matrix Addition");
			System.out.println("2:Matrix Substraction");
			System.out.println("3:Matrix Division");
			System.out.println("4:Matrix Transpose");
			int choice;
			choice=s.nextInt();
			switch(choice) {
			case 1:System.out.println("The sum of matrix:");
			for(int i=0;i<m;i++) {
				for(int j=0;j<n;j++)
					System.out.print((a[i][j]+b[i][j])+" ");
					System.out.println();}
			break;
			case 2:System.out.println("The difference of matrix:");
			for(int i=0;i<m;i++) {
				for(int j=0;j<n;j++)
					System.out.print((a[i][j]-b[i][j])+" ");
					System.out.println();}
			break;
			case 3:System.out.println("The Quotient of matrix:");
			for(int i=0;i<m;i++) {
				for(int j=0;j<n;j++)
					System.out.print((a[i][j]/b[i][j])+" ");
					System.out.println();}
			break;
			case 4:System.out.println("Transpose of matrix A is :");
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
		    case 5:System.out.println("Exited");
			break;
			}
			
	}

}}

