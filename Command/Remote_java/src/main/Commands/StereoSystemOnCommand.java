package main.Commands;

import main.Targets.StereoSystem;

public final class StereoSystemOnCommand implements ICommand {
    private final StereoSystem stereoSystem;

    public StereoSystemOnCommand(final StereoSystem stereoSystem) {
        this.stereoSystem = stereoSystem;
    }

    @Override
    public void execute() {
        this.stereoSystem.turnOn();
    }

    @Override
    public void undo() {
        this.stereoSystem.turnOff();
    }

    @Override
    public String getName() {
        return "Turn on Stereo (" + stereoSystem.getDescription() + ")";
    }
}
