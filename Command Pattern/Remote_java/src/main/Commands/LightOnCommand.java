package main.Commands;

import main.Targets.Light;

public final class LightOnCommand implements ICommand {
    private final Light light;

    public LightOnCommand(final Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        this.light.turnOn();
    }

    @Override
    public void undo() {
        this.light.turnOff();
    }

    @Override
    public String getName() {
        return "Turn on Light (" + light.getDescription() + ")";
    }
}
