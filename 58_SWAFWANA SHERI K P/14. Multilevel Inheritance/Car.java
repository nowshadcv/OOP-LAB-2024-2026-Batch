package MODULE3;
class Car extends Vehicle{
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

