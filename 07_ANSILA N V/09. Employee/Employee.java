package MODULE2;


import java.util.Scanner;

public class Employee {
	int eNo,eSalary;
	String eName;

	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public Employee(int no,int Sal,String Name) {
		eNo=no;
		eSalary=Sal;
		eName=Name;
	}
		
		public void ShowData() {
			System.out.print("empid="+eNo+" "+"Name="+eName+" "+"Salary="+eSalary);
			System.out.println();
		}
		
		

	public static void main(String[] args) {
		System.out.println("Enter number of employees:");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println("Enter employee details one by one..");
		Employee employees[] = new Employee[n];
		Scanner scemp =new Scanner(System.in);
		int eid,eSal;
		String enam;
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter" + i + "employee details..");
			System.out.println("Enter employee id(integer):");
			eid = scemp.nextInt();
			System.out.println("Enter employee name (string):");
			String nam = scemp.next();
			enam = new String(nam);
			System.out.println("Enter the employee salary(integer):");
			eSal = scemp.nextInt();
			Employee emp = new Employee(eid,eSal,enam);
			employees[i] = emp;

		}
		System.out.println("Employees are:\n");
		for(Employee y :employees)
			y.ShowData();
		System.out.println("Enter employee number to search:");
		int semp = sc.nextInt();
		boolean found = false;
		for(Employee e : employees) {
			if(semp == e. eNo) {
				found = true;
				System.out.println("Employee found");
				e.ShowData();
				break;
			}
		}
		if(!found)
			System.out.println("Employee not found.");
		
		// TODO Auto-generated method stub

	}

}



