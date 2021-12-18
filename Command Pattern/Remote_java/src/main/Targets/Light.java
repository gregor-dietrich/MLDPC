package main.Targets;

public final class Light extends ATarget {
    private boolean on = false;

    public Light() {
        super();
    }

    public Light(final String description) {
        super(description);
    }

    public void turnOn() {
        if (!isOn())
            System.out.println(this + " has been turned on.");
        this.setOn(true);
    }

    public void turnOff() {
        if (isOn())
            System.out.println(this + " has been turned off.");
        this.setOn(false);
    }

    public boolean isOn() {
        return on;
    }

    private void setOn(final boolean on) {
        this.on = on;
    }
}
