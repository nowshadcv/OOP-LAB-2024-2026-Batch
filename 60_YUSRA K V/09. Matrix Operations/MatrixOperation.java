package MODULE1;
import java.util.Scanner;
public class MatrixOperation {
	public static void main(String[] args) {
		int p,q,m,n;
		Scanner s = new Scanner(System.in);
		System.out.print("Enter number of rows in Matrix A:");
		p=s.nextInt();
		System.out.print("Enter number of columns in Matrix A:");
		q=s.nextInt();
		System.out.print("Enter number of rows in Matrix B:");
		m=s.nextInt();
		System.out.print("Enter number of columns in Matrix B:");
		n=s.nextInt();
		if(p==m&&q==n) {
			int a[][]=new int[p][q];
			int b[][]=new int[m][n];
			System.out.println("Enter the elements of Matrix A:");
			for(int i=0;i<p;i++)
				for(int j=0;j<q;j++)
					a[i][j]=s.nextInt();
			System.out.println("Enter the elements of Matrrix B:");
			for(int i=0;i<m;i++)
				for(int j=0;j<n;j++)
					b[i][j]=s.nextInt();
			System.out.println("Matrix A:");
			for(int i=0;i<p;i++) {
				for(int j=0;j<q;j++)
					System.out.print(a[i][j]+" ");
				System.out.println();}
			System.out.println("Matrix B:");
			for(int i=0;i<m;i++) {
				for(int j=0;j<n;j++)
					System.out.print(b[i][j]+" ");
				System.out.println();}
		
		System.out.println("1.Addition \n2.Substraction \n3.Division \n4.Transpose of A \n5.Transpose of B");
		System.out.println("Enter your choice:");
		int choice;
		choice=s.nextInt();
		switch (choice) {
		case 1:System.out.println("Sum Matrix:");
				for(int i=0;i<m;i++) {
					for(int j=0;j<n;j++)
						System.out.print(a[i][j]+b[i][j]+" ");
					System.out.println();}
				
				break;
		case 2:System.out.println("Sub Matrix:");
				for(int i=0;i<m;i++) {
					for(int j=0;j<n;j++)
						System.out.print(a[i][j]-b[i][j]+" ");
					System.out.println();}
				
				break;
		case 3:System.out.println("div Matrix:");
				for(int i=0;i<m;i++) {
					for(int j=0;j<n;j++)
						System.out.print(a[i][j]/b[i][j]+" ");
				System.out.println();}
			
				break;
		case 4:System.out.println("transpose Matrix:");
				for(int i=0;i<m;i++) {
					for(int j=0;j<n;j++) 
						System.out.print( a[j][i]+"  ");
					System.out.println();
				}
				break;
		case 5:
				for(int i=0;i<m;i++) {
					for(int j=0;j<n;j++) 
						System.out.print(b[j][i]+"  ");
					System.out.println();
				}
				break;
		}
		}
	}
}

	
	
				
		
		