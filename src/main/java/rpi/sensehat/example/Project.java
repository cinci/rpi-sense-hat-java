package rpi.sensehat.example;

import rpi.sensehat.api.SenseHat;

/**
 * Created by jcincera on 03/07/2017.
 */
public class Project {

    public static void main(String[] args) {
        System.out.println(">>> Create project here <<<");

        SenseHat senseHat = new SenseHat();

        float humidity = senseHat.environmentalSensor.getHumidity();
        System.out.println("Current humidity: " + humidity);

        senseHat.ledMatrix.showMessage("my project");
        senseHat.ledMatrix.waitFor(5);
        senseHat.ledMatrix.clear();
    }
}
