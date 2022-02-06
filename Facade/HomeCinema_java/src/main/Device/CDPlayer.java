package main.Device;

public final class CDPlayer extends ADiscPlayer {
    public CDPlayer(final Amplifier amplifier) {
        super(amplifier);
    }

    public CDPlayer(final String description, final Amplifier amplifier) {
        super(description, amplifier);
    }

    @Override
    public void setAmplifier(final Amplifier amplifier) {
        super.setAmplifier(amplifier);
        this.getAmplifier().setCd(this);
    }
}
