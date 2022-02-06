package main.Device;

public final class Projector extends ADevice {
    private aspectRatio ratio = null;
    private DVDPlayer dvdPlayer;

    public Projector(final DVDPlayer dvdPlayer) {
        super();
        this.ratio = aspectRatio.W16H9;
        this.dvdPlayer = dvdPlayer;
    }

    public Projector(final String description, final DVDPlayer dvdPlayer) {
        this(dvdPlayer);
        this.setDescription(description);
    }

    public aspectRatio getAspectRatio() {
        return ratio;
    }

    public void setAspectRatio(final aspectRatio ratio) {
        if (this.isOn()) {
            this.ratio = ratio;
            System.out.println("Aspect ratio set to " + ratio);
        }
    }

    public DVDPlayer getDVDPlayer() {
        return dvdPlayer;
    }

    public void setDVDPlayer(final DVDPlayer dvdPlayer) {
        this.dvdPlayer = dvdPlayer;
    }

    public enum aspectRatio {W4H3, W16H9, W16H10, W5H3, W2H1, W19H10, W21H9, W37H20}
}
