package main.Decorators;

import main.Text;

import java.util.Arrays;
import java.util.Objects;

public final class RemoveDuplicateDecorator extends ADecorator {
    public RemoveDuplicateDecorator(final String text) {
        super(text);
    }

    public RemoveDuplicateDecorator(final Text text) {
        super(text.toString());
    }

    @Override
    public String toString() {
        var str = Arrays.stream(super.toString().split(" ")).toList();
        var ret = new StringBuilder();
        for (final var word : str) {
            var retSplit = Arrays.stream(ret.toString().split(" ")).toList();
            if (!Objects.equals(retSplit.get(retSplit.size() - 1), word)) {
                if (!Objects.equals(retSplit.get(retSplit.size() - 1), word))
                    ret.append(word);
                if (str.indexOf(word) != str.size() - 1)
                    ret.append(" ");
            }
        }
        return ret.toString();
    }
}
