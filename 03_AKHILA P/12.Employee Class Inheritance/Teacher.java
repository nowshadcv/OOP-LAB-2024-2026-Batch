package MODULE2;

class Teacher extends Employeet{
	String department,subject;
	Teacher(int empid,String name,float salary,String address, String subject){
		super(empid,name,salary,address);
		this.department = department;
		this.subject = subject;}
	
	
	public void display() {
		System.out.println("teacherid:"+empid);
		System.out.println("teacher name:"+ name);
		System.out.println("teacher salary:"+ salary);
		System.out.println("teacher adress:"+ address);
		System.out.println("teacher department"+department);
		System.out.println("teacher subject"+subject);
		
}}
