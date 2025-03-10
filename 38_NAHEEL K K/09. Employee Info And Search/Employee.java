package module_2;

public class Employee {
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
}
