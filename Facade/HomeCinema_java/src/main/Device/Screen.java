package main.Device;

public final class Screen extends ADevice {
    public Screen() {
        super();
    }

    public Screen(final String description) {
        super(description);
    }

    @Override
    public void turnOn() {
        this.turnOff();
    }

    @Override
    public void turnOff() {
        System.out.println("Nothing happened with " + this.getDescription());
    }

    public void furl() {
        if (this.isOn()) System.out.println(this.getDescription() + " furled");
        this.setOn(false);
    }

    public void unfurl() {
        if (!this.isOn()) System.out.println(this.getDescription() + " unfurled");
        this.setOn(true);
    }
}
