package Module_2;

import java.util.Scanner;

public class EmpArrObjects {
	public static void main(String[] args) {
		System.out.println("Enter number of employees :");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println("Enter the employees one by one :");
		Employee employees[ ] = new Employee[n];
		Scanner scemp = new Scanner(System.in);
		int eid,esal;
		String ename;
		for (int i = 0; i < n; i++) {
			System.out.println("Enter the "+i+1+" Employee details: ");
			System.out.println("Enter the "+i+1+" Employeeid ( integer) : ");
			eid = scemp.nextInt();
			System.out.println("Enter the "+i+1+" Employee Name ( String) :");
			String name = scemp.next();
			ename = new String(name);
			System.out.println("Enter the "+i+1+" Employee Salary ( integer)");
			esal = scemp.nextInt();
			Employee emp = new Employee( eid, ename, esal);
			employees[i] = emp;
		}
		System.out.println("Employees are : \n ");
		for (Employee y : employees )
			y.showData();
		System.out.println("Enter the employee number to search : ");
		int semp = sc.nextInt();
		boolean found = false;
		for (Employee e : employees) {
			if (semp == e.eNo ) {
				found = true ;
				System.out.println("Employee found.");
				e.showData();
				break;
			}
		}
		if (!found )
			System.out.println("Employee not found..");
	}
}
