package main;

import main.World.DesertFactory;
import main.World.PolarFactory;
import main.World.RainforestFactory;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        final ArrayList<Game> games = new ArrayList<>();
        games.add(new Game(new DesertFactory()));
        games.add(new Game(new PolarFactory()));
        games.add(new Game(new RainforestFactory()));

        for (var game : games) {
            System.out.println("Eigenschaften Spielwelt #" + (games.indexOf(game) + 1));
            game.display();
            System.out.println();
        }
    }
}
