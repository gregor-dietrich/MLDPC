package main.Remotes;

import main.Commands.DummyCommand;
import main.Commands.ICommand;

import java.util.Stack;
import java.util.stream.IntStream;

public final class Remote {
    private final int buttonCount = 7;
    private final ICommand[] onButtons = new ICommand[buttonCount];
    private final ICommand[] offButtons = new ICommand[buttonCount];
    private final Stack<ICommand> undoHistory = new Stack<>();
    private final Stack<ICommand> redoHistory = new Stack<>();

    public Remote() {
        this.resetRemote();
    }

    public void resetRemote() {
        IntStream.range(0, this.buttonCount).forEach(this::resetButton);
    }

    public void resetButton(final int pos) {
        this.setButton(pos, new DummyCommand(), new DummyCommand());
    }

    public void setButton(final int pos, final ICommand onCommand, final ICommand offCommand) {
        this.onButtons[pos] = onCommand;
        this.offButtons[pos] = offCommand;
    }

    public void useOnButton(final int pos) {
        if (pos < this.buttonCount) {
            System.out.print("On Button " + (pos + 1) + " pressed: ");
            this.onButtons[pos].execute();
            undoHistory.push(this.onButtons[pos]);
        } else
            System.out.println("On Button " + (pos + 1) + " not found: Remote has " + this.buttonCount + " buttons.");
    }

    public void useOffButton(final int pos) {
        if (pos < this.buttonCount) {
            System.out.print("Off Button " + (pos + 1) + " pressed: ");
            this.offButtons[pos].execute();
            undoHistory.push(this.offButtons[pos]);
        } else
            System.out.println("Off Button " + (pos + 1) + " not found: Remote has " + this.buttonCount + " buttons.");
    }

    public void useUndoButton() {
        System.out.print("Undo Button pressed: ");
        if (!undoHistory.empty()) {
            var undoneCmd = undoHistory.pop();
            undoneCmd.undo();
            redoHistory.push(undoneCmd);
        } else
            System.out.println("Nothing to undo.");
    }

    public void useRedoButton() {
        System.out.print("Redo Button pressed: ");
        if (!redoHistory.empty()) {
            var redoneCmd = redoHistory.pop();
            redoneCmd.execute();
            undoHistory.push(redoneCmd);
        } else
            System.out.println("Nothing to redo.");
    }
}
