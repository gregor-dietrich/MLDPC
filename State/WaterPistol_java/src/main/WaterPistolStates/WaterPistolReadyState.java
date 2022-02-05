package main.WaterPistolStates;

public final class WaterPistolReadyState implements IWaterPistolState {
    @Override
    public IWaterPistolState reload(final int amount) {
        System.out.println("Reloaded " + amount + "ml!");
        return this;
    }

    @Override
    public IWaterPistolState shoot(final int amount) {
        System.out.println("Fired " + amount + "ml!");
        return this;
    }
}
