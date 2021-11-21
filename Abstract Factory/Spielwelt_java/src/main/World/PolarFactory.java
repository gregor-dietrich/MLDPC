package main.World;

import main.Fauna.AFauna;
import main.Fauna.PenguinFauna;
import main.Floor.AFloor;
import main.Floor.IceFloor;
import main.Flora.AFlora;
import main.Flora.BrushFlora;

public class PolarFactory extends AWorldFactory {
    @Override
    protected AFauna createFauna() {
        return new PenguinFauna();
    }

    @Override
    protected AFloor createFloor() {
        return new IceFloor();
    }

    @Override
    protected AFlora createFlora() {
        return new BrushFlora();
    }
}
