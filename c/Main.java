public class Main {
    public static void main(String[] args) {
        Hybrid hybridCar = new Hybrid(50, 50);
        hybridCar.drive();
        hybridCar.chargeBattery();
        hybridCar.refuel();
        hybridCar.drive();
        System.out.println("Battery Level: " + hybridCar.getBatteryLevel());
        System.out.println("Fuel Level: " + hybridCar.getFuelLevel());
        }
    }
