package rpi.sensehat.api;

import rpi.sensehat.connector.Command;
import rpi.sensehat.connector.CommandExecutor;
import rpi.sensehat.connector.MultipleCommandExecutor;
import rpi.sensehat.connector.SimpleCommandExecutor;
import rpi.sensehat.connector.result.CommandResult;

/**
 * Created by jcincera on 22/06/2017.
 */
public abstract class SensorBase {
    private static final String SENSE_HAT_EXECUTOR_TYPE = "SENSE_HAT_EXECUTOR_TYPE";

    private CommandExecutor commandExecutor;

    protected SensorBase() {
        String senseHatExecutorType = System.getProperty(SENSE_HAT_EXECUTOR_TYPE);
        if ("MULTIPLE".equals(senseHatExecutorType)) {
            this.commandExecutor = new MultipleCommandExecutor();
        }
        else {
            this.commandExecutor = new SimpleCommandExecutor();
        }
    }

    protected CommandResult execute(Command command, String... args) {
        return commandExecutor.execute(command, args);
    }
}
