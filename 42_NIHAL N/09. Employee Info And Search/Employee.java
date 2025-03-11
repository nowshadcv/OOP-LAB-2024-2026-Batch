package MODULE2;
import java.util.Scanner;

public  class Employee {
	int eNo, eSalary;
	String eName;
	public Employee(int no, int sal, String name) {
		this.eNo = no;
		this.eSalary = sal;
		this.eName = name;
	}
	public void showData(){
		System.out.println("EmpId: "+eNo+"\nName: "+eName+"\nSalary: "+eSalary);
		System.out.println();
	}
	
	




	public static class EmpArrObjects {

		/**
		 * @param args
		 */
		public static void main(String[] args) {
			
			System.out.println("Enter number of employees");
			Scanner sc = new Scanner(System.in);
			int n = sc.nextInt();
			System.out.println("Enter employee details: ");
			Employee employees[] = new Employee[n];
			Scanner scemp = new Scanner(System.in);
			int eid,esal;
			String  ename;
			for(int i = 0; i  < n; i++) {
				System.out.println("\nEnter details of employee "+(i+1));
				System.out.println("Employee id(integer): ");
				eid = scemp.nextInt();
				scemp.nextLine();
				System.out.println("Employee name: ");
				ename = scemp.nextLine();
				System.out.println("Salary: ");
				esal = scemp.nextInt();
				Employee emp = new Employee(eid, esal, ename);
				employees[i] = emp;
			}
			System.out.println("Employees are:\n");
			for(Employee y: employees)
				y.showData();
			System.out.println("Enter employee number to search");
			int search = sc.nextInt();
			boolean found = false;
			for(Employee x: employees) {
				if(search == x.eNo) {
					found = true;
					System.out.println("Employee found");
					x.showData();
					break;
				}
			}
			if(!found)
				System.out.println("Employee not found");
			sc.close();
			scemp.close();
		}

	}
}
