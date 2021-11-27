package main.World;

import main.Fauna.AFauna;
import main.Fauna.PenguinFauna;
import main.Floor.AFloor;
import main.Floor.IceFloor;
import main.Flora.AFlora;
import main.Flora.BrushFlora;

public final class PolarFactory extends AWorldFactory {
    @Override
    public AFauna createFauna() {
        return new PenguinFauna();
    }

    @Override
    public AFloor createFloor() {
        return new IceFloor();
    }

    @Override
    public AFlora createFlora() {
        return new BrushFlora();
    }
}
