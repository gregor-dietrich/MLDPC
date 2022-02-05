package main.Commands;

import main.Targets.GarageDoor;

public final class GarageDoorCloseCommand implements ICommand {
    private final GarageDoor garageDoor;

    public GarageDoorCloseCommand(final GarageDoor garageDoor) {
        this.garageDoor = garageDoor;
    }

    @Override
    public void execute() {
        this.garageDoor.close();
    }

    @Override
    public void undo() {
        this.garageDoor.open();
    }

    @Override
    public String getName() {
        return "Close Garage Door (" + garageDoor.getDescription() + ")";
    }
}
