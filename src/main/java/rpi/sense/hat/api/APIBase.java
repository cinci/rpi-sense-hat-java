package rpi.sense.hat.api;

import rpi.sense.hat.executor.Command;
import rpi.sense.hat.executor.CommandExecutor;
import rpi.sense.hat.executor.CommandResult;
import rpi.sense.hat.executor.SingleCommandExecutor;

/**
 * Created by jcincera on 22/06/2017.
 */
public abstract class APIBase {
    private CommandExecutor commandExecutor = new SingleCommandExecutor();

    protected CommandResult execute(Command command) {
        return commandExecutor.execute(command);
    }
}
