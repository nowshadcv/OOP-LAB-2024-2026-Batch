package MODULE_2;

import java.util.Scanner;

public class Employee
{
	int eNo,eSalary;
	String eName;
	public Employee() {}
	public Employee (int no,int Sal,String Name)
	{
		eNo=no;
		eSalary=Sal;
		eName=Name;
	}
	public void ShowData()
	{
		System.out.print("EmpId="+eNo+""+"Name="+eName+""+"Salary="+eSalary);
		System.out.println();
	}
}
