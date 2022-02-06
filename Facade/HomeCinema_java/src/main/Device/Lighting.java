package main.Device;

public final class Lighting extends ADevice {
    private int intensity = 0;

    public Lighting() {
        super();
    }

    public Lighting(final String description) {
        super(description);
    }

    public int getIntensity() {
        return intensity;
    }

    public void setIntensity(final int intensity) {
        if (this.isOn()) {
            this.intensity = Math.min(100, Math.max(intensity, 0));
            if (this.intensity <= 0) this.turnOff();
            else System.out.println(this.getDescription() + " set to " + intensity + "%");
        }
    }
}
