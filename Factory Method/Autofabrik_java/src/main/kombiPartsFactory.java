package main;

import main.Parts.*;

public class kombiPartsFactory extends APartsFactory {

    @Override
    protected APart createPart(partType t) {
        return switch (t) {
            case DOOR -> new KombiDoor();
            case HOOD -> new KombiHood();
            case LID -> new KombiLid();
            case WING -> new KombiWing();
        };
    }
}
