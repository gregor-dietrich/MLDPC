package main.WaterPistolStates;

public final class WaterPistolEmptyState implements IWaterPistolState {
    @Override
    public IWaterPistolState reload(final int amount) {
        System.out.println("Reloaded " + amount + "ml!");
        return new WaterPistolReadyState();
    }

    @Override
    public IWaterPistolState shoot(final int amount) {
        System.out.println("Nothing happened (pistol is empty)");
        return this;
    }
}
