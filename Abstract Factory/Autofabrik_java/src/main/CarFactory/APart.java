package main.CarFactory;

public abstract class APart {
    private ACarFactory.carColor color;
    private boolean antiRust = false;

    public final void applyAntiRust() {
        this.setAntiRust(true);
    }

    public final void applyPaint(final ACarFactory.carColor color) {
        this.setColor(color);
    }

    public final ACarFactory.carColor getColor() {
        return color;
    }

    private void setColor(final ACarFactory.carColor color) {
        this.color = color;
    }

    public final boolean getAntiRust() {
        return antiRust;
    }

    private void setAntiRust(final boolean antiRust) {
        this.antiRust = antiRust;
    }
}
