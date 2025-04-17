package MODULE2;
import java.util.Scanner;
public class ElectricCar extends Car {
    int batteryCapacity, chargeLevel;

    public ElectricCar(String reg_no, int speed, int cap, int numberOfDoors, boolean hasAirConditioning, int battery, int charge) {
        super(reg_no, speed, cap, numberOfDoors, hasAirConditioning);
        this.batteryCapacity = battery;
        this.chargeLevel = charge;
    }

    @Override
    void displayInfo() {
        super.displayInfo();
        System.out.println("Battery capacity: " + batteryCapacity);
        System.out.println("Charge level: " + chargeLevel);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of ElectricCars you want to add: ");
        int n = sc.nextInt();
        sc.nextLine();  // Consume the remaining newline character after the number input

        ElectricCar[] electricCars = new ElectricCar[n];
        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for ElectricCar " + (i + 1));

            System.out.print("Enter registration number: ");
            String regNo = sc.nextLine();

            System.out.print("Enter speed: ");
            int speed = sc.nextInt();

            System.out.print("Enter fuel capacity: ");
            int fuelCapacity = sc.nextInt();

            System.out.print("Enter number of doors: ");
            int numberOfDoors = sc.nextInt();

            System.out.print("Does it have air conditioning? (true/false): ");
            boolean hasAirConditioning = sc.nextBoolean();

            System.out.print("Enter battery capacity: ");
            int batteryCapacity = sc.nextInt();

            System.out.print("Enter charge level: ");
            int chargeLevel = sc.nextInt();

            sc.nextLine(); // Clear the buffer

            electricCars[i] = new ElectricCar(regNo, speed, fuelCapacity, numberOfDoors, hasAirConditioning, batteryCapacity, chargeLevel);
        }

        System.out.println("\nDisplaying details of all ElectricCars:\n");
        for (ElectricCar ev : electricCars) {
            ev.displayInfo();
            System.out.println("--------");
        }
        sc.close();
    }
}
