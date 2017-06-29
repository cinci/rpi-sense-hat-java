package rpi.sensehat.utils;

/**
 * Created by jcincera on 28/06/2017.
 */
public final class PythonUtils {
    private PythonUtils() {
    }

    public static String toBoolean(boolean value) {
        return value ? "True" : "False";
    }
}
