package main;

import main.Actors.AActor;
import main.Actors.ActorType1;
import main.Actors.ActorType2;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        final var actors = new ArrayList<AActor>();
        actors.add(new ActorType1());
        actors.add(new ActorType2());

        for (final var actor : actors)
            actor.doSomething();

        final var logger = Logger.getInstance();
        do {
            logger.showMessage(0);
            logger.deleteMessage(0);
        } while (logger.getMessage(0) != null);
    }
}
