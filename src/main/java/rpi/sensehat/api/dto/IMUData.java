package rpi.sensehat.api.dto;

/**
 * Created by jcincera on 28/06/2017.
 */
public class IMUData {

    private float pitch;
    private float roll;
    private float yaw;

    public IMUData(float pitch, float roll, float yaw) {
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
