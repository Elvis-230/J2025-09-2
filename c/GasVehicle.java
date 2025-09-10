package c;

public interface GasVehicle {
    void setGasCostPerGallon(double cost);
    double getGasCostPerGallon();
    double calculateMPG(double miles, double gallonsUsed);
}

