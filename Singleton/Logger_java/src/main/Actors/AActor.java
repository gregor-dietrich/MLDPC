package main.Actors;

import main.Logger;

public abstract class AActor {
    private final Logger logger = Logger.getInstance();

    protected final void log(final String message) {
        logger.showMessageCount();
        logger.log(message);
        logger.showMessageCount();
        System.out.println();
    }

    public abstract void doSomething();
}
