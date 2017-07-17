package rpi.sensehat.api.dto;

import rpi.sensehat.api.dto.joystick.Action;
import rpi.sensehat.api.dto.joystick.Direction;

/**
 * Created by jcincera on 17/07/2017.
 */
public class JoystickEvent {

    private Direction direction;
    private Action action;
    private Double timestamp;

    public JoystickEvent(String action, String direction, String timestamp) {
        this.action = Action.from(action);
        this.direction = Direction.from(direction);
        this.timestamp = Double.valueOf(timestamp);
    }

    public Direction getDirection() {
        return direction;
    }

    public Action getAction() {
        return action;
    }

    public Double getTimestamp() {
        return timestamp;
    }
}
