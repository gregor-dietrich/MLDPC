package main.Commands;

import main.Targets.StereoSystem;

public final class StereoSystemPlayCDCommand implements ICommand {
    private final StereoSystem stereoSystem;

    public StereoSystemPlayCDCommand(final StereoSystem stereoSystem) {
        this.stereoSystem = stereoSystem;
    }

    @Override
    public void execute() {
        this.stereoSystem.turnOn();
        this.stereoSystem.setCurrentMode(StereoSystem.audioSource.CD);
        this.stereoSystem.setVolume(10);
        this.stereoSystem.play();
    }

    @Override
    public void undo() {
        this.stereoSystem.turnOff();
    }

    @Override
    public String getName() {
        return "Play CD on Stereo (" + stereoSystem.getDescription() + ")";
    }
}
