package main.World;

import main.Fauna.AFauna;
import main.Floor.AFloor;
import main.Flora.AFlora;

public abstract class AWorldFactory {
    public World createWorld() {
        return new World(createFauna(), createFloor(), createFlora());
    }

    protected abstract AFauna createFauna();
    protected abstract AFloor createFloor();
    protected abstract AFlora createFlora();
}
