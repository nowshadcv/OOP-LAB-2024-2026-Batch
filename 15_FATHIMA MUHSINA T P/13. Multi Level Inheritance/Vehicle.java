package MODULE3;

public class Vehicle 
{

	String registrationNumber;
    int speed;
    int fuelCapacity;

    public Vehicle(String registrationNumber, int speed, int fuelCapacity) 
    {
        this.registrationNumber = registrationNumber;
        this.speed = speed;
        this.fuelCapacity = fuelCapacity;
    }

    public void displayInfo() 
    {
        System.out.println("Vehicle Registration Number: " + registrationNumber);
        System.out.println("Speed: " + speed + " km/h");
        System.out.println("Fuel Capacity: " + fuelCapacity + " liters");
    }

}
