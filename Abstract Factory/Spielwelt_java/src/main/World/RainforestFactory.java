package main.World;

import main.Fauna.AFauna;
import main.Fauna.FrogFauna;
import main.Floor.AFloor;
import main.Floor.DirtFloor;
import main.Flora.AFlora;
import main.Flora.TreeFlora;

public class RainforestFactory extends AWorldFactory {
    @Override
    public AFauna createFauna() {
        return new FrogFauna();
    }

    @Override
    public AFloor createFloor() {
        return new DirtFloor();
    }

    @Override
    public AFlora createFlora() {
        return new TreeFlora();
    }
}
