package main.Decorators;

import main.Text;

public final class FrameAsteriskDecorator extends ADecorator {
    public FrameAsteriskDecorator(final String text) {
        super(text);
    }

    public FrameAsteriskDecorator(final Text text) {
        super(text.toString());
    }

    @Override
    public String toString() {
        return "*" + super.toString() + "*";
    }
}
