package frc.team7021.practice;

public class Speedometer {
    // TODO: You'll probably need to define some class properties here
    public double preDistance = 0;
    public double preTime = 0;
    public double speeed = 0;
    public double distanceE = 0;
    public double timeE = 0;
    /**
     * Update the current speed value
     *
     * @param distance The distance traveled in meters
     * @param timestamp The current timestamp in milliseconds
     */
    public void update(double distance, long timestamp) {
        this.distanceE = distance - preDistance;
        this.timeE = timestamp - preTime;
        this.speeed = distanceE/timeE;
        // TODO: Update the computed speed value
    }

    /**
     * Get the current speed value in meters/millisecond
     *
     * @return Current speed in meters/second
     */
    public double getSpeed() {
        // TODO: Return the computed speed
        ;
        return speeed;
        
    }


    // Don't change this code
    public static void main(String[] args) {
        SpeedometerDemoRunner demoRunner = new SpeedometerDemoRunner();
        demoRunner.runDemo();
    }
}
