package main.World;

import main.Fauna.AFauna;
import main.Floor.AFloor;
import main.Flora.AFlora;

public final class World {
    private AFauna fauna;
    private AFloor floor;
    private AFlora flora;

    public World(final AFauna fauna, final AFloor floor, final AFlora flora) {
        setFauna(fauna);
        setFloor(floor);
        setFlora(flora);
    }

    public AFauna getFauna() {
        return fauna;
    }

    public void setFauna(final AFauna fauna) {
        this.fauna = fauna;
    }

    public AFloor getFloor() {
        return floor;
    }

    public void setFloor(final AFloor floor) {
        this.floor = floor;
    }

    public AFlora getFlora() {
        return flora;
    }

    public void setFlora(final AFlora flora) {
        this.flora = flora;
    }
}
