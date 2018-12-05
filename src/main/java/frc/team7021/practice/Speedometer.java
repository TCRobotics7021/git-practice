package frc.team7021.practice;

public class Speedometer {
    // TODO: You'll probably need to define some class properties here
    public double previousDistance = 0;
    
    public double previousTime = 0;
    
    public double speeed = 0;

    /**
     * Update the current speed value
     *
     * @param distance The distance traveled in meters
     * @param timestamp The current timestamp in milliseconds
     */
    public void update(double distance, long timestamp) {
        this.speeed = (distance-this.previousDistance) / (timestamp-this.previousTime);
        this.previousTime = timestamp;
        this.previousDistance = distance;

       
    }

    /**
     * Get the current speed value in meters/millisecond
     *
     * @return Current speed in meters/second
     */
    public double getSpeed() {
        // TODO: Return the computed speed
        return speeed;
    }


    // Don't change this code
    public static void main(String[] args) {
        SpeedometerDemoRunner demoRunner = new SpeedometerDemoRunner();
        demoRunner.runDemo();
    }
}
