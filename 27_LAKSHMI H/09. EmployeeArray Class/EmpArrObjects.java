package MODULE1;
import java.util.Scanner;
class Employee {
	int eNo,eSalary;
	String eName;
	public Employee() {}//CONSTRUCTOR
	public Employee(int no,int sal,String name) {
		eNo=no;
		eSalary=sal;
		eName=name;
	}
	public void showData() {
		System.out.print("EmpId="+eNo+" "+"Name="+eName+" "+"Salary="+eSalary);
		System.out.println();
	}

}

public class EmpArrObjects {

	public static void main(String[] args) {
		System.out.println("Enter no of employees:");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println("Enter employee details one by one..");
		Employee employees[]=new Employee[n];//array object
		Scanner scemp=new Scanner(System.in);
		int eid,esal;
		String ename;
		for(int i=0;i<n;i++) {
			System.out.println("Enter "+ i +" employee details..");
			System.out.println("Enter employee id(integer):");
			eid=scemp.nextInt();
			scemp.nextLine();
			System.out.println("Enter employee name(String):");
			String name=scemp.nextLine();
			ename=new String(name);
			System.out.println("Enter employee salary(integer):");
			esal=scemp.nextInt();
			Employee emp=new Employee(eid,esal,ename);
			employees[i]=emp;
		}
		System.out.println("Employees are: \n");
		for(Employee y:employees)//for-each statement y-reference variable
			y.showData();
		System.out.println("Enter employee number to  search:");
		int semp=sc.nextInt();
		boolean found=false;
		for(Employee e:employees) {
			if(semp==e.eNo) {
				found=true;
				System.out.println("Employee found..");
				e.showData();
				break;
			}
		}
		if(!found)
			System.out.println("Employee not found..");
		// TODO Auto-generated method stub

	}

}
