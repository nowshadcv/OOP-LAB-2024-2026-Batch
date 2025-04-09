package MODULE3;

import java.util.Scanner;

public class EmployeeT {
	int empid;
	String name;
	float salary;
	String address;
	EmployeeT(){}
	EmployeeT(int empid,String name,float salary,String address){
		this.empid=empid;
		this.name=name;
		this.salary=salary;
		this.address=address;
	}
	


public static class Teacher extends EmployeeT{
	String department,subject;
	Teacher(int empid,String name,float salary,String address,String department,String subject)
	{
		super(empid,name,salary,address);
		this.department=department;
		this.subject=subject;
	}
	public void display()

	{
		System.out.println("Teacher id:"+empid);
		System.out.println("Teacher name:"+name);
		System.out.println("Teacher salary:"+salary);
		System.out.println("Teacher address:"+address);
		System.out.println("Teacher department:"+department);
		System.out.println("Teacher subject:"+subject);
	}

public static class TeacherArrObjects{
	public static void main(String[] args)
	{
		System.out.println("enter number of teachers");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println("enter teacher details one by one");
		Teacher teacher[]=new Teacher[n];
		Scanner sct=new Scanner(System.in);
		int tid;
		String name;float salary;
		String address;
		String department;
		String subject;
		for(int i=0;i<n;i++)
		{
			System.out.println("enter"+i+"teacher details");
			System.out.println("enter teacher id(integer):");
			tid=sct.nextInt();
			System.out.println("enter teacher name(string)");
			name=sct.next();
			System.out.println("enter teacher salary(float)");
			salary=sct.nextFloat();
			System.out.println("enter teacher address(string)");
			address=sct.next();
			System.out.println("enter teacher department(string)");
			department=sct.next();
			System.out.println("enter teacher subject(string)");
			subject=sct.next();
			Teacher t=new Teacher(tid,name,salary,address,department,subject);
			teacher[i]=t;
			
		}
		System.out.println("teachers are:\n");
		for(Teacher x:teacher) {
			x.display();
			System.out.println("\n");
		}
		
		
	}
}

}
}
