package main;

import main.Parts.ADoor;
import main.Parts.AHood;
import main.Parts.ALid;
import main.Parts.AWing;

public final class Car {
    private ADoor door;
    private AHood hood;
    private ALid lid;
    private AWing wing;

    public Car(final ADoor door, final AHood hood, final ALid lid, final AWing wing) {
        this.setDoor(door);
        this.setHood(hood);
        this.setLid(lid);
        this.setWing(wing);
        System.out.println("Fahrzeug fertiggestellt.");
        System.out.println();
    }

    private ADoor getDoor() {
        return door;
    }

    private void setDoor(final ADoor door) {
        this.door = door;
    }

    private AHood getHood() {
        return hood;
    }

    private void setHood(final AHood hood) {
        this.hood = hood;
    }

    private ALid getLid() {
        return lid;
    }

    private void setLid(final ALid lid) {
        this.lid = lid;
    }

    private AWing getWing() {
        return wing;
    }

    private void setWing(final AWing wing) {
        this.wing = wing;
    }
}
