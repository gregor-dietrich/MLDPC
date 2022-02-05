package main;

import main.Classes.ACharacter;
import main.Classes.Ranger;
import main.Classes.SwampSpirit;
import main.Debuffs.AlcoholDebuff;
import main.Debuffs.ReverseDebuff;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        final var characters = new ArrayList<ACharacter>();
        characters.add(new Ranger(5, 7, 10, 3));
        characters.add(new SwampSpirit(4, 3, 10, 8));
        characters.add(new AlcoholDebuff(new Ranger(5, 7, 10, 3)));
        characters.add(new AlcoholDebuff(new SwampSpirit(4, 3, 10, 8)));
        characters.add(new ReverseDebuff(new Ranger(5, 7, 10, 3)));
        characters.add(new ReverseDebuff(new SwampSpirit(4, 3, 10, 8)));
        characters.add(new AlcoholDebuff(new ReverseDebuff(new Ranger(5, 7, 10, 3))));
        characters.add(new AlcoholDebuff(new ReverseDebuff(new SwampSpirit(4, 3, 10, 8))));
        characters.add(new ReverseDebuff(new AlcoholDebuff(new Ranger(5, 7, 10, 3))));
        characters.add(new ReverseDebuff(new AlcoholDebuff(new SwampSpirit(4, 3, 10, 8))));

        for (final var character : characters) {
            character.speak("Hello Earthlings!");
            character.move(Game.directions.NORTH, 5);
            character.move(Game.directions.SOUTH, 10);
            character.move(Game.directions.WEST, 15);
            character.move(Game.directions.EAST, 25);
        }
    }
}
