package main;

import main.Parts.ADoor;
import main.Parts.AHood;
import main.Parts.ALid;
import main.Parts.AWing;

public final class CarFactory {
    private APartsFactory partsFactory;

    public CarFactory(final carType t) {
        switch (t) {
            case LIMO -> this.setPartsFactory(new limoPartsFactory());
            case KOMBI -> this.setPartsFactory(new kombiPartsFactory());
        }
    }

    public Car orderCar(final carColor color) {
        System.out.println(this.getPartsFactory().getClass().getName() + " stellt Teile her...");
        System.out.println();
        final var door = (ADoor) this.getPartsFactory().orderPart(APartsFactory.partType.DOOR, color);
        final var hood = (AHood) this.getPartsFactory().orderPart(APartsFactory.partType.HOOD, color);
        final var lid = (ALid) this.getPartsFactory().orderPart(APartsFactory.partType.LID, color);
        final var wing = (AWing) this.getPartsFactory().orderPart(APartsFactory.partType.WING, color);
        System.out.println("Das Fahrzeug wird zusammengebaut...");
        return new Car(door, hood, lid, wing);
    }

    private APartsFactory getPartsFactory() {
        return partsFactory;
    }

    private void setPartsFactory(final APartsFactory partsFactory) {
        this.partsFactory = partsFactory;
    }

    public enum carType {LIMO, KOMBI}

    public enum carColor {BLACK, BLUE, GREEN, ORANGE, PURPLE, RED, WHITE, YELLOW}
}
