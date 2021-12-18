package main;

import main.Decorators.FrameAsteriskDecorator;
import main.Decorators.RemoveDuplicateDecorator;
import main.Decorators.StripDecorator;
import main.Decorators.UpperCaseDecorator;

import java.util.ArrayList;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) {
        final var testStrings = new ArrayList<String>();
        testStrings.add("Hello Mercury!");
        testStrings.add("Hello   Venus      .");
        testStrings.add("Hello Hell, Hello Hello World, this is is is Mars speaking.");
        testStrings.add("Hello Jupiter!");
        testStrings.add("Hello  Saturn, Hello    Hello   Neptune , this is is is Uranus speaking   .");

        final var decoratedStrings = new ArrayList<Text>();
        decoratedStrings.add(new UpperCaseDecorator(testStrings.get(0)));
        decoratedStrings.add(new StripDecorator(testStrings.get(1)));
        decoratedStrings.add(new RemoveDuplicateDecorator(testStrings.get(2)));
        decoratedStrings.add(new FrameAsteriskDecorator(testStrings.get(3)));
        decoratedStrings.add(new UpperCaseDecorator(new FrameAsteriskDecorator(new RemoveDuplicateDecorator(
                new StripDecorator(testStrings.get(4))))));

        IntStream.range(0, Math.min(testStrings.size(), decoratedStrings.size())).mapToObj(
                i -> testStrings.get(i) + "\n" + decoratedStrings.get(i) + "\n").forEach(System.out::println);
    }
}
