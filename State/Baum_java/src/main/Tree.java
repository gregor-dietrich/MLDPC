package main;

import main.TreeComponents.Trunk;

public final class Tree {
    private final Trunk trunk;

    public Tree() {
        this.trunk = new Trunk();
    }

    public void applyWind(final int windIntensity) {
        trunk.applyWind(windIntensity);
    }
}
