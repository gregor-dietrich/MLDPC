package main.Device;

public final class DVDPlayer extends ADiscPlayer {
    public DVDPlayer(final Amplifier amplifier) {
        super(amplifier);
    }

    public DVDPlayer(final String description, final Amplifier amplifier) {
        super(description, amplifier);
    }

    @Override
    public void setAmplifier(final Amplifier amplifier) {
        super.setAmplifier(amplifier);
        this.getAmplifier().setDvd(this);
    }
}
