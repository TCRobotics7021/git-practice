package frc.team7021.practice;

import java.time.Instant;
import java.util.Timer;
import java.util.TimerTask;

public class SpeedometerDemoRunner {
    public void runDemo() {
        Timer timer = new Timer();

        timer.schedule(new TimerTask() {
            private int mI = 0;
            private Speedometer mSpeedometer = new Speedometer();

            @Override
            public void run() {
                System.out.print("\r");
                long timestamp = Instant.now().toEpochMilli();
                double distance = Math.log(mI++);

                mSpeedometer.update(distance, timestamp);

                System.out.format("%.4f", mSpeedometer.getSpeed());
                System.out.print(" m/s");
            }
        }, 0, 10);

        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            timer.cancel();
            System.out.println();
            System.out.println("Done!");
        }
    }
}
