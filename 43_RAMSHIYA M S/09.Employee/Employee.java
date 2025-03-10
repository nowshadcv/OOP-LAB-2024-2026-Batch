package MODULE1;

public class Employee {
	int eNo,eSalary;
	String eName;
	public Employee() {}
	public Employee(int no,int sal,String name) {
		eNo=no;
		eSalary=sal;
		eName=name;}
	public void showData() {
		System.out.print("Empid="+eNo+" "+"name"+eName+" "+"salary="+eSalary);
		System.out.println();}}
	
