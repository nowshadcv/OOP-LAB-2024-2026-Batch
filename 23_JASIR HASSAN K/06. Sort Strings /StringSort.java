package Module_2;

import java.util.Scanner;
import java.util.Arrays;

public class StringSort {
	public static void main(String[] args) {
		int count = 0 ; 
		String tmp ;
		Scanner sc = new Scanner( System.in) ;
		System.out.println("Enter the number of strings to sort: ");
		count = sc.nextInt();
		System.out.println("Enter the String:");
		String strlist [ ] = new String [ count ] ;
		Scanner sc1 = new Scanner ( System.in ) ;
		for ( int i = 0 ; i < count ; i++ )
			strlist [ i] = sc1.nextLine();
		
		System.out.println("Choose 1 or 2 from the menu below:");
		System.out.println("1 : in-built sort ");
		System.out.println("2 : user-defined sort");
		int choice ; 
		choice = sc.nextInt();
		switch ( choice ){
		case 1 : Arrays.sort(strlist);
				System.out.println(Arrays.toString(strlist));
				break ;
		case 2: for (int i = 0; i < count-1; i++)
					for (int j = 0; j < strlist.length ; j++)
						if (strlist [ i ].compareTo(strlist [ j ]) > 0) {
							tmp = strlist[ i ];
							strlist[ i ] = strlist [ j ];
							strlist[ j ] = tmp;					
						}
				System.out.println(Arrays.toString(strlist));
				break ;
		
		}
		sc.close();
		sc1.close();
	}
}
