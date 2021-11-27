package main;

import main.Fauna.AFauna;
import main.Floor.AFloor;
import main.Flora.AFlora;
import main.World.AWorldFactory;
import main.World.World;

public final class Game {
    private AWorldFactory factory;
    private World world;

    public Game(final AWorldFactory factory) {
        this.setFactory(factory);
        this.createWorld();
    }

    public void createWorld() {
        AFauna fauna = this.getFactory().createFauna();
        AFloor floor = this.getFactory().createFloor();
        AFlora flora = this.getFactory().createFlora();
        this.setWorld(new World(fauna, floor, flora));
    }

    public void display() {
        String fauna = this.getWorld().getFauna().getClass().getName();
        String floor = this.getWorld().getFloor().getClass().getName();
        String flora = this.getWorld().getFlora().getClass().getName();

        System.out.println("Fauna: " + fauna);
        System.out.println("Floor: " + floor);
        System.out.println("Flora: " + flora);
    }

    public World getWorld() {
        return world;
    }

    private void setWorld(final World world) {
        this.world = world;
    }

    public AWorldFactory getFactory() {
        return factory;
    }

    public void setFactory(final AWorldFactory factory) {
        this.factory = factory;
    }
}
