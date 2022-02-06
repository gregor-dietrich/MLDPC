package main.Device;

public final class Amplifier extends ADevice {
    private CDPlayer cd = null;
    private DVDPlayer dvd = null;
    private Tuner tuner = null;
    private int volume = 0;

    public Amplifier() {
        super();
    }

    public Amplifier(final String description) {
        super(description);
    }

    public CDPlayer getCd() {
        return cd;
    }

    public void setCd(final CDPlayer cd) {
        this.cd = cd;
    }

    public DVDPlayer getDvd() {
        return dvd;
    }

    public void setDvd(final DVDPlayer dvd) {
        this.dvd = dvd;
    }

    public Tuner getTuner() {
        return tuner;
    }

    public void setTuner(final Tuner tuner) {
        this.tuner = tuner;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(final int volume) {
        this.volume = Math.min(10, Math.max(volume, 0));
        System.out.println(this.getDescription() + " set volume to " + volume);
    }
}
