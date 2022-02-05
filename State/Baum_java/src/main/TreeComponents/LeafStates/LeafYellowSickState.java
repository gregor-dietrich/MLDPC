package main.TreeComponents.LeafStates;

public final class LeafYellowSickState implements ILeafState {
    @Override
    public ILeafState applyWind(final int windIntensity) {
        return this;
    }

    @Override
    public ILeafState treatSickness() {
        return this;
    }
}
