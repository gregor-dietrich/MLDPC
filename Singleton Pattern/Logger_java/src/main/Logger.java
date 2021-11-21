package main;

import org.jetbrains.annotations.Nullable;

import java.util.ArrayList;

public final class Logger {
    private final ArrayList<Message> messages;

    private static class Holder {
        private static final Logger INSTANCE = new Logger();
    }

    public static Logger getInstance() {
        return Holder.INSTANCE;
    }

    private Logger() {
        this.messages = new ArrayList<>();
    }

    public void log(final String message) {
        this.messages.add(new Message(message));
        System.out.println(message);
    }

    private int getMessageCount() {
        return this.messages.size();
    }

    public void showMessageCount() {
        System.out.println("Logged messages: " + this.getMessageCount());
    }

    public @Nullable
    Message getMessage(final int index) {
        @Nullable Message result;
        if (index < this.getMessageCount())
            result = this.messages.get(index);
        else
            result = null;
        return result;
    }

    public boolean deleteMessage(final int index) {
        boolean result = false;
        if (index < this.getMessageCount()) {
            this.messages.remove(index);
            result = true;
        }
        return result;
    }

    public void showMessage(final int index) {
        if (index < this.getMessageCount()) {
            System.out.println(this.getMessage(index).getTimestamp());
            System.out.println(this.getMessage(index).getText());
        } else
            System.out.println("ERROR: Invalid Index (out of range)");
        System.out.println();
    }
}
