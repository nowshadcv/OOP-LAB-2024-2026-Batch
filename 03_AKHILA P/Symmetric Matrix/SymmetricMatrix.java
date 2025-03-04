package MODULE1;
import java.util.Scanner;

public class SymmetricMatrics {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the no of rows:");
		int rows =sc.nextInt();
		System.out.println("enter the no of columns:");
		int cols =sc.nextInt();
		int matrics[][] = new int[rows][cols];
		System.out.println("enter the elements of the matrics");
		for(int i=0; i<rows; i++)
			for(int j=0; j<cols; j++)
				matrics[i][j]=sc.nextInt();
		sc.close();
		System.out.println("the given matrcs:");
		for (int i=0; i<rows; i++) {
			for(int j=0; j<cols; j++)
				System.out.print(matrics[i][j]+"\t");
			System.out.println();
		}
		if (rows!=cols)
			System.out.println("the given matrics is not a square matrics");
		else {
			boolean Symmetric = true;
			for(int i=0;i<rows;i++)
				for(int j=0; j<cols; j++)
			if(matrics[i][j] != matrics[i][j]) {
				Symmetric = false;break;
			}
			if (Symmetric)
				System.out.println("the given matrics is symmetrics");
			else
				System.out.println("the given matrics is not symmetrics");
		}
		
	}

}
