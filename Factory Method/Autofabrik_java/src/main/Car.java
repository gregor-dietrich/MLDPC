package main;

import main.Parts.ADoor;
import main.Parts.AHood;
import main.Parts.ALid;
import main.Parts.AWing;

public class Car {
    private ADoor door;
    private AHood hood;
    private ALid lid;
    private AWing wing;

    public Car(ADoor door, AHood hood, ALid lid, AWing wing) {
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

    private void setDoor(ADoor door) {
        this.door = door;
    }

    private AHood getHood() {
        return hood;
    }

    private void setHood(AHood hood) {
        this.hood = hood;
    }

    private ALid getLid() {
        return lid;
    }

    private void setLid(ALid lid) {
        this.lid = lid;
    }

    private AWing getWing() {
        return wing;
    }

    private void setWing(AWing wing) {
        this.wing = wing;
    }
}
