package MODULE_3;
import java.util.Scanner;
class Person
{
	String name,gender,address;
	int age;
	Person(String name,String gender,String address,int age)
	{
		this.name = name;
		this.gender = gender;
		this.address = address;
		this.age = age;
	}
}

class Employee extends Person
{
	String empid,company_name,qualification;
	float salary;
	Employee(String name,String gender,String address,int age,String empid,String company_name,String qualification,float salary)
	{
		super(name,gender,address,age);
		this.empid = empid;
		this.company_name = company_name;
		this.qualification = qualification;
		this.salary = salary;
	}
}

class Teacher extends Employee
{
	String subject,department,teacherid;
	Teacher(String name,String gender,String address,int age,String empid,String company_name,String qualification,float salary,String subject,String department,String teacherid)
	{
		super(name,gender,address,age,empid,company_name,qualification,salary);
		this.subject = subject;
		this.department = department;
		this.teacherid = teacherid;
	}



	public void display()
	{
		System.out.println("Teacher id :"+empid);
		System.out.println("Teacher name :"+name);
		System.out.println("Teacher gender :"+gender);
		System.out.println("Teacher address :"+address);
		System.out.println("Teacher age :"+age);
		System.out.println("Teacher company name :"+company_name);
		System.out.println("Teacher qualification :"+qualification);
		System.out.println("Teacher salary :"+salary);
		System.out.println("Teacher teacher id :"+teacherid);
		System.out.println("Teacher subject :"+subject);
		System.out.println("Teacher department :"+department);
	}
}


public class TeacherArrObject
{

	public static void main(String[] args) 
	{
		System.out.println("Enter the number of teacher:");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println("Enter the teacher details one by one!");
		Teacher teacher[] = new Teacher[n];
		Scanner sct = new Scanner(System.in);
		String tid;
		int age;
		String name,company_name,qualification,gender,address,department,subject,empid;
		float salary;
		
		for(int i = 0;i<n;i++)
		{
			System.out.println("Enter the details of Teacher"+(i+1));
			System.out.println("Enter the teacher id:");
			tid = sct.next();
			System.out.println("Enter the employee id of the Teacher"+(i+1));
			empid = sct.next();
			System.out.println("Enter the teacher name:");
			name = sct.next();
			System.out.println("Enter the teacher gender:");
			gender = sct.next();
			System.out.println("Enter the teacher address:");
			address = sct.next();
			System.out.println("Enter the teacher age:");
			age = sct.nextInt();
			System.out.println("Enter the teacher company name:");
			company_name = sct.next();
			System.out.println("Enter the teacher department name:");
			department = sct.next();
			System.out.println("Enter the teacher qualification :");
			qualification = sct.next();
			System.out.println("Enter the teacher subject :");
			subject = sct.next();
			System.out.println("Enter the teacher salary:");
			salary = sct.nextFloat();
			
			Teacher t = new Teacher(name,gender,address,age,empid,company_name,qualification,salary,subject,department,tid);
			teacher[i] = t;
			
		}
		System.out.println("Teachers are:\n");
		for(Teacher x:teacher)
		{
			x.display();
			System.out.println("\n");
		}
	}
}
