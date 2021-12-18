package main;

import main.Commands.*;
import main.Targets.GarageDoor;
import main.Targets.Light;
import main.Targets.StereoSystem;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
    private static final ArrayList<Menu> menus = new ArrayList<>();

    public static void main(String[] args) {
        // Remote
        final var remote = new RemoteFactory().makeDefaultRemote();
        useRemote(remote);

        // Menus
        menus.add(makeCarMenu());
        menus.add(makeSmartHomeMenu());
        while (true) showMenus();
    }

    private static void useRemote(final Remote remote) {
        remote.useOnButton(0);
        remote.useUndoButton();
        remote.useOnButton(1);
        remote.useOnButton(2);
        remote.useUndoButton();
        remote.useUndoButton();
        remote.useUndoButton();
        remote.useOnButton(3);
        remote.useOffButton(3);
    }

    private static Menu makeCarMenu() {
        final var garageDoor = new GarageDoor();
        final var menu = new Menu("Car");
        menu.addCommand(new GarageDoorOpenCommand(garageDoor));
        menu.addCommand(new GarageDoorCloseCommand(garageDoor));
        return menu;
    }

    private static Menu makeSmartHomeMenu() {
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

    private static void showMenus() {
        System.out.println("""
                \n----------------------------------------
                Main Menu
                ----------------------------------------""");
        menus.stream().map(menu -> "(" + (menus.indexOf(menu) + 1) + ") " + menu.getName() + " Menu")
                .forEach(System.out::println);
        System.out.println("(0) Quit Application");
        System.out.println("Choose a menu by typing the number to its left:");
        var chosenMenu = waitForInput(menus.size());
        if (chosenMenu > 0) {
            var chosenCommand = -1;
            while (chosenCommand != 0) {
                menus.get(chosenMenu - 1).show();
                chosenCommand = waitForInput(menus.get(chosenMenu - 1).getCommandCount());
                if (chosenCommand > 0) {
                    menus.get(chosenMenu - 1).runCommand(chosenCommand - 1);
                }
            }
        } else
            System.exit(0);
    }

    private static int waitForInput(final int max) {
        final var reader = new BufferedReader(new InputStreamReader(System.in));
        var input = -1;
        try {
            input = Integer.parseInt(reader.readLine());
            if (!(input >= 0 && input <= max))
                throw new IOException();
        } catch (IOException | NumberFormatException ignored) {
            System.out.println("Hmm... something went wrong. Please try again.");
            return waitForInput(max);
        }
        return input;
    }
}
