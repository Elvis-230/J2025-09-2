package c;

public class Hybrid implements ElectricVehicle, GasVehicle {
    private int batteryLevel;
    private int fuelLevel;
    private int milesTraveled;

    public Hybrid(int batteryLevel, int fuelLevel) {
        this.batteryLevel = batteryLevel;
        this.fuelLevel = fuelLevel;
        this.milesTraveled = 0; // Initialize milesTraveled to 0
    }

    public void setMilesTravled(int miles) {
        this.milesTraveled = miles;
    }

    public int getMilesPerGallon() {
        return gallonsUsed() == 0 ? 0 : milesTraveled / gallonsUsed();
    }

    // Stub for gallonsUsed
    public int gallonsUsed() {
        return 1; // Stub value for compilation
    }
    
    @Override
    public void chargeBattery() {
        batteryLevel = 100;
        System.out.println("Battery fully charged.");
    }

    @Override
    public int getBatteryLevel() {
        return batteryLevel;
    }

    @Override
    public void refuel() {
        fuelLevel = 100;
        System.out.println("Fuel tank full.");
    }

    @Override
    public int getFuelLevel() {
        return fuelLevel;
    }

    public void drive() {
        if (batteryLevel > 0) {
            batteryLevel -= 10;
            System.out.println("Driving on electric power. Battery: " + batteryLevel + "%");
        } else if (fuelLevel > 0) {
            fuelLevel -= 10;
            System.out.println("Driving on gas power. Fuel: " + fuelLevel + "%");
        } else {
            System.out.println("No power left to drive.");
        }
    }
}
