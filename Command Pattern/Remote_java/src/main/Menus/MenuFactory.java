package main.Menus;

import main.Commands.*;
import main.Targets.GarageDoor;
import main.Targets.Light;
import main.Targets.StereoSystem;

public final class MenuFactory {
    public static Menu makeCarMenu() {
        final var garageDoor = new GarageDoor();
        final var menu = new Menu("Car");
        menu.addCommand(new GarageDoorOpenCommand(garageDoor));
        menu.addCommand(new GarageDoorCloseCommand(garageDoor));
        return menu;
    }

    public static Menu makeSmartHomeMenu() {
        final var stereoSystem = new StereoSystem("Living Room");
        final var light1 = new Light("Hallway");
        final var light2 = new Light("Kitchen");
        final var light3 = new Light("Bedroom");
        final var light4 = new Light("Living Room");

        final var menu = new Menu("Smart Home");
        menu.addCommand(new LightOnCommand(light1));
        menu.addCommand(new LightOffCommand(light1));
        menu.addCommand(new LightOnCommand(light2));
        menu.addCommand(new LightOffCommand(light2));
        menu.addCommand(new LightOnCommand(light3));
        menu.addCommand(new LightOffCommand(light3));
        menu.addCommand(new LightOnCommand(light4));
        menu.addCommand(new LightOffCommand(light4));
        menu.addCommand(new StereoSystemOnCommand(stereoSystem));
        menu.addCommand(new StereoSystemOffCommand(stereoSystem));
        menu.addCommand(new StereoSystemPlayCDCommand(stereoSystem));
        return menu;
    }
}
