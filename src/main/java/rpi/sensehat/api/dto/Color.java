package rpi.sensehat.api.dto;

/**
 * Created by jcincera on 04/07/2017.
 */
public class Color {

    private String r;
    private String g;
    private String b;

    public static Color RED = Color.of(255, 0, 0);
    public static Color GREEN = Color.of(0, 255, 0);
    public static Color BLUE = Color.of(0, 0, 255);

    private Color(Integer r, Integer g, Integer b) {
        this.r = String.valueOf(r);
        this.g = String.valueOf(g);
        this.b = String.valueOf(b);
    }

    public static Color of(Integer r, Integer g, Integer b) {
        return new Color(r, g, b);
    }

    public String r() {
        return r;
    }

    public String g() {
        return g;
    }

    public String b() {
        return b;
    }
}
