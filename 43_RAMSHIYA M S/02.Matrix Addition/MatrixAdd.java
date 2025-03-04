package MODULE1;

import java.util.Scanner;

public class MatrixAdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int p,q,m,n;
	Scanner s=new Scanner(System.in);
	System.out.print("enter the row in matrix a:");
	p=s.nextInt();
	System.out.print("enter the column in matrix a");
	q=s.nextInt();
	System.out.print("enter the row number in matrix b:");
	m=s.nextInt();
	System.out.print("enter the column number in matrix b");
	n=s.nextInt();
	
	if( p==m && q==n) {
		int a[][]=new int[p][q];
		int b[][]=new int[m][n];
	System.out.println("enter the elements of matrix of A:");
	for(int i=0;i<p;i++) 
		for(int j=0;j<q;j++)
			a[i][j]=s.nextInt();
	System.out.println("enter the elements in matrix b:");
	for(int i=0;i<m;i++)
		for(int j=0;j<n;j++)
			b[i][j]=s.nextInt();
	System.out.println("Matrix a:");
	for(int i=0;i<p;i++) {
		for(int j=0;j<q;j++)
			System.out.print(a[i][j]+" ");
		System.out.println();}
	
	System.out.print("matrix b:");
	for(int i=0;i<m;i++) {
		for(int j=0;j<n;j++)
			System.out.print(b[i][j]+" ");
		System.out.println();}
	
	System.out.println("the sum of matrix");
	for(int i=0;i<m;i++) {
		for(int j=0;j<n;j++)
			System.out.print((a[i][j]+b[i][j])+" ");
		System.out.println();}
	}
	else {
		System.out.print("matrix can not be added...");}
		
	

	
	}
	}

