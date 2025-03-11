package MODULE1;
import java.util.Scanner;
public class MatrixOperations {
	public static void main(String[] args) {
		int p,q,m,n;
		Scanner s = new Scanner(System.in);
		System.out.print("enter number of rows in matrix A:");
		p=s.nextInt();
		System.out.print("enter number of columns in matrix A:");
		q=s.nextInt();
		System.out.print("enter number of rows in matrix B:");
		m=s.nextInt();
		System.out.print("enter number of columns in matrix B:");
		n=s.nextInt();
		if(p==m&&q==n) {
			int a[][]=new int[p][q];
			int b[][]=new int[m][n];
			System.out.println("enter the elements of matrix A:");
			for(int i=0;i<p;i++) {
				for(int j=0;j<q;j++) {
					a[i][j]=s.nextInt();
				}
					
			}
			System.out.println("enter the elements of matrix B:");
			for(int i=0;i<m;i++) {
				for(int j=0;j<q;j++) {
					b[i][j]=s.nextInt();
				}
			}
			System.out.println("matrix A:");
			for(int i=0;i<p;i++) 
			{
				for(int j=0;j<q;j++) 
				{
					System.out.print(a[i][j]+" ");
				}
				System.out.println();
			}
			System.out.println("matrix B:");
			for(int i=0;i<m;i++) 
			{
				for(int j=0;j<n;j++) 
				{
					System.out.print(b[i][j]+" ");
				}
			System.out.println();
			}
		System.out.println("Enter your choice:");
		System.out.println("1.Additin \n2.Substraction \n3.Division \n4.Transpose of A \n5.Transpose of B");
		int choice;
		choice=s.nextInt();
		switch(choice) {
		case 1:System.out.println("the sum matrix:");
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) 
			
				System.out.print((a[i][j]+b[i][j])+" ");
			
			System.out.println();
		}
		break;
		case 2:System.out.println("substraction:");
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) 
			
				System.out.print((a[i][j]-b[i][j])+" ");
			
			System.out.println();
		}
		break;
		case 3:System.out.println("Division");
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) 
			
				System.out.print((a[i][j]/b[i][j])+" ");
			
			System.out.println();
		}
		break;
		case 4:System.out.println("transpose matrix");
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++)
				System.out.print(a[j][i]+" ");
			System.out.println();
		}
		break;
		case 5:
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++)
				System.out.print(b[j][i]+" ");
			System.out.println();
		}
		break;
		}
		}
	}
}
			

		
		