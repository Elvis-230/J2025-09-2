package c;

public class CarRunner {
    public static void main(String[] args) {
        HybridVehicle car = new HybridVehicle();
        car.setGasCostPerGallon(3.50);
        car.setElectricCostPerKWh(0.24);

        // Example 1: MPG in fully gas mode
        double milesGas = 300;
        double gallonsUsed = 10;
        double mpg = car.calculateMPG(milesGas, gallonsUsed);
        System.out.printf("MPG (gas mode): %.2f\n", mpg);

        // Example 2: MPGe in fully electric mode
        double milesElectric = 300;
        double kWhUsed = 70;
        double mpge = car.calculateMPGe(milesElectric, kWhUsed);
        System.out.printf("MPGe (electric mode): %.2f\n", mpge);

        // Example 3: Average MPG in hybrid mode
        double avg = car.calculateHybridAverage(mpg, mpge);
        System.out.printf("Average MPG (hybrid mode): %.2f\n", avg);
    }
}
