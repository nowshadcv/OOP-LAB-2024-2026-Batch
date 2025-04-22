package MODULE3;


class Car extends Vehicle {
    int numberOfDoors;
    Boolean hasAirConditioning;

    public Car(String reg_no, int speed, int cap, int numberOfDoors, Boolean hasAirConditioning) {
        super(reg_no, speed, cap);
        this.numberOfDoors = numberOfDoors;
        this.hasAirConditioning = hasAirConditioning;
    }

    void displayInfo() {
        super.displayInfo();
        System.out.println("Number of doors: " + numberOfDoors);
        System.out.println("Has Air Conditioning: " + hasAirConditioning.toString());
    }
}