package main.CarFactory;

import main.Door.ADoor;
import main.Door.LimoDoor;
import main.Hood.AHood;
import main.Hood.LimoHood;
import main.Lid.ALid;
import main.Lid.LimoLid;
import main.Wing.AWing;
import main.Wing.LimoWing;

public class LimoCarFactory extends ACarFactory {
    @Override
    public ADoor createDoor(carColor color) {
        var p = new LimoDoor();
        this.applyRostschutz(p);
        this.applyLackierung(p, color);
        return p;
    }

    @Override
    public AHood createHood(carColor color) {
        var p = new LimoHood();
        this.applyRostschutz(p);
        this.applyLackierung(p, color);
        return p;
    }

    @Override
    public ALid createLid(carColor color) {
        var p = new LimoLid();
        this.applyRostschutz(p);
        this.applyLackierung(p, color);
        return p;
    }

    @Override
    public AWing createWing(carColor color) {
        var p = new LimoWing();
        this.applyRostschutz(p);
        this.applyLackierung(p, color);
        return p;
    }
}
