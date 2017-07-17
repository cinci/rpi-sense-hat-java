package rpi.sensehat.api.dto.joystick;

/**
 * Created by jcincera on 17/07/2017.
 */
public enum Direction {

    UP("up"),
    DOWN("down"),
    LEFT("left"),
    RIGHT("right"),
    MIDDLE("middle");

    private String value;

    Direction(String value) {
        this.value = value;
    }

    public static Direction from(String value) {
        for (Direction d : values()) {
            if (d.value.equals(value)) {
                return d;
            }
        }
        throw new IllegalArgumentException("Unsupported direction: " + value);
    }
}
