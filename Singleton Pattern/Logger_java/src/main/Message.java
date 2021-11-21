package main;

import java.util.Calendar;
import java.util.Date;

public final class Message {
    private String text = "";
    private Date timestamp;

    public Message(String text) {
        this.setText(text);
        this.setTimestamp(Calendar.getInstance().getTime());
    }

    public String getText() {
        return text;
    }

    private void setText(String text) {
        this.text = text;
    }

    public Date getTimestamp() {
        return timestamp;
    }

    private void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }
}
