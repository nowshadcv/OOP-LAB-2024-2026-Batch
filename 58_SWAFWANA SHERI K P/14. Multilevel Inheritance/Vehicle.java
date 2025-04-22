package MODULE3;

public class Vehicle{
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


