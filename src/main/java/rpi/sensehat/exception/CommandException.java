package rpi.sensehat.exception;

/**
 * Created by jcincera on 21/06/2017.
 */
public class CommandException extends RuntimeException {

    public CommandException(Throwable cause) {
        super(cause);
    }

    public CommandException(String message) {
        super(message);
    }

}
