package main.TreeComponents;

import main.TreeComponents.LeafStates.*;

import java.util.Random;

public final class Leaf implements ITreeComponent {
    private ILeafState currentState;
    private int contactSurface;

    public Leaf() {
        final var rand = new Random();
        this.setContactSurface(rand.nextInt(11));

        final var rng = rand.nextInt(4);
        if (rng == 0)
            this.currentState = new LeafGreenHealthyState();
        else if (rng == 1)
            this.currentState = new LeafGreenSickState();
        else if (rng == 2)
            this.currentState = new LeafYellowHealthyState();
        else
            this.currentState = new LeafYellowSickState();
    }

    public void treatSickness() {
        this.currentState = currentState.treatSickness();
    }

    @Override
    public void applyWind(final int windIntensity) {
        this.currentState = this.currentState.applyWind(windIntensity);
    }

    @Override
    public int getContactSurface() {
        return this.contactSurface;
    }

    private void setContactSurface(final int contactSurface) {
        this.contactSurface = contactSurface;
    }

    public ILeafState getCurrentState() {
        return this.currentState;
    }
}
