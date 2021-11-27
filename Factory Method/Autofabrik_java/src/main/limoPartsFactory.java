package main;

import main.Parts.*;

public final class limoPartsFactory extends APartsFactory {

    @Override
    protected APart createPart(final partType t) {
        return switch (t) {
            case DOOR -> new LimoDoor();
            case HOOD -> new LimoHood();
            case LID -> new LimoLid();
            case WING -> new LimoWing();
        };
    }
}
