package rpi.sensehat.connector;

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

    public void checkEmpty() {
        if (this.value == null || this.value.trim().equals("")) {
            throw new CommunicationException("Unexpected output: " + this.value);
        }
    }
}
