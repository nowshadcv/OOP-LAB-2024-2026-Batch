package MODULE3;
import java.util.Scanner;

public class VehicleArr {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of electric cars: ");
        int n = sc.nextInt();

        ElectricCar[] cars = new ElectricCar[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for Electric Car " + (i + 1) + ":");

            System.out.print("Registration Number: ");
            String regNum = sc.next();

            System.out.print("Speed (km/h): ");
            int speed = sc.nextInt();

            System.out.print("Fuel Capacity (liters): ");
            int fuelCap = sc.nextInt();

            System.out.print("Number of Doors: ");
            int doors = sc.nextInt();

            System.out.print("Has Air Conditioning? (true/false): ");
            boolean ac = sc.nextBoolean();

            System.out.print("Battery Capacity (kWh): ");
            int batteryCap = sc.nextInt();

            System.out.print("Charge Level (%): ");
            int charge = sc.nextInt();

            cars[i] = new ElectricCar(regNum, speed, fuelCap, doors, ac, batteryCap, charge);
        }

        System.out.println("\nElectric Cars Details:\n");
        for (ElectricCar car : cars) {
            car.displayElectricCarInfo();
        }

    }
}