package main.CarFactory;

import main.Door.ADoor;
import main.Hood.AHood;
import main.Lid.ALid;
import main.Wing.AWing;

public final class Car {
    private ADoor door;
    private AHood hood;
    private ALid lid;
    private AWing wing;

    public Car(final ADoor door, final AHood hood, final ALid lid, final AWing wing) {
        setDoor(door);
        setHood(hood);
        setLid(lid);
        setWing(wing);
    }

    public void display() {
        System.out.println("Door: " + this.getDoor().getClass().getName() + " (" + this.getDoor().getColor() + ")");
        System.out.println("Hood: " + this.getHood().getClass().getName() + " (" + this.getHood().getColor() + ")");
        System.out.println("Lid: " + this.getLid().getClass().getName() + " (" + this.getLid().getColor() + ")");
        System.out.println("Wing: " + this.getWing().getClass().getName() + " (" + this.getWing().getColor() + ")");
        System.out.println();
    }

    public ADoor getDoor() {
        return door;
    }

    public void setDoor(final ADoor door) {
        this.door = door;
    }

    public AHood getHood() {
        return hood;
    }

    public void setHood(final AHood hood) {
        this.hood = hood;
    }

    public ALid getLid() {
        return lid;
    }

    public void setLid(final ALid lid) {
        this.lid = lid;
    }

    public AWing getWing() {
        return wing;
    }

    public void setWing(final AWing wing) {
        this.wing = wing;
    }
}
