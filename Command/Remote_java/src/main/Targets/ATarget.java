package main.Targets;

public abstract class ATarget {
    private String description;

    public ATarget() {
        this("Unnamed");
    }

    public ATarget(final String description) {
        this.setDescription(description);
    }

    public final String toString() {
        final var name = this.getClass().getName().split("\\.");
        return name[name.length - 1];
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
