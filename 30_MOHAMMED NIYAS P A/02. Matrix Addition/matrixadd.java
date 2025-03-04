package MODULE1;
import java.util.Scanner;

public class matrixadd {


	public static void main(String[] args) {
	int p,q,m,n;
	Scanner S= new Scanner (System.in);
	System.out.print("enter number of rows in matrix A:");
	p=S.nextInt();
	System.out.print("enter number of columnss in matrix A:");
	q=S.nextInt();
	System.out.print("enter number of rows in matrix b :");
	m=S.nextInt();
	System.out.print("enter number of columns in matrix B:");
	n=S.nextInt();
	if(p==m && q==n) {
		int a[][]=new int[p][q];
		int b[][]=new int[m][n];
		System.out.println("enter the element of matrix A:");
		for(int i=0; i<p; i++)
		for(int j=0; j<q; j++)
			a[i][j]=S.nextInt();
		
		
		System.out.print("enter the elements of matrix B:");
		for(int i=0; i<m; i++)
		for(int j=0; j<n; j++)
			b[i][j]=S.nextInt();	
		
        System.out.print("matrix A:");
		for(int i=0; i<p; i++) {
		for(int j=0; j<q; j++)
			
			
			System.out.print(a[i][j] + "  ");
			System.out.println();}
	
	    System.out.print("matrix B:");
	    for(int i=0; i<m; i++) {
	    for(int j=0; j<n; j++)
	
	    	System.out.print(b[i][j] + "  ");
	    			System.out.println();}
	    
	    System.out.print("the sum matrix :");
	    for(int i=0; i<m; i++) {
	    for(int j=0; j<n; j++)
	    	
	    	
	    	
	    System.out.print((a[i][j]+b[i][j]) + "  ");
		System.out.println();}
	}
	else {
		
		System.out.println("these matrix cannot be added......");
	}
	}
}
					
					
					
