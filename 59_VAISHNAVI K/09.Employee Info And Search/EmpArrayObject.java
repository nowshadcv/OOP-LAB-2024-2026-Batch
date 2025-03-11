package MODULE2;
import java.util.Scanner;

public class Emparrobject {
	public static void main(String [] args) {
		System.out.println("enter number of employeee:");
		Scanner sc =new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println("enter employee details one bye one...");
		Employee employee []=new Employee [n];
		Scanner scemp=new Scanner(System.in);
				int eid,esal;
				String enam;
				for(int i=0;i<n;i++) {
					System.out.println("enter "+i+"employee details..");
					System.out.println("enter employee id(integer):");
					eid=scemp.nextInt();
					System.out.println("enter employee name(String):");
					String nam=scemp.next();
					enam=new String(nam);
					System.out.println("enter employee salary(integer):");
					esal=scemp.nextInt();
					Employee emp=new Employee(eid,esal,enam);
					employee[i]=emp;
				
				}
				System.out.println("enter employee number to search:");
				int semp=sc.nextInt();
				boolean found=false;
				for(Employee e:employee) {
					if(semp==e.eNo) {
						found=true;
						System.out.println("employee found.");
						e.showData();
						break;
					}}
				if(!found)
					System.out.println("employee not found");
					
		
		
	}


}
