package MODULE1;

import java.util.Scanner;

public class MatrixAdd {

	public static void main(String[] args) {
		int p,q,m,n;
		Scanner s=new Scanner(System.in);
		System.out.print("enter number of rows in Matrix A: ");
		p=s.nextInt();
		System.out.print("enter number of columnss in Matrix A: ");
		q=s.nextInt();
		System.out.print("enter number of row in Matrix b: ");
		m=s.nextInt();
		System.out.print("enter number of columnss in Matrix b: ");
		n=s.nextInt();
		if(p==m&&q==n) {
			int a[][]=new int[p][q];
			int b[][]=new int[m][n];
			System.out.print("enter elements of Matrix A: ");
			for(int i=0;i<p;i++)
				for(int j=0;j<q;j++)
					a[i][j]=s.nextInt();
			System.out.print("enter elements of Matrix B: ");
			for(int i=0;i<m;i++)
				for(int j=0;j<n;j++)
					b[i][j]=s.nextInt();
			System.out.println("Matrix A: ");
			for(int i=0;i<p;i++) {
				for(int j=0;j<q;j++)
					System.out.print(a[i][j]+"  ");
				System.out.println();}
			System.out.println("Matrix B: ");
			for(int i=0;i<m;i++) {
				for(int j=0;j<n;j++)
					System.out.print(b[i][j]+" ");
				System.out.println();}
			System.out.println("The sum Matrix:");
			for(int i=0;i<m;i++) {
				for(int j=0;j<n;j++)
					System.out.print(a[i][j]+b[i][j]+" ");
				System.out.println();}
		}
		else{
			System.out.println("These Matrices cannot be added...");}
			
			
			
	}}

