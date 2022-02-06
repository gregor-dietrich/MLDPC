package main.Device;

public final class Tuner extends ADevice {
    private Amplifier amplifier = null;
    private double frequency = 0;

    public Tuner(final Amplifier amplifier) {
        super();
        this.setAmplifier(amplifier);
    }

    public Tuner(final String description, final Amplifier amplifier) {
        this(amplifier);
        this.setDescription(description);
    }

    public Amplifier getAmplifier() {
        return amplifier;
    }

    public void setAmplifier(final Amplifier amplifier) {
        this.amplifier = amplifier;
        amplifier.setTuner(this);
    }

    public double getFrequency() {
        return frequency;
    }

    public void setFrequency(final double frequency) {
        if (this.isOn()) {
            if (frequency < 87.5 || frequency > 108) throw new IllegalArgumentException();
            this.frequency = frequency;
            System.out.println(this.getDescription() + " sets frequency to " + frequency);
        }
    }
}
