package rpi.sensehat.api.dto;

/**
 * Created by jcincera on 03/07/2017.
 */
public class IMUDataRaw {

    private float x;
    private float y;
    private float z;

    public IMUDataRaw(float x, float y, float z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }

    public float getZ() {
        return z;
    }
}
