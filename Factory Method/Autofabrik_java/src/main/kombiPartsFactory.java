package main;

import main.Parts.*;

public final class kombiPartsFactory extends APartsFactory {

    @Override
    protected APart createPart(final partType t) {
        return switch (t) {
            case DOOR -> new KombiDoor();
            case HOOD -> new KombiHood();
            case LID -> new KombiLid();
            case WING -> new KombiWing();
        };
    }
}
