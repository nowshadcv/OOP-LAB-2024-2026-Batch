package module_2;

import java.util.Arrays;
import java.util.Scanner;

public class StringSort {

	public static void main(String[] args) {
		int count = 0;
		String temp = "";
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of Strings to sort");
		count = sc.nextInt();
		String strlist[] = new String[count];
		Scanner scan1 = new Scanner(System.in);
		System.out.println("Enter your strings");
		for(int i = 0; i < count; i++)
			strlist[i] = scan1.nextLine();
		System.out.println("Choose 1 or 2 from the menu below");
		System.out.println("1.in-built Sort");
		System.out.println("2.User Defined Sort");
		int choice = sc.nextInt();
		switch(choice)
		{
		case 1:
			Arrays.sort(strlist);
			System.out.println(Arrays.toString(strlist));
			break;
		case 2:
			for(int i = 0 ; i < count-1 ; i++) {
				for(int j = i + 1; j < count; j++) {
					if(strlist[i].compareTo(strlist[j]) > 0){
					temp = strlist[i];
					strlist[i] = strlist[j];
					strlist[j] = temp;
				}
				}
			}
			System.out.println(Arrays.toString(strlist));
			break;
		}
		sc.close();
		scan1.close();
	}

}
