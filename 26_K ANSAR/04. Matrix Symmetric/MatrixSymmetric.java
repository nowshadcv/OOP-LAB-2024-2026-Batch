package module_1;
import java.util.Scanner;

public class matrixSymmetry {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("Enter number of rows: ");
		int rows = s.nextInt();
		System.out.println("Enter number of columns: ");
		int columns = s.nextInt();
		
		int matrix[][] =new int[rows][columns];
		System.out.println("Enter the elements of the matrix: ");
		for(int i=0;i<rows;i++) {
			for(int j=0;j<columns;j++)
				matrix[i][j] = s.nextInt();
		}
		s.close();
		System.out.println("the given matrix: ");
		for(int i=0;i<rows;i++) {
			for(int j=0;j<columns;j++)
				System.out.print(matrix[i][j]+"\t");
			System.out.println();
		}
		if(rows != columns)
			System.out.println("the given matrix is not a square matrix");
		else {
			boolean symmetric = true;
			for(int i=0;i<rows;i++) {
				for(int j=0;j<columns;j++)
					if(matrix[i][j] != matrix[j][i]) {
						symmetric = false;
						break;
					}
			
			}
			if(symmetric) {
				System.out.println("given matrix is symmetric");
			}
			else {
				System.out.println("given matrix is not symmetric");
			}
		}

	}

}
