package MODULE1;

import java.util.Scanner;

public class MatrixSymmetry {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		int rows,cols;
		Scanner s = new Scanner(System.in);
		System.out.print("Enter rows of Matrix A ");
		rows = s.nextInt();
		System.out.print("Enter columns of Matrix A ");
		cols = s.nextInt();
		int matrix[][] = new int[rows][cols];
		System.out.println("Enter elements");
		for(int i = 0 ; i < rows; i++)
		{
			for(int j = 0; j < cols; j++)
				matrix[i][j] = s.nextInt();
		}
		System.out.println("Given Matrix");
		for(int i = 0 ; i < rows; i++)
		{
			for(int j = 0; j < cols; j++)
				System.out.print(matrix[i][j] + "\t");
			System.out.println();
		}
		if(rows != cols)
			System.out.println("Given Matrix is not source matrix");
		else {
			boolean sym = true;
			for(int i = 0; i < rows; i++)
				for(int j = 0; j < cols; j++)
					if(matrix[i][j] != matrix[j][i]) {
						sym = false;
						break;
					}
			if(sym)
				System.out.println("Matrix is Symmetric");
			else
				System.out.println("Matrix is not Symmetric");
		}
		
			

	}

}