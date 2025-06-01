package javaaa;
import java.util.Scanner;
public class EmpArrObjects{
	public static void main (String [] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the no of employee to enter:");
		int n=sc.nextInt();
		Employee [] Employees=new Employee[n];
		for(int i=0;i<n;i++) {
			System.out.println("enter the EmpId of "+(i+1));
			System.out.println("EmpId");
			int eid=sc.nextInt();
			sc.nextLine();
			System.out.println("enter the name of employee:");
			String ename=sc.nextLine();
			System.out.println("enter the salary of employee:");
			int esal=sc.nextInt();
			Employees[i]=new Employee(eid,esal,ename);
			
		}
		System.out.println("employee list");
		for(Employee emp:Employees)
			emp.showData();
		System.out.println("enter the eno to search:");
		int search=sc.nextInt();
		boolean found=false;
		for(Employee emp:Employees) {
			if(emp.eNo== search) {
				System.out.println("found");
				emp.showData();
				found=true;
				break;
			}
		}
		if(!found)
			System.out.println("not found");
		sc.close();
		
	}
	package javaaa;
import java.util.Scanner;
public class EmpArrObjects{
	public static void main (String [] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the no of employee to enter:");
		int n=sc.nextInt();
		Employee [] Employees=new Employee[n];
		for(int i=0;i<n;i++) {
			System.out.println("enter the EmpId of "+(i+1));
			System.out.println("EmpId");
			int eid=sc.nextInt();
			sc.nextLine();
			System.out.println("enter the name of employee:");
			String ename=sc.nextLine();
			System.out.println("enter the salary of employee:");
			int esal=sc.nextInt();
			Employees[i]=new Employee(eid,esal,ename);
			
		}
		System.out.println("employee list");
		for(Employee emp:Employees)
			emp.showData();
		System.out.println("enter the eno to search:");
		int search=sc.nextInt();
		boolean found=false;
		for(Employee emp:Employees) {
			if(emp.eNo== search) {
				System.out.println("found");
				emp.showData();
				found=true;
				break;
			}
		}
		if(!found)
			System.out.println("not found");
		sc.close();
		
	}
	
