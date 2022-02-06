package main.Device;

public abstract class ADevice {
    private String description = "";
    private boolean on = false;

    public ADevice() {
        final var name = this.getClass().getName().split("\\.");
        this.setDescription(name[name.length - 1]);
    }

    public ADevice(final String description) {
        this.setDescription(description);
    }

    public void turnOn() {
        if (!this.isOn()) System.out.println(this.getDescription() + " turned on");
        this.setOn(true);
    }

    public void turnOff() {
        if (this.isOn()) System.out.println(this.getDescription() + " turned off");
        this.setOn(false);
    }

    public final String getDescription() {
        return description;
    }

    public final void setDescription(final String description) {
        this.description = description;
    }

    public final boolean isOn() {
        return on;
    }

    public final void setOn(final boolean on) {
        this.on = on;
    }

    @Override
    public final String toString() {
        return this.getDescription();
    }
}
