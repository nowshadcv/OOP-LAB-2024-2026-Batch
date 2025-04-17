package MODULE2;
class Vehicle {
    String registrationNumber;
    int speed, fuelCapacity;

    public Vehicle(String reg_no, int speed, int cap) {
        this.registrationNumber = reg_no;
        this.speed = speed;
        this.fuelCapacity = cap;
    }

    void displayInfo() {
        System.out.println("Registration number: " + registrationNumber);
        System.out.println("Max Speed: " + speed);
        System.out.println("Fuel Capacity: " + fuelCapacity);
    }
}
