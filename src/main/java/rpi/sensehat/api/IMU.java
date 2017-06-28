package rpi.sensehat.api;

import rpi.sensehat.connector.Command;
import rpi.sensehat.connector.result.Orientation;
import rpi.sensehat.utils.LanguageUtils;

/**
 * Created by jcincera on 20/06/2017.
 */
public class IMU extends SensorBase {

    /**
     * Enables and disables the gyroscope, accelerometer and/or magnetometer contribution to the get orientation functions
     *
     * @param compassEnabled       enable compass
     * @param gyroscopeEnabled     enable gyroscope
     * @param accelerometerEnabled enable accelerometer
     */
    public void setIMUConfig(boolean compassEnabled, boolean gyroscopeEnabled, boolean accelerometerEnabled) {
        execute(Command.SET_IMU_CONFIG,
                LanguageUtils.toBoolean(compassEnabled),
                LanguageUtils.toBoolean(gyroscopeEnabled),
                LanguageUtils.toBoolean(accelerometerEnabled)).checkEmpty();
    }

    /**
     * Gets the current orientation in radians using the aircraft principal axes of pitch, roll and yaw
     *
     * @return Object with pitch, roll and yaw values. Values are Floats representing the angle of the axis in radians.
     */
    public Orientation getOrientationRadians() {
        return execute(Command.GET_ORIENTATION_RADIANS).getOrientation();
    }

}
