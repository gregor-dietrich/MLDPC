package main.CarFactory;

import main.Door.ADoor;
import main.Door.KombiDoor;
import main.Hood.AHood;
import main.Hood.KombiHood;
import main.Lid.ALid;
import main.Lid.KombiLid;
import main.Wing.AWing;
import main.Wing.KombiWing;

public final class KombiCarFactory extends ACarFactory {
    @Override
    public ADoor createDoor(final carColor color) {
        final var p = new KombiDoor();
        this.applyAntiRust(p);
        this.applyPaint(p, color);
        return p;
    }

    @Override
    public AHood createHood(final carColor color) {
        final var p = new KombiHood();
        this.applyAntiRust(p);
        this.applyPaint(p, color);
        return p;
    }

    @Override
    public ALid createLid(final carColor color) {
        final var p = new KombiLid();
        this.applyAntiRust(p);
        this.applyPaint(p, color);
        return p;
    }

    @Override
    public AWing createWing(final carColor color) {
        final var p = new KombiWing();
        this.applyAntiRust(p);
        this.applyPaint(p, color);
        return p;
    }
}
