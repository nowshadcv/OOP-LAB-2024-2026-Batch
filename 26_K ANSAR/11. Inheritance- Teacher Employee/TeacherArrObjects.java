package module_3;

import java.util.Scanner;

class EmployeeT{
	int empid;
	String name;
	float salary;
	String address;
	EmployeeT(){}
	EmployeeT(int empid, String name,float salary,String address){
		this.empid=empid;
		this.name=name;
		this.salary=salary;
		this.address=address;
	}
}

class Teacher extends EmployeeT{
	String dept,sub;
	Teacher(int empid, String name,float salary,String address,String dept,String sub){
		super(empid,name,salary,address);
		this.dept=dept;
		this.sub=sub;
	}
	public void display() {
		System.out.println("teacher id:" + empid);
		System.out.println("teacher name:" +name);
		System.out.println("teacher salary:" +salary);
		System.out.println("teacher address:" +address);
		System.out.println("teacher department:" +dept);
		System.out.println("teacher subject:" +sub);
	}
}

public class TeacherArrobjects {

	public TeacherArrobjects() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		System.out.println("Enter number of Teachers: ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println("Enter teacher details:  ");
		Teacher teacher [] = new Teacher [n];
		Scanner sct= new Scanner(System.in);
		int tid;String name;float salary;String address;
		String dept;String sub;
		for (int i=0;i<n;i++) {
			System.out.println("Enter "+ i+ " teacher details");
			System.out.println("Enter teacher id: ");
			tid =sct.nextInt();
			System.out.println("Enter teacher name: ");
			name =sct.next();
			System.out.println("Enter teacher salary: ");
			salary =sct.nextFloat();
			System.out.println("Enter teacher address: ");
			address =sct.next();
			System.out.println("Enter teacher department: ");
			dept =sct.next();
			System.out.println("Enter teacher subjects: ");
			sub =sct.next();
			Teacher t = new Teacher(tid,name,salary,address,dept,sub);
			teacher[i] = t;
		}
		System.out.println("Teacher details: ");
		for (Teacher x : teacher) {
			x.display();
			System.out.println("\n");
		}
	}

}
