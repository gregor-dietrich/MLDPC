package main;

import main.Parts.APart;

public abstract class APartsFactory {
    APart orderPart(partType t, CarFactory.carColor color) {
        APart p = this.createPart(t);
        System.out.println(p.getClass().getName() + ": Teil wurde hergestellt.");
        p.applyRostschutz();
        p.applyLackierung(color);
        System.out.println(p.getClass().getName() + ": Teil ist fertig.");
        System.out.println();
        return p;
    }

    protected abstract APart createPart(partType t);

    public enum partType {DOOR, HOOD, LID, WING}
}
