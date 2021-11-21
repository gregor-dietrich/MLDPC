package main;

import main.World.AWorldFactory;
import main.World.World;

public class Game {
    private AWorldFactory factory;
    private World world;

    public Game(World world) { this.setWorld(world); }

    public Game(AWorldFactory factory) {
        this.setFactory(factory);
        this.setWorld(this.getFactory().createWorld());
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

    public void setWorld(World world) {
        this.world = world;
    }

    public AWorldFactory getFactory() { return factory; }

    public void setFactory(AWorldFactory factory) { this.factory = factory; }
}
