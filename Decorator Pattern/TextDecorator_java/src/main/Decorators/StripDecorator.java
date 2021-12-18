package main.Decorators;

public final class StripDecorator extends ADecorator {
    public StripDecorator(final String text) {
        super(text);
    }

    @Override
    public String toString() {
        var ret = super.toString();
        return ret.replaceAll("\\s+", " ").replaceAll("\\s+(?=\\p{Punct})", "");
    }
}
