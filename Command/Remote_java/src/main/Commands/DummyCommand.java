package main.Commands;

public final class DummyCommand implements ICommand {
    @Override
    public void execute() {
        System.out.println("Nothing happened.");
    }

    @Override
    public void undo() {
        System.out.println("Nothing happened.");
    }

    @Override
    public String getName() {
        return "N/A";
    }
}
