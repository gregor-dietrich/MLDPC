package main.Commands;

import main.Targets.GarageDoor;

public final class GarageDoorOpenCommand implements ICommand {
    private final GarageDoor garageDoor;

    public GarageDoorOpenCommand(final GarageDoor garageDoor) {
        this.garageDoor = garageDoor;
    }

    @Override
    public void execute() {
        this.garageDoor.open();
    }

    @Override
    public void undo() {
        this.garageDoor.close();
    }

    @Override
    public String getName() {
        return "Open Garage Door (" + garageDoor.getDescription() + ")";
    }
}
