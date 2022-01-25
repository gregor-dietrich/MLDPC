package main.CarFactory;

import main.Door.ADoor;
import main.Door.LimoDoor;
import main.Hood.AHood;
import main.Hood.LimoHood;
import main.Lid.ALid;
import main.Lid.LimoLid;
import main.Wing.AWing;
import main.Wing.LimoWing;

public final class LimoCarFactory extends ACarFactory {
    @Override
    public ADoor createDoor(final carColor color) {
        final var p = new LimoDoor();
        this.applyAntiRust(p);
        this.applyPaint(p, color);
        return p;
    }

    @Override
    public AHood createHood(final carColor color) {
        final var p = new LimoHood();
        this.applyAntiRust(p);
        this.applyPaint(p, color);
        return p;
    }

    @Override
    public ALid createLid(final carColor color) {
        final var p = new LimoLid();
        this.applyAntiRust(p);
        this.applyPaint(p, color);
        return p;
    }

    @Override
    public AWing createWing(final carColor color) {
        final var p = new LimoWing();
        this.applyAntiRust(p);
        this.applyPaint(p, color);
        return p;
    }
}
