package MODULE_2;

public class Employee 
{
	int eNo,eSalary;
	String eName;

	public Employee(int no,int sal, String name) 
	{
		eNo = no;
		eSalary = sal;
		eName = name;
	}
	public void showData()
	{
		System.out.println("EmpID = "+eNo+" Name = "+eName+" Salary = "+eSalary);
		System.out.println();
	}
}
