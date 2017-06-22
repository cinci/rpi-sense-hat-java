package rpi.sense.hat.api;

import rpi.sense.hat.executor.Command;

/**
 * Created by jcincera on 20/06/2017.
 */
public class EnvironmentalSensor extends APIBase {

    public float getHumidity() {
        return execute(Command.GET_HUMIDITY).getFloat();
    }

    public float getTemperature() {
        return execute(Command.GET_TEMPERATURE).getFloat();
    }

    public float getTemperatureFromHumidity() {
        return execute(Command.GET_TEMPERATURE_FROM_HUMIDITY).getFloat();
    }

    public float getTemperatureFromPressure() {
        return execute(Command.GET_TEMPERATURE_FROM_PRESSURE).getFloat();
    }

    public float getPressure() {
        return execute(Command.GET_PRESSURE).getFloat();
    }
}
