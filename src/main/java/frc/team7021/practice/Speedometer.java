package frc.team7021.practice;

public class Speedometer {
    // TODO: You'll probably need to define some class properties here
    public double previousDistance = 0;
    public double currentDistance = 0;
    public double previousTime = 0;
    public double currentTime = 0;
    public double speeed = 0;

    /**
     * Update the current speed value
     *
     * @param distance The distance traveled in meters
     * @param timestamp The current timestamp in milliseconds
     */



    double calcSpeed;
    double distance = 20;
    double timestamp = 10;
    public void update(double distance, long timestamp) {
        // TODO: Update the computed speed value
        speeed = currentDistance / currentTime;
        
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
