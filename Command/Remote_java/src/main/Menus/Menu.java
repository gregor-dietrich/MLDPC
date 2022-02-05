package main.Menus;

import main.Commands.ICommand;

import java.util.ArrayList;

public final class Menu {
    private final ArrayList<ICommand> commands;
    private String name;

    public Menu() {
        this("");
    }

    public Menu(final String name) {
        this.setName(name);
        this.commands = new ArrayList<>();
    }

    public void show() {
        System.out.println("\n----------------------------------------\n" +
                this.getName() + " Menu\n" +
                "----------------------------------------");
        commands.stream().map(command -> "(" + (commands.indexOf(command) + 1) + ") "
                + command.getName()).forEach(System.out::println);
        System.out.println("(0) Back");
        System.out.println("Execute a command by typing the number to its left:");
    }

    public boolean runCommand(final int index) {
        if (index >= 0 && index < this.getCommandCount())
            this.commands.get(index).execute();
        else
            return false;
        return true;
    }

    public boolean addCommand(final ICommand command) {
        return this.commands.add(command);
    }

    public boolean removeCommand(final ICommand command) {
        return this.commands.remove(command);
    }

    public int getCommandCount() {
        return this.commands.size();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
