package MODULE1;

import java.util.Arrays;
import java.util.Scanner;
public class StringSort
{
	public static void main(String[]args)
	{
		int count=0;
		String tmp;
		Scanner Scan=new Scanner(System.in);
		System.out.println("enter the number of strings to sort:");
		count=Scan.nextInt();
		String strlist[]=new String[count];
		Scanner Scan1=new Scanner(System.in);
		System.out.println("enter your Strings");
		for(int i=0;i<count;i++)
			strlist[i]=Scan1.nextLine();
		System.out.println("choose 1 or 2 fromthe menu below:"); 
		System.out.println("1: in-built Sort");
		System.out.println("2: user_defined Sort");
		int choice;
		choice=Scan.nextInt();
		switch(choice)
		{
		case 1:Arrays.sort(strlist);
		System.out.println(Arrays.toString(strlist));
		break;
		case 2:for(int i=0;i<count-1;i++)
			for(int j=i+1;j<strlist.length;j++)
				if(strlist[i].compareTo(strlist[j])>0)
				{
					tmp=strlist[i];
					strlist[i]=strlist[j];
					strlist[j]=tmp;
				}
		System.out.println(Arrays.toString(strlist));
		break;
		}
	}
}
