package main;

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
        final var fauna = this.getFactory().createFauna();
        final var floor = this.getFactory().createFloor();
        final var flora = this.getFactory().createFlora();

        this.setWorld(new World(fauna, floor, flora));
    }

    public void display() {
        final var faunaName = this.getWorld().getFauna().getClass().getName();
        final var floorName = this.getWorld().getFloor().getClass().getName();
        final var floraName = this.getWorld().getFlora().getClass().getName();

        System.out.println("Fauna: " + faunaName);
        System.out.println("Floor: " + floorName);
        System.out.println("Flora: " + floraName);
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
