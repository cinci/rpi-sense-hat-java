package rpi.sensehat.api;

import org.junit.Test;
import rpi.sensehat.connector.result.IMUData;
import rpi.sensehat.connector.result.IMUDataRaw;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

/**
 * Created by jcincera on 28/06/2017.
 */
public class IMUTest {

    private IMU imu = new IMU();

    @Test
    public void setImuConfigTest() {
        imu.setIMUConfig(true, true, true);
        assertTrue(true);
    }

    @Test
    public void getOrientationRadiansTest() {
        IMUData result = imu.getOrientationRadians();

        assertNotNull(result.getPitch());
        assertTrue(result.getPitch() < 7);

        assertNotNull(result.getRoll());
        assertTrue(result.getRoll() < 7);

        assertNotNull(result.getYaw());
        assertTrue(result.getYaw() < 7);
    }

    @Test
    public void getOrientationDegreesTest() {
        IMUData result = imu.getOrientationDegrees();

        assertNotNull(result.getPitch());
        assertTrue(result.getPitch() < 370);

        assertNotNull(result.getRoll());
        assertTrue(result.getRoll() < 370);

        assertNotNull(result.getYaw());
        assertTrue(result.getYaw() < 370);
    }

    @Test
    public void getOrientationTest() {
        IMUData result = imu.getOrientation();

        assertNotNull(result.getPitch());
        assertTrue(result.getPitch() < 370);

        assertNotNull(result.getRoll());
        assertTrue(result.getRoll() < 370);

        assertNotNull(result.getYaw());
        assertTrue(result.getYaw() < 370);
    }

    @Test
    public void getCompassTest() {
        float compass = imu.getCompass();

        assertTrue(compass > -1);
        assertTrue(compass < 370);
    }

    @Test
    public void getCompassRawTest() {
        IMUDataRaw result = imu.getCompassRaw();

        assertNotNull(result.getX());
        assertTrue(result.getX() < 370);

        assertNotNull(result.getY());
        assertTrue(result.getY() < 370);

        assertNotNull(result.getZ());
        assertTrue(result.getZ() < 370);
    }

    @Test
    public void getGyroscopeTest() {
        IMUData result = imu.getGyroscope();

        assertNotNull(result.getPitch());
        assertTrue(result.getPitch() < 7);

        assertNotNull(result.getRoll());
        assertTrue(result.getRoll() < 7);

        assertNotNull(result.getYaw());
        assertTrue(result.getYaw() < 7);
    }

    @Test
    public void getGyroscopeRawTest() {
        IMUDataRaw result = imu.getGyroscopeRaw();

        assertNotNull(result.getX());
        assertTrue(result.getX() < 7);

        assertNotNull(result.getY());
        assertTrue(result.getY() < 7);

        assertNotNull(result.getZ());
        assertTrue(result.getZ() < 7);
    }

    @Test
    public void getAccelerometerTest() {
        IMUData result = imu.getAccelerometer();

        assertNotNull(result.getPitch());
        assertTrue(result.getPitch() < 370);

        assertNotNull(result.getRoll());
        assertTrue(result.getRoll() < 370);

        assertNotNull(result.getYaw());
        assertTrue(result.getYaw() < 370);
    }

    @Test
    public void getAccelerometerRawTest() {
        IMUDataRaw result = imu.getAccelerometerRaw();

        assertNotNull(result.getX());
        assertTrue(result.getX() < 7);

        assertNotNull(result.getY());
        assertTrue(result.getY() < 7);

        assertNotNull(result.getZ());
        assertTrue(result.getZ() < 7);
    }
}
