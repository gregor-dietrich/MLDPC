package main;

import main.WaterPistolStates.IWaterPistolState;
import main.WaterPistolStates.WaterPistolEmptyState;

public final class WaterPistol {
    private IWaterPistolState currentState;
    private int ammo;
    private final int ammoMin;
    private final int ammoMax;

    public WaterPistol() {
        this(500);
    }

    public WaterPistol(final int ammoMax) {
        this.ammoMin = 0;
        this.ammoMax = ammoMax;
        this.setAmmo(this.ammoMin);
        this.currentState = new WaterPistolEmptyState();
    }

    public void reload(final int amount) {
        System.out.println("Attempting to reload " + amount + "ml...");
        /* Clamp overfilling instead of refusing to reload
        if (this.getAmmo() < this.ammoMax) {
            final var actualAmount = Math.max(0, Math.min(amount, this.ammoMax - this.getAmmo()));
            this.setAmmo(this.getAmmo() + actualAmount);
            this.currentState = currentState.reload(actualAmount);
        }
        else
            System.out.println("Nothing happened (ammo already at max)");
        */
        if ((this.getAmmo() + amount) <= this.ammoMax) {
            this.setAmmo(this.getAmmo() + amount);
            this.currentState = currentState.reload(amount);
        }
        else
            System.out.println("Nothing happened (cannot overfill ammo)");
    }

    public void shoot() {
        final int amount = (this.getAmmo() == this.ammoMax) ? 100 : 50;
        System.out.println("Attempting to shoot " + amount + "ml...");
        this.currentState = currentState.shoot(amount);
        if (this.getAmmo() >= amount) {
            this.setAmmo(this.getAmmo() - amount);
            this.currentState = (this.getAmmo() > this.ammoMin) ? this.currentState : new WaterPistolEmptyState();
        }
    }

    public int getAmmo() {
        return ammo;
    }

    private void setAmmo(final int ammo) {
        this.ammo = Math.max(this.ammoMin, Math.min(ammo, this.ammoMax));
    }

    public IWaterPistolState getCurrentState() {
        return this.currentState;
    }
}
