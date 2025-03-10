package MODULE1;

public class Employee {
	int eNo,eSalary;
	String eName;
	public Employee() {}
	public Employee (int no, int sal,String Name)
	{
		eNo=no;
		eSalary=sal;
		eName=Name;
	}
	public void showData()
	{
		System.out.print("EmpId="+eNo+""+"Name="+eName+""+"Salary="+eSalary);
		System.out.println();
	}
}
