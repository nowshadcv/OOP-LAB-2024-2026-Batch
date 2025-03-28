package MODULE_3;

import java.util.Scanner;

public class TeacherArrObjects 
{

	public static void main(String[] args) 
	{
		System.out.println("Enter number of Teachers:");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		Teacher teacher[] = new Teacher[n];
		Scanner scT = new Scanner(System.in);
		int tid;
		String name,address,department,subject;
		float salary;
		
		System.out.println("Enter the teacher details one by one\n");
		for(int i = 0;i<n;i++)
		{
			System.out.println("Enter Teacher"+(i+1)+" details:");
			System.out.println("Enter ID(integer) of the teacher:");
			tid = scT.nextInt();
			System.out.println("Enter name(string) of the teacher:");
			name = scT.next();
			System.out.println("Enter salary(float) of the teacher:");
			salary = scT.nextFloat();
			System.out.println("Enter address(string) of the teacher:");
			address = scT.next();
			System.out.println("Enter department(string) of the teacher:");
			department = scT.next();
			System.out.println("Enter subject(string) of the teacher:");
			subject = scT.next();
			Teacher t = new Teacher(tid,name,salary,address,department,subject);
			teacher[i] = t;
		}
		
		System.out.println("\n");
		System.out.println("Details of "+n+" teachers:");
		System.out.println("------------------------------");
		for(Teacher x : teacher)
		{
			x.display();
			System.out.println("\n");
		}
		
		sc.close();
		scT.close();
	}

}
