package rpi.sensehat.api;

/**
 * Created by jcincera on 04/07/2017.
 */
public class SenseHat {
    public final EnvironmentalSensor environmentalSensor;
    public final IMU IMU;
    public final LEDMatrix ledMatrix;
    public final Joystick joystick;

    public SenseHat() {
        this.environmentalSensor = new EnvironmentalSensor();
        this.IMU = new IMU();
        this.ledMatrix = new LEDMatrix();
        this.joystick = new Joystick();
    }
}
