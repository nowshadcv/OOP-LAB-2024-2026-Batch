package MODULE3;

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
    int batteryCapacity; // in kWh
    int chargeLevel;     // in percentage

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


