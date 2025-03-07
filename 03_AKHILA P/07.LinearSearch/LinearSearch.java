package MODULE1;
import java.util.Scanner;

public class LinearSearch {
	public static void main(String[] args) {
		int i,n, search,array[];
		Scanner in = new Scanner (System.in);
		System.out.println("Enter the number of elements");
		n = in.nextInt();
		array = new int [n];
		System.out.println("Enter those " +n +"elemnts");
		for( i = 0; i < n ; i++) {
			array[i] = in.nextInt();
			
		}
			
			
		System.out.println("Enter the value you want to find: ");
		search = in.nextInt();
		for(i=0; i<n; i++)
			if(array [i] == search) {
				System.out.println(search +"is present in the location"+(i+1));
				break;
				}
			if(i == n)
				System.out.println(search +"is not present in array.");
				
				
		
			
	}

}
