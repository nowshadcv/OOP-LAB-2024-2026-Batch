package MODULE3;

class ElectricCar extends Car {
    int batteryCapacity, chargeLevel;

    public ElectricCar(String reg_no, int speed, int cap, int numberOfDoors, Boolean hasAirConditioning, int battery, int charge) {
        super(reg_no, speed, cap, numberOfDoors, hasAirConditioning);
        this.batteryCapacity = battery;
        this.chargeLevel = charge;
    }

    @Override
    void displayInfo() {
        super.displayInfo();
        System.out.println("Battery capacity: " + this.batteryCapacity);
        System.out.println("Charge level: " + this.chargeLevel);
    }
}