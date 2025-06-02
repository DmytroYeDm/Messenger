package org.example.messenger.messages;

public class SendMessageToUserMessage {
    private final String type = "sendMessage";
    private String userFrom;
    private String userTo;
    private String message;
    private String time;

    public SendMessageToUserMessage(String userFrom, String userTo, String message, String time) {
        this.userFrom = userFrom;
        this.userTo = userTo;
        this.message = message;
        this.time = time;
    }

    public String getType() {
        return type;
    }

    public String getUserFrom() {
        return userFrom;
    }

    public String getUserTo() {
        return userTo;
    }

    public String getMessage() {
        return message;
    }

    public String getTime() {
        return time;
    }
}
