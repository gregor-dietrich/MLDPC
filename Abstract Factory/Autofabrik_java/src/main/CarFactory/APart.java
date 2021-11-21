package main.CarFactory;

public abstract class APart {
    private ACarFactory.carColor color;
    private boolean rostschutz = false;

    public void applyRostschutz() {
        this.setRostschutz(true);
    }

    public void applyLackierung(ACarFactory.carColor color) {
        this.setColor(color);
    }

    private void setColor(ACarFactory.carColor color) {
        this.color = color;
    }

    public ACarFactory.carColor getColor() {
        return color;
    }

    public boolean getRostschutz() {
        return rostschutz;
    }

    public void setRostschutz(boolean rostschutz) {
        this.rostschutz = rostschutz;
    }
}
