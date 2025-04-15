package MODULE3;
import java.util.Scanner;
public class TeachersArrObjects 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of teachers : ");
		int n=sc.nextInt();
		sc.nextLine();
		Teacher teacher[]=new Teacher[n];
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter details of teacher "+ (i+1) +": ");
			System.out.println("Enter Teacher's id : ");
			int tid=sc.nextInt();
			sc.nextLine();
			System.out.println("Enter Teacher's Name : ");
			String name=sc.nextLine();
			System.out.println("Enter Teacher's salary : ");
			float salary=sc.nextFloat();
			sc.nextLine();
			System.out.println("Enter Teacher's Address : ");
			String address=sc.nextLine();
			System.out.println("Enter Teacher's department : ");
			String department=sc.nextLine();
			System.out.println("Enter Teacher's subject : ");
			String subject=sc.nextLine();
			Teacher t=new Teacher(tid,name,salary,address,department,subject);
			teacher[i]=t;
		}
		sc.close();
		System.out.println("Teachers are :");
		for(Teacher x:teacher)
		{
			x.display();
			System.out.println();
		}
	}

}
