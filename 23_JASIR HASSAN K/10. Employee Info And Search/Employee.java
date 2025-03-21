package Module_2;

public class Employee {
	int eNo,eSalary;
	String eName;
	public Employee (int no, String name, int salary) {
		eNo = no;
		eName = name;
		eSalary =  salary;
	}
	public void showData() {
		System.out.println("EmpId     = "+eNo);
		System.out.println("EmpName   = "+eName);
		System.out.println("EmpSalary = "+eSalary);
		System.out.println();
	}
}

