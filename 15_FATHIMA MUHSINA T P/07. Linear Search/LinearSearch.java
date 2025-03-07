package MODULE1;
import java.util.Scanner;
public class LinearSearch 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int i,n,search;
		System.out.println("Enter the number of elements in array :");
		n=sc.nextInt();
		sc.nextLine();
		int array[]=new int[n];
		System.out.println("Enter the " + n + "elements in array :");
		for(i=0;i<n;i++)
		{
			array[i]=sc.nextInt();
			sc.nextLine();
		}
		System.out.println("Enter the elements you want to search :");
		search=sc.nextInt();
		sc.nextLine();
		for(i=0;i<n;i++)
		{
			if(array[i]==search)
			{
				System.out.println( search +"is present in the location "+ (i+1) );
				break;
			}
		}
		if(i==n)
			System.out.println( search +"is not present in the array" );	
		sc.close();
	}

}
