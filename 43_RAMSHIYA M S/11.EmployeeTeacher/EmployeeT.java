package MODULE3;
import java.util.Scanner;

public class EmployeeT {
	int empid;
	String name;
	float salary;
	String  address;
	EmployeeT(){}
	EmployeeT(int empid,String name,float salary,String address){
		this.empid=empid;
		this.name=name;
		this.salary=salary;
		this.address=address;}}
class Teacher extends EmployeeT{
	String department,subject;
	Teacher(int empid,String name,float salary ,String address,String department,String subject){
		super(empid,name,salary,address);
		this.department=department;
		this.subject=subject;}
	public void display() {
		System.out.println("teacher id:"+empid);
		System.out.println("Teacher name:"+name);
		System.out.println("teacher salary:"+salary);
		System.out.println("teacher address:"+address);
		System.out.println("teacher department"+department);
		System.out.println("teacher subject:"+subject);}
	}
	    class TeacherArrObjects{
		public static void main(String[] args) {
			System.out.println("enter number of teacher");
			Scanner sc=new Scanner (System.in);
			int n=sc.nextInt();
			System.out.println("enter teacher details one by one");
			Teacher teacher []=new Teacher[n];
			Scanner scT =new Scanner(System.in);
			int tid;String name;float salary;String address;
			String department;String subject;
			for (int i=0;i<n;i++) {
				System.out.println("Enter"+i+"techer details..");
				System.out.println("enter teacher id");
				tid=scT.nextInt();
				System.out.println("enter the teacher name");
				name=scT.next();
				System.out.println("enter the teacher salary");
				salary=scT.nextFloat() ;
				System.out.println("enter the teacher address");
				address=scT.next();
				System.out.println("enter the teacher department");
				department=scT.next();
				System.out.println("enter the teacher subject");
				subject=scT.next();
				Teacher t= new Teacher(tid, name,salary,address,department,subject);
				teacher[i]=t;}
			System.out.println("teacher are:");
			for(Teacher x: teacher) {
				x.display();System.out.println("\n");}}}
		
	
