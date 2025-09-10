package c;

public class HybridVehicle implements GasVehicle, ElectricVehicle {
    private double gasCostPerGallon;
    private double electricCostPerKWh;

    public void setGasCostPerGallon(double cost) {
        this.gasCostPerGallon = cost;
    }

    public double getGasCostPerGallon() {
        return gasCostPerGallon;
    }

    public void setElectricCostPerKWh(double cost) {
        this.electricCostPerKWh = cost;
    }

    public double getElectricCostPerKWh() {
        return electricCostPerKWh;
    }

    public double calculateMPG(double miles, double gallonsUsed) {
        if (gallonsUsed == 0) return 0;
        return miles / gallonsUsed;
    }

    public double calculateMPGe(double miles, double kWhUsed) {
        if (kWhUsed == 0) return 0;
        return (miles / kWhUsed) * 33.7;
    }

    public double calculateHybridAverage(double mpg, double mpge) {
        return (mpg + mpge) / 2.0;
    }
}
