package main.Decorators;

import main.Text;

import java.util.Locale;

public final class UpperCaseDecorator extends ADecorator {
    public UpperCaseDecorator(final String text) {
        super(text);
    }

    public UpperCaseDecorator(final Text text) {
        super(text.toString());
    }

    @Override
    public String toString() {
        return super.toString().toUpperCase(Locale.ROOT);
    }
}
