package main;

import main.Device.*;

public final class HomeCinema {
    private Amplifier amp;
    private CDPlayer cd;
    private DVDPlayer dvd;
    private Lighting lights;
    private PopcornMaker popper;
    private Projector projector;
    private Screen screen;
    private Tuner tuner;

    public HomeCinema() {
        this.amp = new Amplifier();
        this.cd = new CDPlayer(this.amp);
        this.dvd = new DVDPlayer(this.amp);
        this.lights = new Lighting();
        this.popper = new PopcornMaker();
        this.projector = new Projector(this.dvd);
        this.screen = new Screen();
        this.tuner = new Tuner(this.amp);
    }

    public void playMovie(final String title) {
        System.out.println("Movie playback begin routine...");

        popper.turnOn();
        popper.start();

        lights.turnOn();
        lights.setIntensity(10);

        screen.unfurl();
        projector.turnOn();
        projector.setAspectRatio(Projector.aspectRatio.W16H9);

        amp.turnOn();
        amp.setVolume(5);

        dvd.turnOn();
        dvd.setMode(ADiscPlayer.soundMode.SURROUND);
        dvd.play(title);
    }

    public void stopMovie() {
        System.out.println("Movie playback end routine...");

        lights.setIntensity(100);
        popper.turnOff();
        screen.furl();
        projector.turnOff();
        amp.turnOff();

        dvd.stop();
        dvd.eject();
        dvd.turnOff();
    }

    public void playCD(final String title) {
        System.out.println("CD playback begin routine...");

        lights.turnOff();

        cd.turnOn();
        cd.setMode(ADiscPlayer.soundMode.STEREO);
        cd.play(title);

        amp.turnOn();
        amp.setVolume(6);
    }

    public void stopCD() {
        System.out.println("CD playback end routine...");

        lights.turnOn();
        amp.turnOff();

        cd.stop();
        cd.eject();
        cd.turnOff();
    }

    public void playRadio(final double frequency) {
        System.out.println("Radio playback begin routine...");

        tuner.turnOn();
        tuner.setFrequency(frequency);

        amp.turnOn();
        amp.setVolume(5);
    }

    public void stopRadio() {
        System.out.println("Radio playback end routine...");
        tuner.turnOff();
        amp.turnOff();
    }

    public Amplifier getAmp() {
        return amp;
    }

    public void setAmp(final Amplifier amp) {
        if (amp == null) throw new IllegalArgumentException();
        this.amp = amp;
        this.cd.setAmplifier(amp);
        this.dvd.setAmplifier(amp);
        this.tuner.setAmplifier(amp);
    }

    public CDPlayer getCd() {
        return cd;
    }

    public void setCd(final CDPlayer cd) {
        if (cd == null) throw new IllegalArgumentException();
        this.cd = cd;
    }

    public DVDPlayer getDvd() {
        return dvd;
    }

    public void setDvd(final DVDPlayer dvd) {
        if (dvd == null) throw new IllegalArgumentException();
        this.dvd = dvd;
        this.projector.setDVDPlayer(this.dvd);
    }

    public Lighting getLights() {
        return lights;
    }

    public void setLights(final Lighting lights) {
        if (lights == null) throw new IllegalArgumentException();
        this.lights = lights;
    }

    public PopcornMaker getPopper() {
        return popper;
    }

    public void setPopper(final PopcornMaker popper) {
        if (popper == null) throw new IllegalArgumentException();
        this.popper = popper;
    }

    public Projector getProjector() {
        return projector;
    }

    public void setProjector(final Projector projector) {
        if (projector == null) throw new IllegalArgumentException();
        this.projector = projector;
    }

    public Screen getScreen() {
        return screen;
    }

    public void setScreen(final Screen screen) {
        if (screen == null) throw new IllegalArgumentException();
        this.screen = screen;
    }

    public Tuner getTuner() {
        return tuner;
    }

    public void setTuner(final Tuner tuner) {
        if (tuner == null) throw new IllegalArgumentException();
        this.tuner = tuner;
    }
}
