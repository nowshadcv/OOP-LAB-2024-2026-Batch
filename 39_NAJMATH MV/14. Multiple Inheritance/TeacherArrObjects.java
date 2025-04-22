package MODULE3;

import java.util.Scanner;


public class TeacherArrObjects 
{
	
		public static void main(String[] args) {
			System.out.println("enter number of teacher:");
			Scanner sc=new Scanner(System.in);
			int n=sc.nextInt();
			System.out.println("enter teacher details one by one...");
			Teachers teacher[]=new Teachers[n];
			Scanner sct=new Scanner(System.in);
			int teacherid,age;String name,company_name,qualification,gender,empid;float salary;String address;String department;String subject;
			for(int i=0;i<n;i++)
			{
				System.out.println("Enter employee id of Teacher"+(i+1));
				System.out.println("enter teacher id(integer):");
				teacherid=sct.nextInt();
				System.out.println("enter employee id of teacher"+(i+1)+"(integer):");
				empid=sct.next();
				System.out.println("enter teacher name(string):");
				name=sct.next();
				System.out.println("enter teacher address(string):");
				address=sct.next();
				System.out.println("enter teacher gender(string):");
				gender=sct.next();
				System.out.println("enter teacherage(integer):");
				age=sct.nextInt();
				System.out.println("enter teacher company name(string):");
				company_name=sct.next();
				System.out.println("enter teacher department(string):");
				department=sct.next();
				System.out.println("enter teacher qualification(string):");
				qualification=sct.next();
				System.out.println("enter teacher subject (string):");
				subject=sct.next();
				System.out.println("enter teacher salary(float):");
				salary=sct.nextFloat();
				Teachers t=new Teachers(name,gender,address,age,empid,company_name,qualification,salary,subject,department,teacherid);
				teacher[i]=t;
			}
			System.out.println("teacher are:\n");
			for(Teachers x:teacher) {
				x.display();
				System.out.println("\n");
			}
		}
}
		