package main.CarFactory;

public abstract class APart {
    private ACarFactory.carColor color;
    private boolean rostschutz = false;

    public final void applyRostschutz() {
        this.setRostschutz(true);
    }

    public final void applyLackierung(ACarFactory.carColor color) {
        this.setColor(color);
    }

    public final ACarFactory.carColor getColor() {
        return color;
    }

    private final void setColor(ACarFactory.carColor color) {
        this.color = color;
    }

    public final boolean getRostschutz() {
        return rostschutz;
    }

    public final void setRostschutz(boolean rostschutz) {
        this.rostschutz = rostschutz;
    }
}
