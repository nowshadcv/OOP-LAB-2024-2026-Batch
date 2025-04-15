package MODULE3;
import java.util.Scanner;

public class TeacherArrObjects1 {

    public static void main(String[] args) {
        System.out.println("Enter number of teachers:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();  // number of teachers
        sc.nextLine(); // consume the newline left by nextInt()

        System.out.println("Enter teacher details one by one..");

        Teachers teacher[] = new Teachers[n];
        Scanner sct = new Scanner(System.in);
        String empid, name, company_name, qualification, gender, tid, address, department, subject;
        int age;
        float salary;

        for (int i = 0; i < n; i++) {
            System.out.println("Enter details of teacher " + (i + 1));

            System.out.println("Enter teacher id:");
            tid = sct.nextLine();  // using nextLine() to capture the full input

            System.out.println("Enter employee id of teacher " + (i + 1) + ":");
            empid = sct.nextLine();

            System.out.println("Enter teacher name:");
            name = sct.nextLine();

            System.out.println("Enter teacher gender:");
            gender = sct.nextLine();

            System.out.println("Enter teacher address:");
            address = sct.nextLine();

            System.out.println("Enter teacher age:");
            age = sct.nextInt();

            System.out.println("Enter teacher company:");
            sct.nextLine();  // consume the newline left by nextInt()
            company_name = sct.nextLine();

            System.out.println("Enter teacher department:");
            department = sct.nextLine();

            System.out.println("Enter teacher qualification:");
            qualification = sct.nextLine();

            System.out.println("Enter teacher subject:");
            subject = sct.nextLine();

            System.out.println("Enter teacher salary:");
            salary = sct.nextFloat();
            sct.nextLine();  // consume the newline left by nextFloat()

            // Create a Teacher object and assign it to the array
            teacher[i] = new Teachers(name, gender, address, age, empid, company_name, qualification, salary, subject, department, tid);
        }

        System.out.println("Teachers are:\n");
        for (Teachers x : teacher) {
            x.display();
            System.out.println("\n");
        }
    }
}
