package main.CarFactory;

import main.Door.ADoor;
import main.Hood.AHood;
import main.Lid.ALid;
import main.Wing.AWing;

public abstract class ACarFactory {
    public abstract ADoor createDoor(final carColor color);

    public abstract AHood createHood(final carColor color);

    public abstract ALid createLid(final carColor color);

    public abstract AWing createWing(final carColor color);

    protected void applyAntiRust(final APart p) {
        p.applyAntiRust();
    }

    protected void applyPaint(final APart p, final carColor color) {
        p.applyPaint(color);
    }

    public enum carColor {BLACK, BLUE, GREEN, ORANGE, PURPLE, RED, WHITE, YELLOW}
}
