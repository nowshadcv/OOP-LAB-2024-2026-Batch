package MODULE_1;

import java.util.Scanner;

public class Matrix {

	public static void main(String[] args) {
		int p,q,m,n;
		try (Scanner s = new Scanner (System.in)) {
			System.out.print("enter number of rows in matrix A:");
			p = s.nextInt();
			System.out.print("enter number of columns in matrix A:");
			q=s.nextInt();
			System.out.print("enter number of rows in matrix B:");
			m=s.nextInt();
			System.out.print("enter number of columns in matrix B:");
			n=s.nextInt();
			if(p == m && q == n) {
				int a[][] = new int[p][q];
				int b[][]= new int[m][n];
				System.out.println("enter the elements of matrix A:");
				for(int i=0 ;i<p ;i++)
					for(int j=0 ;j<q ;j++)
						a[i][j]=s.nextInt();
				System.out.println("enter the elements of matrix B:");
				for(int i=0 ;i<m;i++)
					for(int j=0;j<n;j++)
						b[i][j]=s.nextInt();
				System.out.println(" matrix A:");
				for(int i=0;i<p;i++) {
					for(int j=0;j<q;j++)
						System.out.print(a[i][j]+ " ");
				System.out.println();}
				System.out.println(" matrix B:");
				for(int i=0;i<m;i++) {
					for(int j=0;j<n;j++)
						System.out.print(b[i][j]+ " ");
				System.out.println();}
				System.out.println("choose 1 or 2 from the menu below");
				System.out.println("1:addition");
				System.out.println("2:substraction");
				System.out.println("3:multiplication");
				System.out.println("4:divison");
				System.out.println("5:transpose");
				int choice;
				choice=s.nextInt();
				switch(choice) {
				case 1:System.out.println(" Addition of Matrix:");
				for(int i=0;i<m;i++) {
					for(int j=0;j<n;j++)
						System.out.print(a[i][j]+b[i][j]+ " ");
				System.out.println();}
				break;
				case 2:
					System.out.println(" substraction of Matrix:");
				for(int i=0;i<m;i++) {
					for(int j=0;j<n;j++)
						System.out.print(a[i][j]-b[i][j]+ " ");
				System.out.println();}
				break;
				case 3:System.out.println(" Multiplication of Matrix:");
				for(int i=0;i<m;i++) {
					for(int j=0;j<n;j++)
						System.out.print(a[i][j]*b[i][j]+ " ");
				System.out.println();}
				break;
				case 4:System.out.println(" Division of Matrix:");
				for(int i=0;i<m;i++) {
					for(int j=0;j<n;j++)
						System.out.print(a[i][j]/b[i][j]+ " ");
				System.out.println();}
				break;
				case 5:System.out.println(" transpose of matrix A:");
				for(int i=0;i<q;i++) {
					for(int j=0;j<p;j++)
						System.out.print(a[j][i]+ " ");
				System.out.println();}
				System.out.println(" transpose of matrix B:");
				for(int i=0;i<n;i++) {
					for(int j=0;j<m;j++)
						System.out.print(b[j][i]+ " ");
				System.out.println();}
					
			
				
}

			}
		}}}
