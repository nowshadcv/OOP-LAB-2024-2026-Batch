package MODULE2;
import java.util.Scanner;

class EmployeeT {
    int empid;
    String name;
    float salary;
    String address;

    
    EmployeeT() {}

  
    EmployeeT(int empid, String name, float salary, String address) {
        this.empid = empid;
        this.name = name;
        this.salary = salary;
        this.address = address;
    }
}

class Teacher extends EmployeeT {
    String department, subject;

    
    Teacher(int empid, String name, float salary, String address, String department, String subject) {
        super(empid, name, salary, address);
        this.department = department;
        this.subject = subject;
    }

   
    public void display() {
        System.out.println("Teacher ID: " + empid);
        System.out.println("Teacher Name: " + name);
        System.out.println("Teacher Salary: " + salary);
        System.out.println("Teacher Address: " + address);
        System.out.println("Teacher Department: " + department);
        System.out.println("Teacher Subject: " + subject);
    }
}

public class TeacherArr {
    public static void main(String[] args) {
        // Scanner to take input from the user
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the number of Teachers: ");
        int n = sc.nextInt();
        
        
        Teacher[] teacher = new Teacher[n];

        
        Scanner scT = new Scanner(System.in);
        int tid;
        String name;
        float salary;
        String address;
        String department;
        String subject;

        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for Teacher " + (i + 1) + ":");
            System.out.print("Enter Teacher ID (integer): ");
            tid = scT.nextInt();
            System.out.print("Enter Teacher Name (String): ");
            name = scT.next();
            System.out.print("Enter Teacher Salary (float): ");
            salary = scT.nextFloat();
            System.out.print("Enter Teacher Address (String): ");
            address = scT.next();
            System.out.print("Enter Teacher Department (String): ");
            department = scT.next();
            System.out.print("Enter Teacher Subject (String): ");
            subject = scT.next();

            
            Teacher t = new Teacher(tid, name, salary, address, department, subject);
            teacher[i] = t;
        }

        
        System.out.println("\nTeachers are:");
        for (Teacher x : teacher) {
            x.display();
            System.out.println(); 
        }
    }
}
