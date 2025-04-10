package MODULE3;

import java.util.Scanner;

public class TeacherArrObjects{
	  public static void main (String[]args) {
		System.out.println("enter the number of teachers");
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
		System.out.println("enter the teacher details one by one");
		Teacher teacher[]=new Teacher[n];
		Scanner scT=new Scanner (System.in);
		int tid;String name; float salary;String address;
		String department;String subject;
		for(int i=0;i<n;i++) {
			System.out.println("enter "+ i+"teacher details");
			System.out.println("enter the teacher id(integer):");
			tid=scT.nextInt();
			System.out.println("enter the teacher name(String):");
			name=scT.next();
			System.out.println("enter the teacher salary(float):");
			salary=scT.nextFloat();
			System.out.println("enter the teacher address(String):");
			address=scT.next();
			System.out.println("enter the teacher department(String):");
			department=scT.next();
			System.out.println("enter the teacher subject(String):");
			subject=scT.next();
			Teacher t = new Teacher(tid,name,salary,address,department,subject);
			
			teacher[i]=t;}
		System.out.println("teachers are:\n");
		for(Teacher x: teacher) {
			x.display();System.out.println("\n");}}}
			
			
			
			

