package MODULE1;
import java.util.Scanner;
public class Employee {
	int eNo,eSalary;
	String eName;
	public Employee() {}
	public Employee(int no,int sal,String name) {	
		eNo=no;
		eSalary=sal;
		eName=name;
		
		
	}

	public void showData() {
		System.out.print("EmpId="+eNo+" "+"Name= "+eName+" "+"salary= "+eSalary);
		System.out.println();
		
	}


	public static void main(String[] args) {
		System.out.println("enter number of Employee:");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println("enter Employee details one by on...");
		Employee employees[]=new Employee[n];
		Scanner scemp=new Scanner(System.in);
		int eid,esal;
		String enam;
		for(int i=0;i<n;i++) {
			System.out.println("enter"+i+"employee details..");
			System.out.println("enter employee id(integer):");
			eid=scemp.nextInt();
			scemp.nextLine();
			System.out.println("enter employee name(string):");
			String nam=scemp.nextLine();
			enam=new String(nam);
			System.out.println("enter employee salary(integer):");
			esal=scemp.nextInt();
			Employee emp=new Employee(eid,esal,enam);
			employees[i]=emp;}
		System.out.println("Employees are :\n");
		for(Employee y : employees)
			y.showData();
		System.out.println("enter employee number to search :");
		int semp=sc.nextInt();
		boolean found=false;
		for(Employee e:employees) {
			if(semp==e.eNo) {
				found=true;
				System.out.println("Employeee found");
				e.showData();
				break;}}
		if(!found)
			System.out.println("employee not found...");
		
		
	}

}
