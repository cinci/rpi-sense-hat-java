package rpi.sensehat.connector;

import rpi.sensehat.api.dto.CommandResult;

/**
 * Created by jcincera on 21/06/2017.
 */
public interface CommandExecutor {

    String lineSeparator = System.getProperty("line.separator");

    CommandResult execute(Command command, String... args);
}
