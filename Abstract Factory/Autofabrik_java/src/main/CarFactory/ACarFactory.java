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

    protected void applyRostschutz(final APart p) {
        p.applyRostschutz();
    }

    protected void applyLackierung(final APart p, final carColor color) {
        p.applyLackierung(color);
    }

    public enum carColor {BLACK, BLUE, GREEN, ORANGE, PURPLE, RED, WHITE, YELLOW}
}
