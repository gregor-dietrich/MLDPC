package main.Commands;

import main.Targets.StereoSystem;

public final class StereoSystemOffCommand implements ICommand {
    private final StereoSystem stereoSystem;

    public StereoSystemOffCommand(final StereoSystem stereoSystem) {
        this.stereoSystem = stereoSystem;
    }

    @Override
    public void execute() {
        this.stereoSystem.turnOff();
    }

    @Override
    public void undo() {
        this.stereoSystem.turnOn();
    }

    @Override
    public String getName() {
        return "Turn off Stereo (" + stereoSystem.getDescription() + ")";
    }
}
