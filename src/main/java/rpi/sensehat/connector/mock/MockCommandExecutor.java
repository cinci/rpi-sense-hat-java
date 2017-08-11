package rpi.sensehat.connector.mock;

import rpi.sensehat.api.dto.CommandResult;
import rpi.sensehat.connector.Command;
import rpi.sensehat.connector.CommandExecutor;

/**
 * Created by jcincera on 04/07/2017.
 */
public class MockCommandExecutor implements CommandExecutor {

    @Override
    public CommandResult execute(Command command, String... args) {
        System.out.println("Mocking command: " + command.getCommand());

        MockCommandResult result = new MockCommandResult("");
        result.setCommand(command);

        return result;
    }

}
