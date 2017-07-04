package rpi.sensehat.api;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import rpi.sensehat.api.dto.Color;
import rpi.sensehat.api.dto.Rotation;

/**
 * Created by jcincera on 04/07/2017.
 */
public class LEDMatrixTest {

    private LEDMatrix ledMatrix = new LEDMatrix();

    @Before
    public void setup() {
        clearWithEmpty();
    }

    @After
    public void teardown() {
        clearWithEmpty();
    }

    @Test
    public void showMessageTest() {
        System.out.println("Show: abc");
        ledMatrix.showMessage("abc");
        waitFor(5);

        clearWithColor();
        clearWithEmpty();

        System.out.println("Show with color: abc");
        ledMatrix.showMessage("abc", 0.20f,
                Color.of(0, 255, 0),
                Color.of(255, 0, 0));
        waitFor(5);
    }

    @Test
    public void showLetterTest() {
        System.out.println("Show: X");
        ledMatrix.showLetter("X");
        waitFor(5);

        clearWithColor();
        clearWithEmpty();

        System.out.println("Show with color: V");
        ledMatrix.showLetter("V",
                Color.of(255, 255, 0),
                Color.of(0, 255, 255));
        waitFor(5);
    }

    @Test
    public void lowLightTest() {
        ledMatrix.lowLight(false);
        ledMatrix.showLetter("X");
        waitFor(1);

        ledMatrix.lowLight(true);
        ledMatrix.showLetter("X");
        waitFor(1);

        ledMatrix.lowLight(false);
    }

    @Test
    public void setRotationTest() {
        ledMatrix.setRotation(Rotation.R_270);
        ledMatrix.showMessage("abc");
        waitFor(5);
        ledMatrix.setRotation(Rotation.R_0);
    }

    @Test
    public void setPixelTest() {
        ledMatrix.setPixel(1, 1, Color.RED);
        ledMatrix.setPixel(3, 3, Color.GREEN);
        ledMatrix.setPixel(5, 5, Color.BLUE);
    }

    @Test
    public void setPixelsTest() {
        final Color X = Color.GREEN;
        final Color O = Color.BLUE;

        Color[] colors = {
                X, O, X, O, X, O, X, O,
                O, X, O, X, O, X, O, X,
                X, O, X, O, X, O, X, O,
                O, X, O, X, O, X, O, X,
                X, O, X, O, X, O, X, O,
                O, X, O, X, O, X, O, X,
                X, O, X, O, X, O, X, O,
                O, X, O, X, O, X, O, X
        };

        ledMatrix.setPixels(colors);
        waitFor(5);
    }

    private void clearWithColor() {
        System.out.println("Clear with color");
        ledMatrix.clear(Color.of(255, 0, 0));
        waitFor(1);
    }

    private void clearWithEmpty() {
        System.out.println("Clear empty");
        ledMatrix.clear();
        waitFor(1);
    }

    private void waitFor(Integer seconds) {
        try {
            Thread.sleep(seconds * 1000);
        }
        catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
