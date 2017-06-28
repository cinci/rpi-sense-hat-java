package rpi.sensehat.api;

import org.junit.Test;
import rpi.sensehat.connector.result.Orientation;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

/**
 * Created by jcincera on 28/06/2017.
 */
public class IMUTest {

    private IMU imu = new IMU();

    @Test
    public void getOrientationRadiansTest() {
        imu.setIMUConfig(true, true, true);

        Orientation orientation = imu.getOrientationRadians();
        assertNotNull(orientation.getPitch());
        assertTrue(orientation.getPitch() < 360);

        assertNotNull(orientation.getRoll());
        assertTrue(orientation.getRoll() < 360);

        assertNotNull(orientation.getYaw());
        assertTrue(orientation.getYaw() < 360);
    }
}
