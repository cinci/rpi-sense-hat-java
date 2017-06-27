package rpi.sensehat.api;

import rpi.sensehat.connector.Command;

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
                String.valueOf(compassEnabled),
                String.valueOf(gyroscopeEnabled),
                String.valueOf(accelerometerEnabled)).checkEmpty();
    }

}
