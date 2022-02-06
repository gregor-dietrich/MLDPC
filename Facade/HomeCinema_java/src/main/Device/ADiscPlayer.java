package main.Device;

public abstract class ADiscPlayer extends ADevice {
    private Amplifier amplifier = null;
    private String currentTitle = "";
    private int currentTrack = 0;
    private soundMode mode = ADiscPlayer.soundMode.STEREO;

    public ADiscPlayer(final Amplifier amplifier) {
        super();
        this.setAmplifier(amplifier);
    }

    public ADiscPlayer(final String description, final Amplifier amplifier) {
        this(amplifier);
        this.setDescription(description);
    }

    public final void eject() {
        if (this.isOn()) System.out.println(this.getDescription() + " ejected disc");
    }

    public final void stop() {
        if (this.isOn()) {
            this.setCurrentTrack(0);
            System.out.println(this.getDescription() + " stopped playback of " + currentTitle);
        }
    }

    public final void pause() {
        if (this.isOn()) System.out.println(this.getDescription() + " paused playback of " + currentTitle);
    }

    public final void play(final String title) {
        if (this.isOn()) {
            this.currentTitle = title;
            this.setCurrentTrack(0);
            System.out.println(this.getDescription() + " is playing " + title);
        }
    }

    public final void play(final int track) {
        if (this.isOn()) {
            if (track <= 0) throw new IllegalArgumentException();
            if (currentTitle == null || currentTitle.equals(""))
                System.out.println(this.getDescription() + " cannot play track #" + track + ", no disc inserted.");
            else {
                this.setCurrentTrack(track);
                System.out.println(this.getDescription() + " is playing track #" + track + " of " + currentTitle);
            }
        }
    }

    public final Amplifier getAmplifier() {
        return amplifier;
    }

    public void setAmplifier(final Amplifier amplifier) {
        this.amplifier = amplifier;
    }

    public final String getCurrentTitle() {
        return currentTitle;
    }

    public final void setCurrentTitle(final String currentTitle) {
        if (this.isOn()) this.currentTitle = currentTitle;
    }

    public final int getCurrentTrack() {
        return currentTrack;
    }

    public final void setCurrentTrack(final int currentTrack) {
        if (this.isOn()) {
            if (currentTrack < 0) throw new IllegalArgumentException();
            this.currentTrack = currentTrack;
        }
    }

    public soundMode getMode() {
        return mode;
    }

    public void setMode(final soundMode mode) {
        if (this.isOn()) {
            this.mode = mode;
            System.out.println("Sound mode set to " + mode);
        }
    }

    public enum soundMode { HEADPHONE, STEREO, SURROUND }
}
