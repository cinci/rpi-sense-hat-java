package rpi.sensehat.api;

import rpi.sensehat.api.dto.IMUData;
import rpi.sensehat.api.dto.IMUDataRaw;
import rpi.sensehat.connector.Command;
import rpi.sensehat.utils.PythonUtils;

/**
 * Created by jcincera on 20/06/2017.
 */
public class IMU extends APIBase {

    IMU() {
    }

    /**
     * Enables and disables the gyroscope, accelerometer and/or magnetometer contribution to the get orientation functions
     *
     * @param compassEnabled       enable compass
     * @param gyroscopeEnabled     enable gyroscope
     * @param accelerometerEnabled enable accelerometer
     */
    public void setIMUConfig(boolean compassEnabled, boolean gyroscopeEnabled, boolean accelerometerEnabled) {
        execute(Command.SET_IMU_CONFIG,
                PythonUtils.toBoolean(compassEnabled),
                PythonUtils.toBoolean(gyroscopeEnabled),
                PythonUtils.toBoolean(accelerometerEnabled)).checkEmpty();
    }

    /**
     * Gets the current orientation in radians using the aircraft principal axes of pitch, roll and yaw
     *
     * @return Object with pitch, roll and yaw values. Values are Floats representing the angle of the axis in radians
     */
    public IMUData getOrientationRadians() {
        return execute(Command.GET_ORIENTATION_RADIANS).getIMUData();
    }

    /**
     * Gets the current orientation in degrees using the aircraft principal axes of pitch, roll and yaw
     *
     * @return Object with pitch, roll and yaw values. Values are Floats representing the angle of the axis in degrees
     */
    public IMUData getOrientationDegrees() {
        return execute(Command.GET_ORIENTATION_DEGREES).getIMUData();
    }

    /**
     * Calls get_orientation_degrees internally in Python core
     *
     * @return Object with pitch, roll and yaw representing the angle of the axis in degrees
     */
    public IMUData getOrientation() {
        return execute(Command.GET_ORIENTATION).getIMUData();
    }

    /**
     * Calls set_imu_config internally in Python core to disable the gyroscope and accelerometer
     * then gets the direction of North from the magnetometer in degrees
     *
     * @return The direction of North
     */
    public float getCompass() {
        return execute(Command.GET_COMPASS).getFloat();
    }

    /**
     * Gets the raw x, y and z axis magnetometer data
     *
     * @return Object representing the magnetic intensity of the axis in microteslas (uT)
     */
    public IMUDataRaw getCompassRaw() {
        return execute(Command.GET_COMPASS_RAW).getIMUDataRaw();
    }

    /**
     * Calls set_imu_config internally in Python core to disable the magnetometer and accelerometer
     * then gets the current orientation from the gyroscope only
     *
     * @return Object with pitch, roll and yaw representing the angle of the axis in degrees
     */
    public IMUData getGyroscope() {
        return execute(Command.GET_GYROSCOPE).getIMUData();
    }

    /**
     * Gets the raw x, y and z axis gyroscope data
     *
     * @return Object representing the rotational intensity of the axis in radians per second
     */
    public IMUDataRaw getGyroscopeRaw() {
        return execute(Command.GET_GYROSCOPE_RAW).getIMUDataRaw();
    }

    /**
     * Calls set_imu_config in Python core to disable the magnetometer and gyroscope
     * then gets the current orientation from the accelerometer only
     *
     * @return Object representing the angle of the axis in degrees
     */
    public IMUData getAccelerometer() {
        return execute(Command.GET_ACCELEROMETER).getIMUData();
    }

    /**
     * Gets the raw x, y and z axis accelerometer data
     *
     * @return Object representing the acceleration intensity of the axis in Gs
     */
    public IMUDataRaw getAccelerometerRaw() {
        return execute(Command.GET_ACCELEROMETER_RAW).getIMUDataRaw();
    }
}
