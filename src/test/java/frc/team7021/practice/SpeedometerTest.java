package frc.team7021.practice;

import org.junit.Assert;
import org.junit.Test;

public class SpeedometerTest {
    @Test
    public void testSpeedometer() {
        Speedometer speedometer = new Speedometer();
        speedometer.update(0, 0);
        speedometer.update(1, 1000);
        Assert.assertEquals(1.0, speedometer.getSpeed(), 0.001);

        speedometer.update(0, 0);
        speedometer.update(2, 2000);
        Assert.assertEquals(1.0, speedometer.getSpeed(), 0.001);
    }
}
