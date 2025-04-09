package MODULE2;
import java.util.Scanner;
public class EmployeeT {
	int empid;
	String name;
	float salary;
	String address;
	EmployeeT() {}
	EmployeeT(int empid, String name, float salary, String address){
		this.empid = empid;
		this.name = name;
		this.salary = salary;
		this.address = address;
	}
}