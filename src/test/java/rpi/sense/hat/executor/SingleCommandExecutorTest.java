package rpi.sense.hat.executor;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

/**
 * Created by jcincera on 20/06/2017.
 */
public class SingleCommandExecutorTest {

    private SingleCommandExecutor commandExecutor = new SingleCommandExecutor();

    @Test
    public void getHumidityTest() {
        float result = commandExecutor.execute(Command.GET_HUMIDITY).getFloat();

        assertNotNull(result);
        assertTrue(result > 10.0);
    }

    @Test
    public void getTemperatureTest() {
        float result = commandExecutor.execute(Command.GET_TEMPERATURE).getFloat();

        assertNotNull(result);
        assertTrue(result > 10.0);
    }

    @Test
    public void getTemperatureFromHumidityTest() {
        float result = commandExecutor.execute(Command.GET_TEMPERATURE_FROM_HUMIDITY).getFloat();

        assertNotNull(result);
        assertTrue(result > 10.0);
    }

    @Test
    public void getTemperatureFromPressureTest() {
        float result = commandExecutor.execute(Command.GET_TEMPERATURE_FROM_PRESSURE).getFloat();

        assertNotNull(result);
        assertTrue(result > 10.0);
    }

    @Test
    public void getPressureTest() {
        float result = commandExecutor.execute(Command.GET_PRESSURE).getFloat();

        assertNotNull(result);
        assertTrue(result > 100.0);
    }
}
