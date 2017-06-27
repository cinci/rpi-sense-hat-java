package rpi.sensehat.exception;

/**
 * Created by jcincera on 27/06/2017.
 */
public class CommunicationException extends RuntimeException {

    public CommunicationException(String message) {
        super(message);
    }

    public CommunicationException(Throwable cause) {
        super(cause);
    }

    public CommunicationException(String message, Throwable cause) {
        super(message, cause);
    }
}
