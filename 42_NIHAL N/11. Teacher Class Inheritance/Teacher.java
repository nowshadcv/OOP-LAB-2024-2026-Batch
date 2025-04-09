package MODULE3;

public class Teacher extends EmployeeT{
	String department,subject;
	Teacher(int empid, String name, String address, float salary, String department, String subject){
		super(empid,name,address,salary);
		this.department = department;
		this.subject = subject;
	}
	protected void display(){
		System.out.println("Teacher id: "+empid);
		System.out.println("Teacher name: "+name);
		System.out.println("Teacher salary: "+salary);
		System.out.println("Teacher Address: "+address);
		System.out.println("Teacher department: "+department);
		System.out.println("Teacher subject: "+subject);
	}
}