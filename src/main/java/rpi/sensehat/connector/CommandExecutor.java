package rpi.sensehat.connector;

import rpi.sensehat.connector.result.CommandResult;

/**
 * Created by jcincera on 21/06/2017.
 */
public interface CommandExecutor {

    CommandResult execute(Command command, String... args);
}