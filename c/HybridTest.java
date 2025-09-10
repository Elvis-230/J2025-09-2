package c;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class HybridTest {
    private HybridVehicle hybrid;

    @Before
    public void setUp() {
        hybrid = new HybridVehicle();
        hybrid.setGasCostPerGallon(3.50);
        hybrid.setElectricCostPerKWh(0.24);
    }

    @Test
    public void testCalculateMPG() {
        assertEquals(30.0, hybrid.calculateMPG(300, 10), 0.0001);
    }

    @Test
    public void testCalculateMPGe() {
        assertEquals(144.43, hybrid.calculateMPGe(300, 70), 0.01);
    }

    @Test
    public void testCalculateHybridAverage() {
        double mpg = 30.0;
        double mpge = 144.43;
        assertEquals(87.215, hybrid.calculateHybridAverage(mpg, mpge), 0.001);
    }
}
