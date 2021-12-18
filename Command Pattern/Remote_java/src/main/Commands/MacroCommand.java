package main.Commands;

import java.util.ArrayList;

public final class MacroCommand implements ICommand {
    private final ArrayList<ICommand> commands = new ArrayList<>();

    public boolean add(final ICommand command) {
        return this.commands.add(command);
    }

    public boolean remove(final ICommand command) {
        return this.commands.remove(command);
    }

    @Override
    public void execute() {
        System.out.println("Executing MacroCommand:");
        this.commands.forEach(ICommand::execute);
    }

    @Override
    public void undo() {
        System.out.println("Undoing MacroCommand:");
        this.commands.forEach(ICommand::undo);
    }

    @Override
    public String getName() {
        return "MacroCommand";
    }
}
