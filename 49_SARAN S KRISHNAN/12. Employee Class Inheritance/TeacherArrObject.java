package MODULE_3;

import java.util.Scanner;

public class TeacherArrObject {
	public static void main (String []args) {
		System.out.println("Enter number of teachers : ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println("Enter teacher details one by one...");
		Teacher teacher[] = new Teacher[n];
		Scanner scT = new Scanner(System.in);
		int tid; String name; float salary; String address; String department; String subject;
		for (int i=0; i<n; i++) {
			System.out.println("Enter " + i + " teacher details...");
			System.out.println("Enter teacher's id (integer) : ");
			tid = scT.nextInt();
			scT.nextLine();
			System.out.println("Enter teacher's name (String) : ");
			name = scT.next();
			System.out.println("Enter teacher's salary (Float) : ");
			salary = scT.nextFloat();
			System.out.println("Enter teacher's address (String) : ");
			address = scT.next();
			System.out.println("Enter teacher's department (String) : ");
			department = scT.next();
			System.out.println("Enter teacher's subject (String) : ");
			subject = scT.next();
			Teacher t = new Teacher(tid,name,salary,address,department,subject);
			teacher[i] = t;
		}
		System.out.println("Teachers are :\n");
		for (Teacher x : teacher) {
			x.display();
			System.out.println("\n");
		}
		sc.close();
		scT.close();
	}
}
