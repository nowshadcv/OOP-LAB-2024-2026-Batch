package MODULE_3;

public class Teacher extends EmployeeT{
	String department, subject;
	Teacher (int empid, String name, float salary, String address, String department, String subject){
		super(empid,name,salary,address);
		this.department = department;
		this.subject = subject;
	}
	public void display() {
		System.out.println("Teacher id : "+empid);
		System.out.println("Teacher name : "+name);
		System.out.println("Teacher salary : "+salary);
		System.out.println("Teacher address : "+address);
		System.out.println("Teacher department : "+department);
		System.out.println("Teacher subject : "+subject);
	}
}
