package MODULE1;

import java.util.Scanner;

public class Employee {
	int eNo,eSalary;
	String eName;
	public Employee() {}
	public Employee(int no,int sal,String name) {
		eNo=no;
		eName=name;
		eSalary=sal;
	}
	public void showData() {
		System.out.println("EmpID: "+eNo+" "+"Name: "+eName+" "+"Salary: "+eSalary);
		System.out.println();
	}
public static class EmpArrObjects {

	public static void main(String[] args) {
		System.out.println("Enter number of employees: ");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println("Enter Employee details one by one");
		Employee employees[]=new Employee[ n ];
		Scanner scemp=new Scanner(System.in);
		int eid,eSal;
		String ename;
		for(int i=0; i< n ;i++) 
		{
			System.out.println("Enter employee details..");
			System.out.println("Enter Employee id(integer): ");
			eid=scemp.nextInt();
			System.out.println("Enter employee name(String): ");
			String name=scemp.next();
			ename=new String(name);
			System.out.println("Enter Employee salary(integer): ");
			eSal=scemp.nextInt();
			Employee emp=new Employee(eid,eSal,ename);
			employees[i]=emp;
		}
		System.out.println("Employees are: \n");
		for(Employee y:employees)
			y.showData();
		System.out.println("Enter employee number to search: ");
		int semp=sc.nextInt();
		boolean found=false;
		for(Employee e: employees) {
			if(semp==e.eNo) {
				found=true;
				System.out.println("Employee found ");
				e.showData();
				break;
			}}
		if(!found)
			System.out.println("Employee not found....");
	}
}
}

