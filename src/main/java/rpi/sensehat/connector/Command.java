package rpi.sensehat.connector;

/**
 * Created by jcincera on 21/06/2017.
 */
public enum Command {

    // Imports
    IMPORT_SENSE_HAT("from sense_hat import SenseHat"),
    IMPORT_TIME("import time"),

    // Object
    SENSE_OBJECT("sensehat = SenseHat()"),

    // Environmental sensor
    GET_HUMIDITY("print(sensehat.get_humidity())"),
    GET_TEMPERATURE("print(sensehat.get_temperature())"),
    GET_TEMPERATURE_FROM_HUMIDITY("print(sensehat.get_temperature_from_humidity())"),
    GET_TEMPERATURE_FROM_PRESSURE("print(sensehat.get_temperature_from_pressure())"),
    GET_PRESSURE("print(sensehat.get_pressure())"),

    // IMU
    SET_IMU_CONFIG("sensehat.set_imu_config(%s, %s, %s)"),
    GET_ORIENTATION_RADIANS("print('{pitch}@{roll}@{yaw}'.format(**sensehat.get_orientation_radians()))"),

    // Common
    GET_TIME("print(time.time())"),;

    private String rawCommand;

    Command(String command) {
        this.rawCommand = command;
    }

    public String getCommand() {
        return rawCommand;
    }
}
