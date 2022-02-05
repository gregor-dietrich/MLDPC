package main.Commands;

public interface ICommand {
    void execute();

    void undo();

    String getName();
}
