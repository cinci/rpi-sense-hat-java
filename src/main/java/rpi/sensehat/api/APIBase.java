package rpi.sensehat.api;

import rpi.sensehat.connector.*;

/**
 * Created by jcincera on 22/06/2017.
 */
public abstract class APIBase {
    private static final String SENSE_HAT_EXECUTOR_TYPE = "SENSE_HAT_EXECUTOR_TYPE";

    private CommandExecutor commandExecutor;

    protected APIBase() {
        String senseHatExecutorType = System.getProperty(SENSE_HAT_EXECUTOR_TYPE);
        if ("MULTIPLE".equals(senseHatExecutorType)) {
            this.commandExecutor = new MultipleCommandExecutor();
        }
        else {
            this.commandExecutor = new SimpleCommandExecutor();
        }
    }

    protected CommandResult execute(Command command) {
        return commandExecutor.execute(command);
    }
}
