package MODULE3;

public class Teacher extends Employee 
{
	String department,subject;
	public Teacher(int empid,String name,float salary,String address,String department,String subject)
	{
		super(empid,name,salary,address);
		this.department=department;
		this.subject=subject;
	}
	public void display()
	{
		System.out.println("Teacher's id : "+ empid);
		System.out.println("Teacher's Name : "+ name);
		System.out.println("Teacher's salary : "+ salary);
		System.out.println("Teacher's Address : "+ address);
		System.out.println("Teacher's department : "+ department);
		System.out.println("Teacher's subject : "+ subject);
		
	}
}
