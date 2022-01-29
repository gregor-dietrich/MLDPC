package main.WaterPistolStates;

public interface IWaterPistolState {
    IWaterPistolState reload(final int amount);

    IWaterPistolState shoot(final int amount);
}
