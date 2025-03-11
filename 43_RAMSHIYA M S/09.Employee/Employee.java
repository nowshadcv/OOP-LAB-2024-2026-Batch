package MODULE1;

import java.util.Scanner;
class Employee {
	int eNo,eSalary;
	String eName;
	public Employee() {}
	public Employee(int no,int sal,String name) {
		eNo=no;
		eSalary=sal;
		eName=name;}
	public void showData() {
		System.out.print("Empid="+" "+eNo+" "+"name"+" "+eName+" "+"salary="+eSalary);
		System.out.println();}}
public class EmpArrObjects{
	
	public static void main(String[] args) {
				// TODO Auto-generated method stub
				System.out.println("enter the number of employee:");
				Scanner sc=new Scanner(System.in);
				int n=sc.nextInt();
				System.out.println("enter employee details one by one..");
				Employee employees[]=new Employee[n];
				Scanner scemp=new Scanner(System.in);
				int eid,esal;
				String enam;
				for(int i=0;i<n;i++) {
					System.out.println("enter "+i+"employee details..");
					System.out.println("enter employee id(integer):");
					eid=scemp.nextInt();
					System.out.println("enter employee name(string):");
					String nam=scemp.next();
					enam=new String(nam);
					System.out.println("enter employee salary(integer):");
					esal=scemp.nextInt();
					Employee emp=new Employee(eid,esal,enam);
					employees[i]= emp ;}
				System.out.println("Employee are:\n");
				int semp=sc.nextInt();
				boolean found=false;
				for(Employee e : employees) {
					if( semp== e.eNo) {
						found=true;
						System.out.println("employee found");
						e.showData();
						break;}}
					if(!found)
						System.out.println("employee not found..");
					}}
