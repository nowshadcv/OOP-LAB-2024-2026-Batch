package MODULE1;

import java.util.Scanner;

public class MatrixSymmetric {
	public static void main(String[] args) {

		// TODO Auto-generated constructor stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the no.of rows:");
		int row=sc.nextInt();
		System.out.println("enter the no of column ");
		int column=sc.nextInt();
		int matrix[][]=new int[row][column];
		System.out.println("Enter the elements of the matrix");
		for (int i=0;i<row;i++)
			for(int j=0;j<column;j++)
				matrix[i][j]=sc.nextInt();
		sc.close();
		System.out.println("matrix of");
		for(int i=0;i<row;i++) {
			for(int j=0;j<column;j++)
				System.out.print(matrix[i][j] +"\t");
			System.out.println(); }
		if(row!=column)
			System.out.println("the given matrix is not square matrix");
		else {
			boolean symmetric=true;
			for(int i=0; i< row ;i++)
				for(int j=0; j< column ;j++)
			if(matrix[i][j]!=matrix[i][j])
			{
				symmetric = false;break;
			}
			if(symmetric)
				System.out.print("the given matrix is symmetric");
			else
				System.out.print("the given matrix is not symmetric");
			
			}}}
