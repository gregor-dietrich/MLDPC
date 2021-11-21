package main.World;

import main.Fauna.AFauna;
import main.Floor.AFloor;
import main.Flora.AFlora;

public abstract class AWorldFactory {
    public abstract AFauna createFauna();

    public abstract AFloor createFloor();

    public abstract AFlora createFlora();
}
