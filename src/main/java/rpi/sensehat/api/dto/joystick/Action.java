package rpi.sensehat.api.dto.joystick;

/**
 * Created by jcincera on 17/07/2017.
 */
public enum Action {

    PRESSED("pressed"),
    RELEASED("released"),
    HELD("held");

    private String value;

    Action(String value) {
        this.value = value;
    }

    public static Action from(String value) {
        for (Action a : values()) {
            if (a.value.equals(value)) {
                return a;
            }
        }
        throw new IllegalArgumentException("Unsupported action: " + value);
    }
}
