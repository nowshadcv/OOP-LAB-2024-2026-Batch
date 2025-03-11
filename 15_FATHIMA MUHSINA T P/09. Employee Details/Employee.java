package MODULE2;
import java.util.Scanner;
public class Employee 
{
	int eNo,eSalary;
	String eName;
	public Employee() 
	{
		
	}
	public Employee(int No, int Salary, String Name) 
	{
		eNo=No;
		eSalary=Salary;
		eName=Name;
	}
	public void showData()
	{
		System.out.println("Employee Id = "+ eNo +"\nEmployee Name = "+ eName + "\nSalary = " + eSalary);
	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of employees :");
		int n=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter the employees details one by one :");
		Employee employees[]=new Employee[n];
		int eid,esal;
		String enam;
		for(int i=0;i<n; i++) 
		{
			System.out.println("Enter "+i+"Employee details");
			System.out.println("Enter employee id (integer) : ");
			eid=sc.nextInt();
			sc.nextLine();
			System.out.println("Enter Employee Name (String ) : ");
			String nam=sc.nextLine();
			enam=new String(nam);
			System.out.println("Enter employee salary (integer) : ");
			esal= sc.nextInt();
			sc.nextLine();
			Employee emp=new Employee(eid,esal,enam);
			employees[i]=emp;
		}
		System.out.println("Employees are : \n");
		for(Employee y : employees)
			y.showData();
		System.out.println("Enter empoyee number to search :");
		int semp=sc.nextInt();
		sc.nextLine();
		boolean found = false;
		for(Employee e : employees) 
		{
			if(semp==e.eNo) 
			{
				found=true;
				System.out.println("Employee found");
				e.showData();
				break;		
			}	
		}
		if(! found)
			System.out.println("Employee not found");		
		sc.close();
	}

}
