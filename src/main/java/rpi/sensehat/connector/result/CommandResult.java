package rpi.sensehat.connector.result;

import rpi.sensehat.exception.CommandException;
import rpi.sensehat.exception.CommunicationException;

/**
 * Created by jcincera on 22/06/2017.
 */
public class CommandResult {

    private String value;

    public CommandResult(String value) {
        this.value = value;
    }

    public float getFloat() {
        return Float.valueOf(value);
    }

    public Orientation getOrientation() {
        final String[] result = value.split("@");

        if (result.length != 3) {
            throw new CommandException("Invalid orientation: " + value);
        }

        return new Orientation(
                Float.valueOf(result[0]),
                Float.valueOf(result[1]),
                Float.valueOf(result[2])
        );
    }

    public void checkEmpty() {
        if (this.value == null || !this.value.trim().equals("")) {
            throw new CommunicationException("Unexpected output: " + "'" + this.value + "'");
        }
    }
}
