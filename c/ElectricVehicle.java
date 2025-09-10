package c;

public interface ElectricVehicle {
    void setElectricCostPerKWh(double cost);
    double getElectricCostPerKWh();
    double calculateMPGe(double miles, double kWhUsed);
}


