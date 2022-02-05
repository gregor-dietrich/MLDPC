package main.TreeComponents.LeafStates;

public interface ILeafState {
    ILeafState applyWind(final int windIntensity);
    ILeafState treatSickness();
}
