package org.example.messenger.messages;

public class GetChatMessagesMessage {
    private final String type = "getChatMessages";
    private String userFrom;
    private String userTo;

    public GetChatMessagesMessage(String userFrom, String userTo) {
        this.userFrom = userFrom;
        this.userTo = userTo;
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
}
