package main.Parts;

import main.CarFactory;

public abstract class APart {
    private CarFactory.carColor color;
    private boolean rostschutz = false;

    public void applyRostschutz() {
        this.setRostschutz(true);
        System.out.println(this.getClass().getName() + ": Rostschutz auftragen...");
    }

    public void applyLackierung(CarFactory.carColor color) {
        this.setColor(color);
        System.out.println(this.getClass().getName() + ": Lackierung auftragen " + "(" + color.toString() + ")" + "...");
    }

    private void setColor(CarFactory.carColor color) {
        this.color = color;
    }

    public boolean getRostschutz() {
        return rostschutz;
    }

    public void setRostschutz(boolean rostschutz) {
        this.rostschutz = rostschutz;
    }
}