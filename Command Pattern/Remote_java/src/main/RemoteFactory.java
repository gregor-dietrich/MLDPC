package main;

import main.Commands.*;
import main.Targets.GarageDoor;
import main.Targets.Light;
import main.Targets.StereoSystem;

public final class RemoteFactory {
    public Remote makeDefaultRemote() {
        // Targets
        final var garageDoor = new GarageDoor();
        final var corridorLight = new Light("Corridor");
        final var stereoSystem = new StereoSystem("Living Room");

        // Commands
        final var garageOpenCmd = new GarageDoorOpenCommand(garageDoor);
        final var garageCloseCmd = new GarageDoorCloseCommand(garageDoor);
        final var lightsOnCmd = new LightOnCommand(corridorLight);
        final var lightsOffCmd = new LightOffCommand(corridorLight);
        final var stereoPlayCDCmd = new StereoSystemPlayCDCommand(stereoSystem);
        final var stereoOffCmd = new StereoSystemOffCommand(stereoSystem);

        // MacroCommands
        final var macroOnCmd = new MacroCommand();
        macroOnCmd.add(lightsOnCmd);
        macroOnCmd.add(garageOpenCmd);
        macroOnCmd.add(stereoPlayCDCmd);
        final var macroOffCmd = new MacroCommand();
        macroOffCmd.add(lightsOffCmd);
        macroOffCmd.add(garageCloseCmd);
        macroOffCmd.add(stereoOffCmd);

        // Remote
        final var r = new Remote();
        r.setButton(0, lightsOnCmd, lightsOffCmd);
        r.setButton(1, garageOpenCmd, garageCloseCmd);
        r.setButton(2, stereoPlayCDCmd, stereoOffCmd);
        r.setButton(3, macroOnCmd, macroOffCmd);
        return r;
    }
}
