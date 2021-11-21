package main.World;

import main.Fauna.AFauna;
import main.Fauna.CamelFauna;
import main.Floor.AFloor;
import main.Floor.SandFloor;
import main.Flora.AFlora;
import main.Flora.CactusFlora;

public class DesertFactory extends AWorldFactory {
    @Override
    protected AFauna createFauna() {
        return new CamelFauna();
    }

    @Override
    protected AFloor createFloor() {
        return new SandFloor();
    }

    @Override
    protected AFlora createFlora() {
        return new CactusFlora();
    }
}
