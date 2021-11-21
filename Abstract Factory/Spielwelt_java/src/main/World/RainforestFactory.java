package main.World;

import com.sun.source.tree.Tree;
import main.Fauna.AFauna;
import main.Fauna.FrogFauna;
import main.Floor.AFloor;
import main.Floor.DirtFloor;
import main.Flora.AFlora;
import main.Flora.TreeFlora;

public class RainforestFactory extends AWorldFactory {
    @Override
    protected AFauna createFauna() {
        return new FrogFauna();
    }

    @Override
    protected AFloor createFloor() {
        return new DirtFloor();
    }

    @Override
    protected AFlora createFlora() {
        return new TreeFlora();
    }
}
