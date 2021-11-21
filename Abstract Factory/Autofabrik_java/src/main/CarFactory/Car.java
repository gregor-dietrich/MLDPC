package main.CarFactory;

import main.Door.ADoor;
import main.Hood.AHood;
import main.Lid.ALid;
import main.Wing.AWing;

public class Car {
    private ADoor door;
    private AHood hood;
    private ALid lid;
    private AWing wing;

    public Car(ADoor door, AHood hood, ALid lid, AWing wing) {
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

    public void setDoor(ADoor door) {
        this.door = door;
    }

    public AHood getHood() {
        return hood;
    }

    public void setHood(AHood hood) {
        this.hood = hood;
    }

    public ALid getLid() {
        return lid;
    }

    public void setLid(ALid lid) {
        this.lid = lid;
    }

    public AWing getWing() {
        return wing;
    }

    public void setWing(AWing wing) {
        this.wing = wing;
    }
}
