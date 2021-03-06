package net.thumbtack.school.windows.v1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestWindowFactory {

    @Test
    @SuppressWarnings("unused")
    public void testWindowFactory() {
        RectButton rectButton1 = WindowFactory.createRectButton(new Point(10, 20), new Point(30, 40), true);
        RectButton rectButton2 = WindowFactory.createRectButton(new Point(110, 120), new Point(130, 140), true);
        RoundButton roundButton1 = WindowFactory.createRoundButton(new Point(10, 20), 10, true);
        RoundButton roundButton2 = WindowFactory.createRoundButton(new Point(110, 120), 10, true);
        RoundButton roundButton3 = WindowFactory.createRoundButton(new Point(210, 220), 10, true);
        assertEquals(2, WindowFactory.getRectButtonCount());
        assertEquals(3, WindowFactory.getRoundButtonCount());
        assertEquals(5, WindowFactory.getWindowCount());
        WindowFactory.reset();
        assertEquals(0, WindowFactory.getWindowCount());
    }

}
