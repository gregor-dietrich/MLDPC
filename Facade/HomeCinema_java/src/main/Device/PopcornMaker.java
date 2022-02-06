package main.Device;

public final class PopcornMaker extends ADevice {
    public PopcornMaker() {
        super();
    }

    public PopcornMaker(final String description) {
        super(description);
    }

    public void start() {
        if (this.isOn()) System.out.println(this.getDescription() + " is making popcorn");
    }
}
