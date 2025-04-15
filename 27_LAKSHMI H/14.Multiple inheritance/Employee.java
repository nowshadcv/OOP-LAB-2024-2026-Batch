package MODULE3;
class Employee extends Person {
	    String empid, company_name, qualification;
	    float salary;

	    Employee() {}

	    Employee(String name, String gender, String address, int age, String empid, String company_name, String qualification, float salary) {
	        super(name, gender, address, age);
	        this.empid = empid;
	        this.company_name = company_name;
	        this.qualification = qualification;
	        this.salary = salary;
	    }
	}

