package module1;
import java.util.Scanner;

class Employee {
    int id, salary;
    String name;

    public Employee(int id, int salary, String name) {
        this.id = id;
        this.salary = salary;
        this.name = name;
    }

    public void showData() {
        System.out.println("EmpId = " + id + " Name = " + name + " Salary = " + salary);
    }
}

public class EmpArrObjects {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of Employees: ");
        int n = sc.nextInt();
        sc.nextLine(); // Consume newline

        Employee[] employees = new Employee[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for Employee " + (i + 1));

            System.out.print("ID: ");
            int id = sc.nextInt();
            sc.nextLine(); // Consume newline

            System.out.print("Name: ");
            String name = sc.nextLine();

            System.out.print("Salary: ");
            int salary = sc.nextInt();
            sc.nextLine(); // Consume newline

            employees[i] = new Employee(id, salary, name);
        }

    
        System.out.println("\nAll Employees:");
        for (int i = 0; i < employees.length; i++) {
            employees[i].showData();
        }


        System.out.print("\nEnter employee ID to search: ");
        int searchId = sc.nextInt();

        boolean found = false;
        for (Employee e : employees) {
            if (e.id == searchId) {
                System.out.println("Employee found:");
                e.showData();
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Employee not found.");
        }

        sc.close();
    }
}
