package MODULE_2;

import java.util.Scanner;

public class EmpArrObjects 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of employees:");
		int n = sc.nextInt();
		
		Employee employees[] = new Employee[n];
		int eid,esal;
		String enam;
		Scanner scemp = new Scanner(System.in);
		System.out.println("------Enter "+n+" employee details------\n");
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter employee"+(i+1)+" details");
			
			System.out.println("Enter the employee id(integer):");
			eid = scemp.nextInt();

			System.out.println("Enter the employee name(String):");
			String name = scemp.next();
			enam = new String (name);
			
			System.out.println("Enter the employee salary():");
			esal = scemp.nextInt();
			
			Employee emp = new Employee(eid,esal,enam);
			employees[i] = emp;
			System.out.println("- - - - - - - - - - - - - - - - - - - - - - -");
			
		}
		
		System.out.println("Employees are : \n");
		for(Employee y : employees)
		{
			y.showData();
		}
		
		System.out.println("Enter employee number to search:");
		int semp = sc.nextInt();
		boolean found = false;
		for(Employee e : employees)
		{
			if(semp == e.eNo)
			{
				found = true;
				System.out.println("Employee found!");
				e.showData();
				break;
			}
		}
		if(!found)
		{
			System.out.println("Employee not found!!!!!!!!!!!!");
			
		}
		sc.close();
		scemp.close();
		
	}

}
