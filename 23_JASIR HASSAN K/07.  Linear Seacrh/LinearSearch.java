package Module_2;
import java.util.Scanner;
public class LinearSearch {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int c,n,search,array[];
		System.out.println("Enter the number of element:");
		n = sc.nextInt();
		array = new int[n];
		System.out.println("Enter those "+n+" elements:");
		for ( c = 0; c < n; c++)
			array[c] = sc.nextInt();
		System.out.println("enter the element you want to find:");
		search =sc.nextInt();
		
		for ( c = 0; c < n; c++)
			if ( array[c] == search) {
				System.out.println(search+" present in " +(c + 1));
				break;
			}
		if ( c == n) {
			System.out.println(search+" not present in it");
		}
		sc.close();
	}	
}
