package Module2;
import java.util.Scanner;
class EmployeeT
{
	int empid;
	String name;
	float salary;
	String address;
	EmployeeT() {}
	EmployeeT(int empid,String name,float salary,String address)
	{
		this.empid=empid;
		this.name=name;
		this.salary=salary;
		this.address=address;
	
	}
}

class Teacher extends EmployeeT
{
	String department,subject;
	Teacher(int empid,String name,float salary,String address,String department,String subject)
	{
		super(empid,name,salary,address);
		this.department=department;
		this.subject=subject;
	}
	public Teacher(String name, String gender, String address, int age, int empid, String company_name,
			String qualification, float salary, String subject2, String department2, int tid) {
		
	}
	public void display ()
	{
		System.out.println("Teacher id:"+empid);
		System.out.println("Teacher name:"+name);
        System.out.println("Teacher salary:"+salary);
        System.out.println("Teacher address:"+address);
		System.out.println("Teacher subject:"+subject);

	}
}

