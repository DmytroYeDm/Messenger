package org.example.messenger.messages;

import java.time.LocalTime;

public class ServerIncomingMessage {
    private final String type = "incomingMessage";
    private String userFrom;
    private String messageText;
    private LocalTime time;

    public ServerIncomingMessage(String userFrom, String messageText, LocalTime time) {
        this.userFrom = userFrom;
        this.messageText = messageText;
        this.time = time;
    }

    public String getType() {
        return type;
    }

    public String getUserFrom() {
        return userFrom;
    }

    public String getMessageText() {
        return messageText;
    }

    public LocalTime getTime() {
        return time;
    }
}
