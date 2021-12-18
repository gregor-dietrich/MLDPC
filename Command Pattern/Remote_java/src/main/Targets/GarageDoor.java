package main.Targets;

public final class GarageDoor extends ATarget {
    private boolean open = false;

    public GarageDoor() {
        super();
    }

    public GarageDoor(final String description) {
        super(description);
    }

    public void open() {
        if (!isOpen())
            System.out.println(this + " has been opened.");
        this.setOpen(true);
    }

    public void close() {
        if (isOpen())
            System.out.println(this + " has been closed.");
        this.setOpen(false);
    }

    public boolean isOpen() {
        return open;
    }

    private void setOpen(final boolean open) {
        this.open = open;
    }
}
