package MODULE3;

public class Teachers extends Employee {
	String subject, department, teacherid;

    Teachers() {}

    Teachers(String name, String gender, String address, int age, String empid, String company_name, String qualification, float salary, String subject, String department, String teacherid) {
        super(name, gender, address, age, empid, company_name, qualification, salary);
        this.subject = subject;
        this.department = department;
        this.teacherid = teacherid;
    }

    public void display() {
        System.out.println("Teacher id: " + empid);
        System.out.println("Teacher name: " + name);
        System.out.println("Teacher gender: " + gender);
        System.out.println("Teacher address: " + address);
        System.out.println("Teacher age: " + age);
        System.out.println("Teacher company name: " + company_name);
        System.out.println("Teacher qualification: " + qualification);
        System.out.println("Teacher salary: " + salary);
        System.out.println("Teacher teacher id: " + teacherid);
        System.out.println("Teacher subject: " + subject);
        System.out.println("Teacher department: " + department);
    }

}
