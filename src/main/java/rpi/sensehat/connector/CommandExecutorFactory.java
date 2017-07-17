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
        System.out.println("Platform: " + System.getProperty(OS_ARCH));

        // Dev command executor for not ARM system (macOS etc.)
        String osArch = System.getProperty(OS_ARCH).toLowerCase();
        if (!osArch.contains(OS_ARCH_ARM)) {
            System.out.println("ARM platform not detected! Using mock command executor.");
            return new MockCommandExecutor();
        }

        // Command executor for Raspberry PI
        String senseHatExecutorType = System.getProperty(SENSE_HAT_EXECUTOR_TYPE);
        if (MULTIPLE_COMMAND.equals(senseHatExecutorType)) {
            System.out.println("Using multiple command executor");
            return new MultipleCommandExecutor();
        }
        else if (SIMPLE_COMMAND.equals(senseHatExecutorType)) {
            System.out.println("Using simple command executor");
            return new SimpleCommandExecutor();
        }
        else {
            System.out.println("Using default: simple command executor");
            return new SimpleCommandExecutor();
        }
    }
}
