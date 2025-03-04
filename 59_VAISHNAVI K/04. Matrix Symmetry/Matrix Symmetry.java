package MODULE1;
import java.util.Scanner;

public class Matrixsymmetry {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the no of rows:");
		int rows=s.nextInt();
		System.out.println("enter the no of columns:");
		int cols=s.nextInt();
		int matrix[][]=new int[rows][cols];
		System.out.println("enter the element of the matrix:");
		for(int i=0;i<rows;i++) 
			for(int j=0;j<cols;j++)
				matrix[i][j]=s.nextInt();
				s.close();
				System.out.println("the given matrix:");
				for(int i=0;i<rows;i++) {
					for(int j=0;j<cols;j++)
						System.out.print(matrix[i][j]+"\t");
					System.out.println();
					}
				if(rows!=cols)
					System.out.println("the given matrix is not a square matrix");
				else {
					boolean symmetric=true;
					for( int i=0;i<rows;i++)
						for( int j=0;j<cols;j++)
							if(matrix[i][j]!=matrix[j][i])
							{
								symmetric=false;break;
							}
					if(symmetric)
						System.out.println("the given matrix is symmetric");
					else
						System.out.println("the given matrix is not symmetric");
						
						
					
				}
						
					
			
				
		
		
		
		}

}
