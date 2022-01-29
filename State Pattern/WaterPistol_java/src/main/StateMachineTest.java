package main;

import main.WaterPistolStates.WaterPistolEmptyState;
import main.WaterPistolStates.WaterPistolReadyState;

public class StateMachineTest {

    public static void main(String[] args) {
        final var waterPistol = new WaterPistol();

        // WaterPistolEmptyState
        if (!(waterPistol.getCurrentState() instanceof WaterPistolEmptyState)) throw new AssertionError();
        // 0ml
        if (waterPistol.getAmmo() != 0) throw new AssertionError();

        waterPistol.reload(500);

        // WaterPistolReadyState
        if (!(waterPistol.getCurrentState() instanceof WaterPistolReadyState)) throw new AssertionError();
        // 500ml
        if (waterPistol.getAmmo() != 500) throw new AssertionError();

        waterPistol.shoot();

        // 400ml
        if (waterPistol.getAmmo() != 400) throw new AssertionError();

        shootUntilEmpty(waterPistol);
        waterPistol.reload(100);

        // 100ml
        if (waterPistol.getAmmo() != 100) throw new AssertionError();

        waterPistol.shoot();
        waterPistol.reload(100);

        // 100ml
        if (waterPistol.getAmmo() != 150) throw new AssertionError();

        shootUntilEmpty(waterPistol);

        // WaterPistolEmptyState
        if (!(waterPistol.getCurrentState() instanceof WaterPistolEmptyState)) throw new AssertionError();
        // 0ml
        if (waterPistol.getAmmo() != 0) throw new AssertionError();

        waterPistol.reload(600);

        // WaterPistolEmptyState
        if (!(waterPistol.getCurrentState() instanceof WaterPistolEmptyState)) throw new AssertionError();
        // 0ml
        if (waterPistol.getAmmo() != 0) throw new AssertionError();

        waterPistol.shoot();
        waterPistol.shoot();

        // WaterPistolEmptyState
        if (!(waterPistol.getCurrentState() instanceof WaterPistolEmptyState)) throw new AssertionError();
        // 0ml
        if (waterPistol.getAmmo() != 0) throw new AssertionError();
    }

    private static void shootUntilEmpty(final WaterPistol waterPistol) {
        while (waterPistol.getAmmo() > 0) {
            // WaterPistolReadyState
            if (!(waterPistol.getCurrentState() instanceof WaterPistolReadyState)) throw new AssertionError();
            waterPistol.shoot();
        }
        // WaterPistolEmptyState
        if (!(waterPistol.getCurrentState() instanceof WaterPistolEmptyState)) throw new AssertionError();
        // 0ml
        if (waterPistol.getAmmo() != 0) throw new AssertionError();
    }
}
