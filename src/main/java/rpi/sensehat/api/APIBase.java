package rpi.sensehat.api;

import rpi.sensehat.api.dto.CommandResult;
import rpi.sensehat.connector.Command;
import rpi.sensehat.connector.CommandExecutor;
import rpi.sensehat.connector.CommandExecutorFactory;

/**
 * Created by jcincera on 22/06/2017.
 */
public abstract class APIBase {

    private CommandExecutor commandExecutor;

    protected APIBase() {
        this.commandExecutor = CommandExecutorFactory.get();
    }

    protected CommandResult execute(Command command, String... args) {
        return commandExecutor.execute(command, args);
    }
}
