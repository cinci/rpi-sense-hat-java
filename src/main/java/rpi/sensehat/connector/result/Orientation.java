package rpi.sensehat.connector.result;

/**
 * Created by jcincera on 28/06/2017.
 */
public class Orientation {

    private float pitch;
    private float roll;
    private float yaw;

    public Orientation(float pitch, float roll, float yaw) {
        this.pitch = pitch;
        this.roll = roll;
        this.yaw = yaw;
    }

    public float getPitch() {
        return pitch;
    }

    public float getRoll() {
        return roll;
    }

    public float getYaw() {
        return yaw;
    }
}
