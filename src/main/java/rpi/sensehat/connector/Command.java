package rpi.sensehat.connector;

/**
 * Created by jcincera on 21/06/2017.
 */
public enum Command {

    // Imports
    IMPORT_SENSE_HAT("from sense_hat import SenseHat", false),
    IMPORT_TIME("import time", false),

    // Object
    SENSE_OBJECT("sensehat = SenseHat()", false),

    // Environmental sensor
    GET_HUMIDITY("print(sensehat.get_humidity())", false),
    GET_TEMPERATURE("print(sensehat.get_temperature())", false),
    GET_TEMPERATURE_FROM_HUMIDITY("print(sensehat.get_temperature_from_humidity())", false),
    GET_TEMPERATURE_FROM_PRESSURE("print(sensehat.get_temperature_from_pressure())", false),
    GET_PRESSURE("print(sensehat.get_pressure())", false),

    // IMU
    SET_IMU_CONFIG("sensehat.set_imu_config(%s, %s, %s)", true),
    GET_ORIENTATION_RADIANS("print('{pitch}@{roll}@{yaw}'.format(**sensehat.get_orientation_radians()))", false),

    // Common
    GET_TIME("print(time.time())", false),;

    private String rawCommand;
    private Boolean isFormatted;

    Command(String command, Boolean isFormatted) {
        this.rawCommand = command;
        this.isFormatted = isFormatted;
    }

    public String getCommand() {
        return rawCommand;
    }

    public Boolean isFormatted() {
        return isFormatted;
    }
}
