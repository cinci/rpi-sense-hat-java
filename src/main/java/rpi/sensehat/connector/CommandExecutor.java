package rpi.sensehat.connector;

/**
 * Created by jcincera on 21/06/2017.
 */
public interface CommandExecutor {

    CommandResult execute(Command command, String... args);
}
