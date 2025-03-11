package MODULE2;
import java.util.Scanner;

public class EmpObject {
	int eNo, eSalary;
	String eName ;
	public EmpObject () {}
	public EmpObject (int no, int sal,String name) {
		eNo =no;
		eSalary =sal;
		eName =name ;}
	public void showData () {
		System.out.print("EmpId =" + eNo + " " + "Name = "+ eName + " " + "Salary = " + eSalary );
		System.out.println ( ) ; 
	}
	
	public static void main(String[] args) {
		System.out.println("Enter number of employees : ");
		Scanner sc=new Scanner(System.in);
		int n =sc.nextInt();
		System.out.println("Enter Employee details one by one .. ");
		EmpObject employees [ ]=new EmpObject [n];
		Scanner scemp=new Scanner (System.in);
		int eid , esal;

		for(int i=0;i<n;i++) {
			System.out.println("Enter "+ i + " employee details..");
			System.out.println("Enter employee id ( integer ): ");
			eid=scemp.nextInt();
			System.out.println("Enter employee name ( String ): ");
			String nam=scemp.next();
			
			System.out.println("Enter employee salary (integer): ");
			esal=scemp.nextInt();
			EmpObject emp=new EmpObject(eid,esal,nam);
			employees[i]=emp;
		}
		
		System.out.println("Employee are : \n ");
		for(EmpObject y: employees)
			y.showData();
		System.out.println("Enter employee number to search : ");
		int semp=sc.nextInt();
		boolean found=false;
		for ( EmpObject  e:employees) {
			if(semp==e.eNo) {
				found=true;
				System.out.println(" Employee found . ");
				e.showData();
				break;
			}
		}
		
		if(!found)
			System.out.println("Employee not found... ");

	}

}
