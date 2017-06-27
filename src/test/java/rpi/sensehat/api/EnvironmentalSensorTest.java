package rpi.sensehat.api;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

/**
 * Created by jcincera on 22/06/2017.
 */
public class EnvironmentalSensorTest {

    private EnvironmentalSensor sensor = new EnvironmentalSensor();

    @Test
    public void getHumidityTest() throws Exception {
        float humidity = sensor.getHumidity();

        assertNotNull(humidity);
        assertTrue(humidity > 10.0);
        assertTrue(humidity < 100.0);
    }

    @Test
    public void getTemperatureTest() throws Exception {
        float temperature = sensor.getTemperature();

        assertNotNull(temperature);
        assertTrue(temperature > 10.0);
        assertTrue(temperature < 100.0);
    }

    @Test
    public void getTemperatureFromHumidityTest() throws Exception {
        float temperatureFromHumidity = sensor.getTemperatureFromHumidity();

        assertNotNull(temperatureFromHumidity);
        assertTrue(temperatureFromHumidity > 10.0);
        assertTrue(temperatureFromHumidity < 100.0);
    }

    @Test
    public void getTemperatureFromPressureTest() throws Exception {
        float temperatureFromPressure = sensor.getTemperatureFromPressure();

        assertNotNull(temperatureFromPressure);
        assertTrue(temperatureFromPressure > 10.0);
        assertTrue(temperatureFromPressure < 100.0);
    }

    @Test
    public void getPressureTest() throws Exception {
        float pressure = sensor.getPressure();

        assertNotNull(pressure);
        assertTrue(pressure > 100.0);
        assertTrue(pressure < 1000.0);
    }
}
