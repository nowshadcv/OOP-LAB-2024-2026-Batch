package MODULE2;
class Car extends Vehicle {
    int numberOfDoors;
    boolean hasAirConditioning; // Using primitive boolean

    public Car(String reg_no, int speed, int cap, int numberOfDoors, boolean hasAirConditioning) {
        super(reg_no, speed, cap);
        this.numberOfDoors = numberOfDoors;
        this.hasAirConditioning = hasAirConditioning;
    }

    @Override
    void displayInfo() {
        super.displayInfo();
        System.out.println("Number of doors: " + numberOfDoors);
        System.out.println("Has Air Conditioning: " + hasAirConditioning);
    }
}
