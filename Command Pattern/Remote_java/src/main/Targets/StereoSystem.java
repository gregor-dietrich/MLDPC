package main.Targets;

public final class StereoSystem extends ATarget {
    private static final int VOLUME_MAX = 100;
    private boolean on = false;
    private int volume = 10;
    private audioSource currentMode = audioSource.TAPE;

    public StereoSystem() {
        super();
    }

    public StereoSystem(final String description) {
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

    public void play() {
        if (on)
            System.out.println(this + " is playing audio from " + this.currentMode.name()
                    + " at volume " + this.getVolume() + ".");
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(final int volume) {
        if (volume > 0)
            this.volume = Math.min(volume, VOLUME_MAX);
        else
            this.volume = 0;
    }

    public boolean isOn() {
        return on;
    }

    private void setOn(final boolean on) {
        this.on = on;
    }

    public audioSource getCurrentMode() {
        return currentMode;
    }

    public void setCurrentMode(final audioSource currentMode) {
        this.currentMode = currentMode;
    }

    public enum audioSource {AUX, CD, RADIO, TAPE, USB, VINYL}
}
