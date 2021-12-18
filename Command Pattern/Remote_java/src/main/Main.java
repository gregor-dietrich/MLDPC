package main;

import main.Menus.Menu;
import main.Menus.MenuFactory;
import main.Remotes.Remote;
import main.Remotes.RemoteFactory;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
    private static final ArrayList<Menu> menus = new ArrayList<>();
    private static final Remote remote = RemoteFactory.makeDefaultRemote();

    public static void main(String[] args) {
        // Remote
        useRemote();

        // Menus
        menus.add(MenuFactory.makeCarMenu());
        menus.add(MenuFactory.makeSmartHomeMenu());
        mainLoop();
    }

    private static void useRemote() {
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

    private static void mainLoop() {
        System.out.println("""
                \n----------------------------------------
                Main Menu
                ----------------------------------------""");
        menus.stream().map(menu -> "(" + (menus.indexOf(menu) + 1) + ") " + menu.getName() + " Menu")
                .forEach(System.out::println);
        System.out.println("(0) Quit Application");
        System.out.println("Choose a menu by typing the number to its left:");
        var selectedMenu = waitForInput(menus.size());
        if (selectedMenu > 0)
            subLoop(selectedMenu);
        else {
            System.out.println("Exiting...");
            System.exit(0);
        }
    }

    private static void subLoop(final int menu) {
        menus.get(menu - 1).show();
        var selectedCommand = waitForInput(menus.get(menu - 1).getCommandCount());
        if (selectedCommand > 0) {
            menus.get(menu - 1).runCommand(selectedCommand - 1);
            subLoop(menu);
        }
        else {
            System.out.println("Returning to main menu...");
            mainLoop();
        }
    }

    private static int waitForInput(final int max) {
        final var reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            var input = Integer.parseInt(reader.readLine());
            if (input < 0 || input > max)
                throw new IllegalArgumentException();
            return input;
        }
        catch (IllegalArgumentException | IOException ignored) {
            System.out.println("Hmm... something went wrong. Please try again.");
            return waitForInput(max);
        }
    }
}
