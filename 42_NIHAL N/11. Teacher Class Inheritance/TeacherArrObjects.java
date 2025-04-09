package MODULE3;

import java.util.Scanner;

public class TeacherArrObjects {
	public static void main(String[] args) {
		System.out.println("Enter number of teachers: ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Teacher teacher[] = new Teacher[n];
		Scanner scT = new Scanner(System.in);
		int tid;
		float salary;
		String name,address,department,subject;
		for(int i = 0; i < n; i++) {
			System.out.println("Enter teacher-"+(i+1)+"'s details");
			System.out.println("Enter Teacher id (integer): ");
			tid = scT.nextInt();
			scT.nextLine();
			System.out.println("Enter Name: ");
			name = scT.nextLine();
			System.out.println("Enter address: ");
			address = scT.nextLine();
			System.out.println("Enter salary (float): ");
			salary = scT.nextFloat();
			scT.nextLine();
			System.out.println("Enter department: ");
			department = scT.nextLine();
			System.out.println("Enter subject: ");
			subject = scT.nextLine();
			Teacher t = new Teacher(tid, name, address, salary, department, subject);
			teacher[i] = t;
		}
		System.out.println("\n------------------------------------\n");
		System.out.println("Teachers are: ");
		for(Teacher x: teacher) {
			x.display();
			System.out.println("\n");
		}
		System.out.println("------------------------------------\n");
		sc.close();
		scT.close();
	}

}
