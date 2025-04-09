package MODULE_2;

import java.util.Scanner;

public class TeacherArrObjects{
	public static void main(String[] args) {
		System.out.println("Enter number of Teachers:");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println("Enter Teacher details one by one:");
		Teacher teacher[]=new Teacher[n];
		Scanner sct=new Scanner(System.in);
		int tid;String name;float salary;String address;String department;String subject;
		for (int i=0;i<n;i++) {
			System.out.println("Enter" +i+ "teacher details..");
			System.out.println("Enter teacher id(integer):");
			tid=sct.nextInt();
			System.out.println("Enter teacher name(name):");
			name=sct.next();
			System.out.println("Enter teacher salary(float):");
			salary=sct.nextFloat();
			System.out.println("Enter teacher address(string):");
			address=sct.next();
			System.out.println("Enter teacher department(string):");
			department=sct.next();
			System.out.println("Enter teacher subject(string):");
			subject=sct.next();
			Teacher t=new Teacher(tid,name,salary,address,department,subject);
			teacher[i]=t;}
		System.out.println("Teachers are:\n");
		for(Teacher x:teacher) {
			x.display();
			System.out.println("\n");
		
			
		}
	}}