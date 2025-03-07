package MODULE1;

import java.util.Scanner;
import java.util.Arrays;

public class StringSort 
{

	public static void main(String[] args) 
	{

		int count = 0;
		String tmp;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the number of strings to sort:");
		count = scan.nextInt();
		
		String strlist[] = new String[count];
		Scanner scan1 = new Scanner(System.in);
		
		System.out.println("Enter your strings:");
		for(int i=0;i<count;i++)
			strlist[i] = scan1.nextLine();
		int choice=0;
		while(choice!=3)
		{
			System.out.println("Choose 1 or 2 from the menu below:");
			System.out.println("1 : In-built sort");
			System.out.println("2 : User-defined sort");
			System.out.println("3 : Exit");
			choice = scan.nextInt();
			switch(choice)
			{
				case 1 : 
					Arrays.sort(strlist);
					System.out.println(Arrays.toString(strlist));
					break;
				case 2 :
					for(int i=0;i<count;i++)
					{
						for(int j = i+1; j<strlist.length; j++)
						{
							if(strlist[i].compareTo(strlist[j])>0)
							{
								tmp = strlist[i];
								strlist[i] = strlist[j];
								strlist[j] = tmp;
							}
						}
					}
					System.out.println(Arrays.toString(strlist));
					break; 		
			}}}}
