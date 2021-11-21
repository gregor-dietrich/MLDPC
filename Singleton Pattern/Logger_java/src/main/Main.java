package main;

import main.Actors.AActor;
import main.Actors.ActorType1;
import main.Actors.ActorType2;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        ArrayList<AActor> actors = new ArrayList<>();
        actors.add(new ActorType1());
        actors.add(new ActorType2());

        for (var actor : actors)
            actor.doSomething();

        var logger = Logger.getInstance();
        do {
            logger.showMessage(0);
            logger.deleteMessage(0);
        } while (logger.getMessage(0) != null);
    }
}
