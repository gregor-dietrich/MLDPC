package main;

import main.Classes.Ranger;
import main.Classes.SwampSpirit;
import main.Debuffs.AlcoholDebuff;
import main.Debuffs.ReverseDebuff;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        final var characters = new ArrayList<Character>();
        characters.add(new Ranger(new Character(6, 3, 10, 6)));
        characters.add(new SwampSpirit(new Character(4, 5, 10, 2)));
        characters.add(new AlcoholDebuff(characters.get(0)));
        characters.add(new AlcoholDebuff(characters.get(1)));
        characters.add(new ReverseDebuff(characters.get(0)));
        characters.add(new ReverseDebuff(characters.get(1)));
        characters.add(new AlcoholDebuff(new ReverseDebuff(characters.get(0))));
        characters.add(new AlcoholDebuff(new ReverseDebuff(characters.get(1))));
        characters.add(new ReverseDebuff(new AlcoholDebuff(characters.get(0))));
        characters.add(new ReverseDebuff(new AlcoholDebuff(characters.get(1))));

        for (final var character : characters) {
            character.speak("Hello Earthlings!");
            character.move(Game.directions.NORTH, 5);
            character.move(Game.directions.SOUTH, 10);
            character.move(Game.directions.WEST, 15);
            character.move(Game.directions.EAST, 25);
        }
    }
}
