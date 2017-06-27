package rpi.sensehat.connector;

import rpi.sensehat.exception.CommandException;
import rpi.sensehat.exception.CommunicationException;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Created by jcincera on 20/06/2017.
 */
public class SimpleCommandExecutor implements CommandExecutor {

    private String lineSeparator = System.getProperty("line.separator");

    @Override
    public CommandResult execute(Command command, String... args) {
        try {

            // Create command
            final String completeCommand = createCompleteCommand(command, args);

            // Call
            ProcessBuilder pb = new ProcessBuilder("python", "-c", completeCommand);
            pb.redirectErrorStream(true);
            Process p = pb.start();

            // Read output
            BufferedReader output = new BufferedReader(new InputStreamReader(p.getInputStream()));
            StringBuilder result = new StringBuilder();
            String line;

            while ((line = output.readLine()) != null) {
                result.append(line);
                result.append(lineSeparator);
            }
            System.out.println("Command result: " + result.toString());

            // Handle result
            waitForCommand(p);
            checkCommandException(result);
            return new CommandResult(result.toString());
        }
        catch (Exception e) {
            System.err.println(e);

            if (e instanceof CommandException) {
                throw (CommandException) e;
            }

            throw new CommunicationException("Communication with Sense Hat failed!", e);
        }
    }

    private void checkCommandException(StringBuilder result) {
        if (result.toString().contains("Traceback") || result.toString().contains("Error")) {
            throw new CommandException("Command execution failed!\n" + result.toString());
        }
    }

    private String createCompleteCommand(Command command, String[] args) {
        String rawCommand = command.isFormatted() ?
                String.format(command.getCommand(), (Object[]) args) :
                command.getCommand();

        return Command.IMPORT_SENSE_HAT.getCommand() + ";" +
                Command.SENSE_OBJECT.getCommand() + ";" +
                rawCommand;
    }

    private void waitForCommand(Process p) {
        try {
            p.waitFor();
            Thread.sleep(1000);
        }
        catch (InterruptedException e) {
            System.err.println(e);
        }
    }
}
