package main.World;

import main.Fauna.AFauna;
import main.Floor.AFloor;
import main.Flora.AFlora;

public class World {
    private AFauna fauna;
    private AFloor floor;
    private AFlora flora;

    public World(AFauna fauna, AFloor floor, AFlora flora) {
        setFauna(fauna);
        setFloor(floor);
        setFlora(flora);
    }

    public AFauna getFauna() {
        return fauna;
    }

    public void setFauna(AFauna fauna) {
        this.fauna = fauna;
    }

    public AFloor getFloor() {
        return floor;
    }

    public void setFloor(AFloor floor) {
        this.floor = floor;
    }

    public AFlora getFlora() {
        return flora;
    }

    public void setFlora(AFlora flora) {
        this.flora = flora;
    }
}
