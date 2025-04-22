package MODULE3;

class ElectricCar extends Car{
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