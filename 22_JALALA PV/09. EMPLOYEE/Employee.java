package MODULE2;

public class Employee {
	int eno,esalary;
	String ename;
	public Employee() {}
	public Employee(int no,int sal,String name) {
		eno=no;
		esalary=sal;
		ename=name;
	}
	public void showData()
	{
		System.out.print("empid="+eno+" "+"name="+ename+" "+"salary="+esalary);
		System.out.println();
		
	}

}
package MODULE2;
import java.util.Scanner;

public class EmpArrObjects {

	public static void main(String[] args) {
		System.out.println("enter number of employees:");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println("enter employee details one by one");
		Employee   employees[]=new Employee[n];
		Scanner scemp=new Scanner(System.in);
		int eid,esal;
		String enam;
		for(int i=0;i<n;i++)
		{
			System.out.println("enter"+i+"employee details..");
			System.out.println("enter employee id(integer):");
			eid=scemp.nextInt();
			System.out.println("enter employee name(string):");
			String nam=scemp.next();
			enam=new String(nam);
			System.out.println("enter emplyee salary(integer):");
			esal=scemp.nextInt();
			Employee emp=new Employee(eid,esal,enam);
			employees[i]=emp;
		}
		System.out.println("employees are:\n");
		for(Employee y:employees)
			y.showData();
		System.out.println("enter employee number to search:");
		int semp=sc.nextInt();
		boolean found=false;
		for(Employee e:employees)
		{
			if(semp==e.eno)
			{
				found=true;
				System.out.println("employee found");
				e.showData();
				break;
			}
		}
if(!found)
	System.out.println("employee not found");
	
	}

}
