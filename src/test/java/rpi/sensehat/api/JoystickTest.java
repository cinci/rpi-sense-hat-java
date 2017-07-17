package rpi.sensehat.api;

import org.junit.Ignore;
import org.junit.Test;
import rpi.sensehat.api.dto.JoystickEvent;

import static org.junit.Assert.assertNotNull;

/**
 * Created by jcincera on 17/07/2017.
 */
@Ignore
public class JoystickTest {

    private Joystick joystick = new Joystick();

    @Test
    public void waitForEventTest() {
        JoystickEvent e = joystick.waitForEvent();

        System.out.println("Action: " + e.getAction());
        System.out.println("Direction: " + e.getDirection());
        System.out.println("Timestamp: " + e.getTimestamp());

        assertNotNull(e.getAction());
        assertNotNull(e.getDirection());
        assertNotNull(e.getTimestamp());
    }

    @Test
    public void waitForEventWithEmptyBufferTest() {
        JoystickEvent e = joystick.waitForEvent(true);

        System.out.println("Action: " + e.getAction());
        System.out.println("Direction: " + e.getDirection());
        System.out.println("Timestamp: " + e.getTimestamp());

        assertNotNull(e.getAction());
        assertNotNull(e.getDirection());
        assertNotNull(e.getTimestamp());
    }
}
