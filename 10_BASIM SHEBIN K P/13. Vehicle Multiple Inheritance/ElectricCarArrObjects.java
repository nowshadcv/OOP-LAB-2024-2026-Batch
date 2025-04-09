package MODULE3;

import java.util.Scanner;

class Vehicle {
    String regno;
    int speed;
    float fuelcap;

    Vehicle() {}

    Vehicle(String regno, int speed, float fuelcap) {
        this.regno = regno;
        this.speed = speed;
        this.fuelcap = fuelcap;
    }

    public void displayInfo() {
        System.out.println("Registration Number: " + regno);
        System.out.println("Speed: " + speed + " km/h");
        System.out.println("Fuel Capacity: " + fuelcap + " liters");
    }
}

class Car extends Vehicle {
    int numOfDoors;
    boolean hasAC;

    Car() {}

    Car(String regno, int speed, float fuelcap, int numOfDoors, boolean hasAC) {
        super(regno, speed, fuelcap);
        this.numOfDoors = numOfDoors;
        this.hasAC = hasAC;
    }

    public void displayCarInfo() {
        displayInfo();  
        System.out.println("Number of Doors: " + numOfDoors);
        System.out.println("Has AC: " + (hasAC ? "Yes" : "No"));
    }
}

class ElectricCar extends Car {
    float batteryCapacity; 
    float chargeLevel;    

    ElectricCar(String regno, int speed, float fuelcap, int numOfDoors, boolean hasAC,float batteryCapacity, float chargeLevel){
        super(regno, speed, fuelcap, numOfDoors, hasAC);
        this.batteryCapacity = batteryCapacity;
        this.chargeLevel = chargeLevel;
    }

    public void displayElectricCarInfo() {
        displayCarInfo();  
        System.out.println("Battery Capacity: " + batteryCapacity + " kWh");
        System.out.println("Charge Level: " + chargeLevel + "%");
    }
}

public class ElectricCarArrObjects {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of electric cars: ");
        int n = sc.nextInt();

        ElectricCar[] cars = new ElectricCar[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for Electric Car " + (i + 1));

            System.out.print("Enter Registration Number: ");
            String regno = sc.next();

            System.out.print("Enter Speed (in km/h): ");
            int speed = sc.nextInt();

            System.out.print("Enter Fuel Capacity (in liters): ");
            float fuelcap = sc.nextFloat();

            System.out.print("Enter Number of Doors: ");
            int doors = sc.nextInt();

            System.out.print("Has AC (true/false): ");
            boolean hasAC = sc.nextBoolean();

            System.out.print("Enter Battery Capacity (in kWh): ");
            float batteryCap = sc.nextFloat();

            System.out.print("Enter Charge Level (in %): ");
            float charge = sc.nextFloat();

            cars[i] = new ElectricCar(regno, speed, fuelcap, doors, hasAC, batteryCap, charge);
        }

        System.out.println("\nElectric Car Details:\n");
        for (ElectricCar car : cars) {
            car.displayElectricCarInfo();
            System.out.println("\n");
        }
    }
}
