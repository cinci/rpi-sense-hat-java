package rpi.sensehat.connector;

import rpi.sensehat.api.dto.CommandResult;

/**
 * Created by jcincera on 27/06/2017.
 */
public class MultipleCommandExecutor implements CommandExecutor {

    @Override
    public CommandResult execute(Command command, String... args) {
        throw new UnsupportedOperationException("Not supported yet");
    }
}
