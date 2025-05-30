
package module_2;

import java.util.Scanner;

public class Employee {
    
    int eno, esalary;
    String ename;
    
    public Employee() {
    }
    
    public Employee(int no, int sal, String name) {
        eno = no;
        esalary = sal;
        ename = name;
    }
    
    public void showData() {
        System.out.println("empid : " + eno + " name : " + ename + " salary : " + esalary);
        System.out.println();
    }

    public static void main(String[] args) {  
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of employees: ");
        int n = sc.nextInt();
        sc.nextLine();

        Employee employees[] = new Employee[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter details for employee " + (i + 1) + ":");

            System.out.print("Enter employee ID: ");
            int eid = sc.nextInt();
            sc.nextLine();

            System.out.print("Enter employee name: ");
            String ename = sc.nextLine();

            System.out.print("Enter employee salary: ");
            int esal = sc.nextInt();
            sc.nextLine();

            employees[i] = new Employee(eid, esal, ename);
        }

        System.out.println("\nEmployees List:");
        for (Employee emp : employees) {
            emp.showData();
        }

        System.out.print("Enter employee number to search: ");
        int semp = sc.nextInt();

        boolean found = false;
        for (Employee emp : employees) {
            if (semp == emp.eno) {
                found = true;
                System.out.println("Employee found:");
                emp.showData();
                break;
            }
        }

        if (!found) {
            System.out.println("Employee not found.");
        }
    }
}
