package module_2;

import java.util.Scanner;

public class LinearSearch {
	
	public static void LinearSearching(int find, int array[]) {
		int len = array.length;
		for(int i = 0; i < len; i++) {
			if(array[i] == find) {
				System.out.println("Element found at "+(i+1));
				break;
			}
			if(i == len)
				System.out.println("Element not found");
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int c,n,array[];
		System.out.println("Enter number of elements: ");
		n = sc.nextInt();
		array = new int[n];
		System.out.println("Enter elements: ");
		for(int i = 0; i < n; i++)
		{
			array[i] = sc.nextInt();
		}
		System.out.println("Enter an element to find: ");
		c = sc.nextInt();
		sc.close();
		LinearSearching(c,array);
	}

}
