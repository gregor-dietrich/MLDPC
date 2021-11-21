package main.CarFactory;

import main.Door.ADoor;
import main.Door.KombiDoor;
import main.Hood.AHood;
import main.Hood.KombiHood;
import main.Lid.ALid;
import main.Lid.KombiLid;
import main.Wing.AWing;
import main.Wing.KombiWing;

public class KombiCarFactory extends ACarFactory {
    @Override
    public ADoor createDoor(carColor color) {
        var p = new KombiDoor();
        this.applyRostschutz(p);
        this.applyLackierung(p, color);
        return p;
    }

    @Override
    public AHood createHood(carColor color) {
        var p = new KombiHood();
        this.applyRostschutz(p);
        this.applyLackierung(p, color);
        return p;
    }

    @Override
    public ALid createLid(carColor color) {
        var p = new KombiLid();
        this.applyRostschutz(p);
        this.applyLackierung(p, color);
        return p;
    }

    @Override
    public AWing createWing(carColor color) {
        var p = new KombiWing();
        this.applyRostschutz(p);
        this.applyLackierung(p, color);
        return p;
    }
}