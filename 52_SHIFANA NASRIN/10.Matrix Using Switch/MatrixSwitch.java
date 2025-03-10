package MODULE_1;
import java.util.Arrays;
import java.util.Scanner;
public class MatrixSwitch {

	public MatrixSwitch() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		int p,q,m,n;
		Scanner s=new Scanner(System.in);
		System.out.print("enter number of row in matrix A:");
		p=s.nextInt();
		System.out.print("enter number of columns in matrix A:");
		q=s.nextInt();
		System.out.print("enter number of row in matrix B:");
		m=s.nextInt();
		System.out.print("enter number of columns in matrix B:");
		n=s.nextInt();
		if( p==m && q==n) {
			int a[][]=new int[p][q];
			int b[][]=new int[m][n];
			
			System.out.println("enter the element of matrix A:");
			for(int i=0;i<p;i++)
				for(int j=0;j<q;j++)
					a[i][j]=s.nextInt();
			
			System.out.println("enter the element of matrix B:");
			for(int i=0;i<m;i++)
				for(int j=0;j<n;j++)
					b[i][j]=s.nextInt();
			
			System.out.println("Matrix A:");
			for(int i=0;i<p;i++) {
				for(int j=0;j<q;j++)
					System.out.print(a[i][j]+"  ");
			    System.out.println();}
			
			System.out.println("Matrix B:");
			for(int i=0;i<m;i++) {
				for(int j=0;j<n;j++)
					System.out.print(b[i][j]+"  ");
			    System.out.println();}
			
			
			 System.out.println("choose 1 or 4 from the menu below");
			 System.out.println("1.Addition");
			 System.out.println("2.Substraction");
			 System.out.println("3.division");
			 System.out.println("4.transpose of A");
			 System.out.println("5.transpose of B");


			 
			 int  choice;
			 choice=s.nextInt();
			 switch(choice) {
			 case 1:
				 System.out.println("The sum of matrix");
					for(int i=0;i<m;i++) {
						for(int j=0;j<n;j++) 
							System.out.print(a[i][j]+b[i][j]+"  ");
						System.out.println();
						}
					
					break;
						
			 case 2:
				 System.out.println("The substraction of matrix");
					for(int i=0;i<m;i++) {
						for(int j=0;j<n;j++) 
							System.out.print(a[i][j]-b[i][j]+"  ");
						System.out.println();
						}
				
					break;
			 case 3:
				 System.out.println("The division of matrix");
					for(int i=0;i<m;i++) {
						for(int j=0;j<n;j++) 
							System.out.print(a[i][j]/b[i][j]+"  ");
						System.out.println();
					}
				
					break;
					case 4:
						 System.out.println("The transpose of matrix");
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
			
