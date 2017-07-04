package rpi.sensehat.api;

import rpi.sensehat.connector.Command;

/**
 * Created by jcincera on 20/06/2017.
 */
public class EnvironmentalSensor extends APIBase {

    EnvironmentalSensor() {
    }

    /**
     * Gets the percentage of relative humidity from the humidity sensor
     *
     * @return the percentage of relative humidity
     */
    public float getHumidity() {
        return execute(Command.GET_HUMIDITY).getFloat();
    }

    /**
     * Calls get_temperature_from_humidity internally in Python core
     *
     * @return the current temperature in degrees Celsius
     */
    public float getTemperature() {
        return execute(Command.GET_TEMPERATURE).getFloat();
    }

    /**
     * Gets the current temperature in degrees Celsius from the humidity sensor
     *
     * @return the current temperature in degrees Celsius
     */
    public float getTemperatureFromHumidity() {
        return execute(Command.GET_TEMPERATURE_FROM_HUMIDITY).getFloat();
    }

    /**
     * Gets the current temperature in degrees Celsius from the pressure sensor
     *
     * @return the current temperature in degrees Celsius
     */
    public float getTemperatureFromPressure() {
        return execute(Command.GET_TEMPERATURE_FROM_PRESSURE).getFloat();
    }

    /**
     * Gets the current pressure in Millibars from the pressure sensor
     *
     * @return the current pressure in Millibars
     */
    public float getPressure() {
        return execute(Command.GET_PRESSURE).getFloat();
    }
}
