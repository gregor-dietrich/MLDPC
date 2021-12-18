package main;

public class Text {
    private String text;

    public Text(final String text) {
        this.setText(text);
    }

    @Override
    public String toString() {
        return this.text;
    }

    private void setText(final String text) {
        this.text = text;
    }
}
