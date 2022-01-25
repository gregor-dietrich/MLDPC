package main.Parts;

import main.CarFactory;

public abstract class APart {
    private CarFactory.carColor color;
    private boolean antiRust = false;

    public final void applyAntiRust() {
        this.setAntiRust(true);
        System.out.println(this.getClass().getName() + ": Rostschutz auftragen...");
    }

    public final void applyPaint(final CarFactory.carColor color) {
        this.setColor(color);
        System.out.println(this.getClass().getName() + ": Lackierung auftragen " + "(" + color.toString() + ")" + "...");
    }

    private void setColor(final CarFactory.carColor color) {
        this.color = color;
    }

    public final boolean getAntiRust() {
        return antiRust;
    }

    public final void setAntiRust(final boolean antiRust) {
        this.antiRust = antiRust;
    }
}
