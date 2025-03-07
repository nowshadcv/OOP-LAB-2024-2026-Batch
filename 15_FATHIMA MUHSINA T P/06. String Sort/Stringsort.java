package MODULE1;
import java.util.Arrays;
import java.util.Scanner;
public class Stringsort {

	public static void main(String[] args) {
		int count=0;
		String tmp;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of strings to sort :");
		count=sc.nextInt();
		sc.nextLine();
		String strlist[]=new String[count];
		System.out.println("Enter the strings to sort :");
		for(int i=0;i<count;i++)
			strlist[i]=sc.nextLine();
		System.out.println("Choose 1 or 2 in the given menu :\n1. In-built sort\n2. User-defined sort");
		int choice=sc.nextInt();
		sc.nextLine();
		sc.close();
		switch(choice)

		{
			case 1: Arrays.sort(strlist);
					System.out.println(Arrays.toString(strlist));
					break;
			case 2: for(int i=0;i<count-1;i++)
					{
						for(int j=i+1;j<strlist.length;j++)
						{
							if(strlist[i].compareTo(strlist[j])>0)
							{
								tmp=strlist[i];
								strlist[i]=strlist[j];
								strlist[j]=tmp;
							}
						}
					}
					System.out.println(Arrays.toString(strlist));
					break;
		}
	}

}
