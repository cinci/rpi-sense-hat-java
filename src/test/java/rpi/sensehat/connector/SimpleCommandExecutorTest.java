package rpi.sensehat.connector;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assume.assumeTrue;

/**
 * Created by jcincera on 20/06/2017.
 */
public class SimpleCommandExecutorTest {

    private SimpleCommandExecutor commandExecutor = new SimpleCommandExecutor();

    @Before
    public void setup() {
        assumeTrue(System.getProperty("os.arch").toLowerCase().contains("arm"));
    }

    @Test
    public void getHumidityTest() {
        float humidity = commandExecutor.execute(Command.GET_HUMIDITY).getFloat();

        assertNotNull(humidity);
        assertTrue(humidity > 10.0);
        assertTrue(humidity < 100.0);
    }

    @Test
    public void getTemperatureTest() {
        float temperature = commandExecutor.execute(Command.GET_TEMPERATURE).getFloat();

        assertNotNull(temperature);
        assertTrue(temperature > 10.0);
        assertTrue(temperature < 100.0);
    }

    @Test
    public void getTemperatureFromHumidityTest() {
        float temperatureFromHumidity = commandExecutor.execute(Command.GET_TEMPERATURE_FROM_HUMIDITY).getFloat();

        assertNotNull(temperatureFromHumidity);
        assertTrue(temperatureFromHumidity > 10.0);
        assertTrue(temperatureFromHumidity < 100.0);
    }

    @Test
    public void getTemperatureFromPressureTest() {
        float temperatureFromPressure = commandExecutor.execute(Command.GET_TEMPERATURE_FROM_PRESSURE).getFloat();

        assertNotNull(temperatureFromPressure);
        assertTrue(temperatureFromPressure > 10.0);
        assertTrue(temperatureFromPressure < 100.0);
    }

    @Test
    public void getPressureTest() {
        float pressure = commandExecutor.execute(Command.GET_PRESSURE).getFloat();

        assertNotNull(pressure);
        assertTrue(pressure > 100.0);
        assertTrue(pressure < 1000.0);
    }
}
