package c;

public class CarRunner {
    public static void main(String[] args) {
    HybridVehicle car1 = new HybridVehicle();
    car1.setGasCostPerGallon(3.50);
    car1.setElectricCostPerKWh(0.24);

    // Example 1: MPG and MPGe for car1
    double milesGas1 = 300;
    double gallonsUsed1 = 10;
    double mpg1 = car1.calculateMPG(milesGas1, gallonsUsed1);
    double milesElectric1 = 300;
    double kWhUsed1 = 70;
    double mpge1 = car1.calculateMPGe(milesElectric1, kWhUsed1);
    double avg1 = car1.calculateHybridAverage(mpg1, mpge1);
    System.out.printf("  MPG (gas mode): %.2f\n", mpg1);
    System.out.printf("  MPGe (electric mode): %.2f\n", mpge1);
    System.out.printf("  Average MPG (hybrid mode): %.2f\n", avg1);

    System.out.println(); 

    HybridVehicle car2 = new HybridVehicle();
    car2.setGasCostPerGallon(3.50);
    car2.setElectricCostPerKWh(0.24);

    // Example 2: Different values for car2
    double milesGas2 = 200;
    double gallonsUsed2 = 8;
    double mpg2 = car2.calculateMPG(milesGas2, gallonsUsed2);
    double milesElectric2 = 250;
    double kWhUsed2 = 60;
    double mpge2 = car2.calculateMPGe(milesElectric2, kWhUsed2);
    double avg2 = car2.calculateHybridAverage(mpg2, mpge2);
    System.out.printf("  MPG (gas mode): %.2f\n", mpg2);
    System.out.printf("  MPGe (electric mode): %.2f\n", mpge2);
    System.out.printf("  Average MPG (hybrid mode): %.2f\n", avg2);
    }
}
