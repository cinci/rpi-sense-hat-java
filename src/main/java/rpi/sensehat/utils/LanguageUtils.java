package rpi.sensehat.utils;

/**
 * Created by jcincera on 28/06/2017.
 */
public final class LanguageUtils {
    private LanguageUtils() {
    }

    public static String toBoolean(boolean value) {
        String s = String.valueOf(value);
        return Character.toUpperCase(s.charAt(0)) + s.substring(1);
    }
}
