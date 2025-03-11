package MODULE1;
import java.util.Scanner;

public class EmpArrObjects {
	

	public static void main(String[] args) {
		System.out.println("Enter number of Employees");
		Scanner sc= new Scanner (System.in);
		int n =sc.nextInt();
		System.out.println("Enter Employee details one by one ...");
		Employee employees [ ]= new Employee [ n ];
		Scanner scemp=new Scanner (System.in);
		int eid,esal;
		String enam;
		for (int i=0; i<n; i++) {
			System.out.println("Enter "+ i +"employee details..");
			System.out.println("Enter employee id (integer): ");
			eid = scemp.nextInt();
			scemp.nextLine();
			System.out.println("Enter employee name (String): ");
			String nam =scemp.nextLine();
			enam = new String (nam);
			System.out.println("Enter employee salary (integer): ");
			esal =scemp.nextInt();
			Employee emp = new Employee (eid,esal,enam);
			employees [ i ]=emp ;}
		System.out.println("Enter employee number to Search :");
		int semp =sc.nextInt();
		boolean found =false;
		for(Employee e: employees) {
			if( semp == e.eNo) {
				found=true;
				System.out.println("Employee found . ");
				e.ShowData();		
				break;}}
		if (! found)
			System.out.println(" Employee not found.. ");}}



class Employee {
	int eNo,eSalary;
	String eName;
	public Employee () {}
	public Employee ( int no, int sal,String name) {
		eNo =no;
		eSalary =sal;
		eName=name; }
	public void ShowData  ( ) {
		System.out.println("EmpId=  "+ eNo + "  " +"Name"+ eName + "  "+"salary =" + eSalary);
		System.out.println () ; 
	}
}

			
		

	
