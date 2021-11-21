package main.CarFactory;

import main.Door.ADoor;
import main.Hood.AHood;
import main.Lid.ALid;
import main.Wing.AWing;

public abstract class ACarFactory {
    public abstract ADoor createDoor(carColor color);
    public abstract AHood createHood(carColor color);
    public abstract ALid createLid(carColor color);
    public abstract AWing createWing(carColor color);

    public enum carColor { BLACK, BLUE, GREEN, ORANGE, PURPLE, RED, WHITE, YELLOW }

    protected void applyRostschutz(APart p) {
        p.applyRostschutz();
    };

    protected void applyLackierung(APart p, carColor color) {
        p.applyLackierung(color);
    }
}
