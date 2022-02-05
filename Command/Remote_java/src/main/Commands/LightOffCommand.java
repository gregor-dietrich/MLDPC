package main.Commands;

import main.Targets.Light;

public final class LightOffCommand implements ICommand {
    private final Light light;

    public LightOffCommand(final Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        this.light.turnOff();
    }

    @Override
    public void undo() {
        this.light.turnOn();
    }

    @Override
    public String getName() {
        return "Turn off Light (" + light.getDescription() + ")";
    }
}
