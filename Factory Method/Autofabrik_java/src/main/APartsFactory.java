package main;

import main.Parts.APart;

public abstract class APartsFactory {
    public final APart orderPart(final partType t, final CarFactory.carColor color) {
        final var p = this.createPart(t);
        System.out.println(p.getClass().getName() + ": Teil wurde hergestellt.");
        p.applyAntiRust();
        p.applyPaint(color);
        System.out.println(p.getClass().getName() + ": Teil ist fertig.");
        System.out.println();
        return p;
    }

    protected abstract APart createPart(final partType t);

    public enum partType {DOOR, HOOD, LID, WING}
}
