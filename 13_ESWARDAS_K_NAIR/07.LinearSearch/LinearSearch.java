package MODULE_2;

import java.util.Scanner;

public class LinearSearch 
{

	public static void main(String[] args) 
	{
		int c,n,search,array[];
		boolean state = true;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the number of elements:");
		n = in.nextInt();
		array = new int[n];
		
		System.out.println("Enter those "+n+" elements");
		for(int i=0;i<n;i++)
		{
			array[i] = in.nextInt();
		}
		
		System.out.println("Enter the element to find:");
		search = in.nextInt();
		for(int j=0;j<n;j++)
		{
			if (array[j] == search)
			{
				System.out.println(search+" is found at position:"+(j+1));
				state = true;
				break;
			}
			else
			{
				state = false;
			}

		}
		
		if(state == false)
		{
			System.out.println(search+" is not present in the array!!");
		}

		in.close();
	}

}
