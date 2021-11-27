package main.World;

import main.Fauna.AFauna;
import main.Fauna.CamelFauna;
import main.Floor.AFloor;
import main.Floor.SandFloor;
import main.Flora.AFlora;
import main.Flora.CactusFlora;

public final class DesertFactory extends AWorldFactory {
    @Override
    public AFauna createFauna() {
        return new CamelFauna();
    }

    @Override
    public AFloor createFloor() {
        return new SandFloor();
    }

    @Override
    public AFlora createFlora() {
        return new CactusFlora();
    }
}
