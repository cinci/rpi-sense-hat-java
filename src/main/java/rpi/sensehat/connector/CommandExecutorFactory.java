package rpi.sensehat.connector;

import rpi.sensehat.connector.mock.MockCommandExecutor;

/**
 * Created by jcincera on 04/07/2017.
 */
public class CommandExecutorFactory {

    private static final String SENSE_HAT_EXECUTOR_TYPE = "SENSE_HAT_EXECUTOR_TYPE";
    private static final String SIMPLE_COMMAND = "SIMPLE_COMMAND";
    private static final String MULTIPLE_COMMAND = "MULTIPLE_COMMAND";
    private static final String OS_ARCH = "os.arch";
    private static final String OS_ARCH_ARM = "arm";

    public static CommandExecutor get() {

        // Dev command executor for not ARM system (macOS etc.)
        String osArch = System.getProperty(OS_ARCH).toLowerCase();
        if (!osArch.contains(OS_ARCH_ARM)) {
            System.out.println("ARM platform not detected! Using mock command executor.");
            return new MockCommandExecutor();
        }

        // Command executor for Raspberry PI
        String senseHatExecutorType = System.getProperty(SENSE_HAT_EXECUTOR_TYPE);
        if (MULTIPLE_COMMAND.equals(senseHatExecutorType)) {
            return new MultipleCommandExecutor();
        }
        else if (SIMPLE_COMMAND.equals(senseHatExecutorType)) {
            return new SimpleCommandExecutor();
        }
        else {
            return new SimpleCommandExecutor();
        }
    }
}
