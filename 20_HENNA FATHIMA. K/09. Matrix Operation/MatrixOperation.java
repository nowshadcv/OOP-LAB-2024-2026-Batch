package MODULE2;
import java.util.Scanner;

public class MatrixOPeration {
	public static void main(String args[]) {
		
		int p,q,m,n;
		Scanner s=new Scanner(System.in);
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
			System.out.println("Enter the elements of matrix A:");
			for(int i=0;i<p;i++)
				for(int j=0;j<q;j++)
					a[i][j]=s.nextInt();
			System.out.println("Enter the elements of matrix B:");
			for(int i=0;i<m;i++)
				for(int j=0;j<n;j++)
					b[i][j]=s.nextInt();
			
			System.out.println("Matrix A:");
			for(int i=0;i<p;i++) {
				for(int j=0;j<q;j++)
					System.out.print(a[i][j]+ " ");
				System.out.println(); 
				}
			
			System.out.println("Matrix B:");
			for(int i=0;i<m;i++) {
				for(int j=0;j<n;j++)
					System.out.print(b[i][j]+ " ");
				System.out.println(); 
				}
		
			
			System.out.println("Enter your choice:");
			System.out.println("1.Matrix Addition");
			System.out.println("2.Matrix Substraction");
			System.out.println("3.Matrix Division");
			System.out.println("4.Matrix Transpose");
			int choice;
			
		    choice=s.nextInt();
			
			switch(choice) {
		
				case 1:
					System.out.println("The Sum Matrix:");
					for(int i=0;i<m;i++) {
						for(int j=0;j<n;j++)
							System.out.print(a[i][j]+b[i][j]+ " ");
					System.out.println();
					}
				break;	
				case 2:
					System.out.println("The difference Matrix:");
				for(int i=0;i<m;i++) {
					for(int j=0;j<n;j++)
						System.out.print(a[i][j]-b[i][j]+ " ");
				System.out.println();
				}
				break;
				case 3:
					System.out.println("The division Matrix:");
					for(int i=0;i<m;i++) {
						for(int j=0;j<n;j++)
							System.out.print(a[i][j]/b[i][j]+ " ");
					System.out.println();
					}
		       break;
				case 4:
			
					System.out.println("The given Matrix:");
					for(int i=0;i<m;i++) {
						for(int j=0;j<n;j++)
							System.out.print(a[i][j]+"\t");
						System.out.println(); }
					if(m!=n)
						System.out.println("The given matrix is not a square matrix");
					else {
						boolean Symmetric=true;
						for(int i=0;i<m;i++)
							for(int j=0;j<n;j++)
								if(a[i][j]!=b[j][i])
								{
									Symmetric=false; break;
								}
						if(Symmetric)
							System.out.println("The given matrix is symmetric ");
						else
							System.out.println("The given matrix is not symmetric ");
					}
			}
			
		}
	}
}	
