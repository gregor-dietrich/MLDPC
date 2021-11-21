package main;

import main.Parts.*;

public class limoPartsFactory extends APartsFactory {

    @Override
    protected APart createPart(partType t) {
        return switch (t) {
            case DOOR -> new LimoDoor();
            case HOOD -> new LimoHood();
            case LID -> new LimoLid();
            case WING -> new LimoWing();
        };
    }
}
