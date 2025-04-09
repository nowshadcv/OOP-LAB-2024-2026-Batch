package MODULE_3;

import java.util.Scanner;

class Vehicle {
    String registrationNumber;
    int speed;
    int fuelCapacity;

    Vehicle() {}

    Vehicle(String registrationNumber, int speed, int fuelCapacity) {
        this.registrationNumber = registrationNumber;
        this.speed = speed;
        this.fuelCapacity = fuelCapacity;
    }

    public void displayInfo() {
        System.out.println("Registration Number: " + registrationNumber);
        System.out.println("Speed: " + speed + " km/h");
        System.out.println("Fuel Capacity: " + fuelCapacity + " liters");
    }
}

class Car extends Vehicle {
    int numberOfDoors;
    boolean hasAirConditioning;

    Car() {}

    Car(String registrationNumber, int speed, int fuelCapacity, int numberOfDoors, boolean hasAirConditioning) {
        super(registrationNumber, speed, fuelCapacity);
        this.numberOfDoors = numberOfDoors;
        this.hasAirConditioning = hasAirConditioning;
    }

    public void displayCarInfo() {
        displayInfo();
        System.out.println("Number of Doors: " + numberOfDoors);
        System.out.println("Air Conditioning: " + (hasAirConditioning ? "Yes" : "No"));
    }
}

class ElectricCar extends Car {
    int batteryCapacity; 
    int chargeLevel;    

    ElectricCar(String registrationNumber, int speed, int fuelCapacity,
                int numberOfDoors, boolean hasAirConditioning,
                int batteryCapacity, int chargeLevel) {
        super(registrationNumber, speed, fuelCapacity, numberOfDoors, hasAirConditioning);
        this.batteryCapacity = batteryCapacity;
        this.chargeLevel = chargeLevel;
    }

    public void displayElectricCarInfo() {
        displayCarInfo();
        System.out.println("Battery Capacity: " + batteryCapacity + " kWh");
        System.out.println("Charge Level: " + chargeLevel + "%");
    }
}


public class vehicleArray {

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
