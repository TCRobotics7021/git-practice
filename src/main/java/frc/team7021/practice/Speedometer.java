package frc.team7021.practice;

public class Speedometer {
    private long mLastTimestamp = 0;
    private double mLastDistance = 0;
    private double mSpeed = 0;

    /**
     * Update the current speed value
     *
     * @param distance The distance traveled in meters
     * @param timestamp The current timestamp in milliseconds
     */
    public void update(double distance, long timestamp) {
        // Calculate the speed as the change in the distance since
        // the last update divided by the change in the timestamp
        // since the last update.
        // Note: It's multiplied by 1000 because the timestamp is
        // in milliseconds but we want seconds.
        mSpeed = (distance - mLastDistance) / (timestamp - mLastTimestamp) * 1000;

        // Store the current distance/timestamp to be used in the next update
        mLastDistance = distance;
        mLastTimestamp = timestamp;
    }

    /**
     * Get the current speed value in meters/millisecond
     *
     * @return Current speed in meters/second
     */
    public double getSpeed() {
        return mSpeed;
    }


    // Don't change this code
    public static void main(String[] args) {
        SpeedometerDemoRunner demoRunner = new SpeedometerDemoRunner();
        demoRunner.runDemo();
    }
}
