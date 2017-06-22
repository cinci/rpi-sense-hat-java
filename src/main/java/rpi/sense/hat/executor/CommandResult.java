package rpi.sense.hat.executor;

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
}
